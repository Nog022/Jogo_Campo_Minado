Este é um projeto que fiz como parte do curso da Cod3r para aprendizado. O jogo é o famoso campo minado é jogado diretamente no console. O projeto foi desenvolvido em Java 8 e alguns testes unitários foram realizados com JUnit 5.

Como jogar:

Bom, para iniciar tem que ir no arquivo main do projeto, possui o nome "Aplicacao.java" e setar 3 valores, a linha, coluna e a quantidade de bombas que vão ter no jogo.

Inicialmente vai aparecer uma matriz com os parâmetros colocado na "Aplicacao.java" 

Exemplo abaixo foi utilizado esses parâmetros --> 6,6,6

![image](https://user-images.githubusercontent.com/87150096/230779760-4c03c5ab-bfc3-4d29-9c60-53070d91fc55.png)


Explicação dos ícones no console
"x" --> E quando quiser marcar algum campo para sinalizar que há uma bomba naquele campo, vai ser utilizado esse "x", se for marcado o campo, só pode abrir se desmarcar ele.
"?" --> São os campos que não foram abertos.
"*" --> Irá aparecer quando algum campo estiver aberto e possuir alguma mina dentro dele.
" " --> Se um espaço estiver vazio, significa que um campo foi aberto e não há bombas ao seu redor.

 
![image](https://user-images.githubusercontent.com/87150096/230779779-d540fef1-7836-4474-bb61-4132ac383e2d.png)


Os números que aparecem ao redor do campo vazio indicam a quantidade de bombas ao redor do campo que não possui bombas.

Essas são as regras básicas para jogar este jogo. Espero que gostem e tenham um bom jogo :)
