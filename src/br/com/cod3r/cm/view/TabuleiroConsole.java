package br.com.cod3r.cm.view;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.cod3r.cm.exception.ExplosaoException;
import br.com.cod3r.cm.exception.SairException;
import br.com.cod3r.cm.model.Tabuleiro;

public class TabuleiroConsole {
	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);

	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		
		executarJogo();
	}
	
	private void executarJogo(){
		try {
			
			boolean continuar = true;
			
			while(continuar) {
				cicloDoJogo();
				
				
				System.out.println("Outra partida? (S/n)");
				String resposta = entrada.nextLine();
				
				if("n".equalsIgnoreCase(resposta)) {
					continuar = false;
					
				}else {
					tabuleiro.reniciar();
				}
			}
			
		} catch (SairException e) {
			System.out.println("Saiu do Jogo");
		} finally {
			entrada.close();
		}
	}

	private void cicloDoJogo() {
		try {
			
			while(!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);
				
				String digitado = capturarValorDigitado("Digite (X, Y): ");
				Iterator<Integer> x_y =  Arrays.stream(digitado.split(",")).map(e -> Integer.parseInt(e.trim())).iterator();
				
				digitado = capturarValorDigitado("1 - Abrir ou 2 - (Des)Marcar: ");
				
				if("1".equals(digitado)) {
					tabuleiro.abrir(x_y.next(), x_y.next());
					
				}else if("2".equals(digitado)) {
					tabuleiro.alternarMarcacao(x_y.next(), x_y.next());
				}
				
			}
			System.out.println("Voce ganhou!!");
			
		} catch (ExplosaoException e) {
			System.out.println(tabuleiro);
			System.out.println("Voce Perdeu!");
		}
		
	}
	
	private String capturarValorDigitado(String texto) {
		System.out.print(texto);
		String digitado = entrada.nextLine();
		
		if("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}
		
		return digitado;
		
	}
	
}
