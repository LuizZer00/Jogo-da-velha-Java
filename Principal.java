package Trabalho;

import java.util.Scanner;

public class Principal {

	private static Scanner entrada;

	public static void main(String[] args) throws InterruptedException {
		int op;
		entrada = new Scanner(System.in); 
		Tabuleiro jogo = new Tabuleiro();
		Jogador j1 = new Jogador();
		//explicando as coordenadas do jogo
		System.out.println("#JOGO DA VELHA#\n");  
		System.out.printf("Coordenadas do jogo: \n\n");
		System.out.printf("Linhas/Colunas : 0.0|0.1|0.2\n");
		System.out.printf("Linhas/Colunas : 1.0|1.1|1.2\n");
		System.out.printf("Linhas/Colunas : 2.0|2.1|2.2\n");
		
		//Menu
		while(true) {
		  System.out.println("\nSair(0) - Escolha a dificuldade(1,2,3): ");
		  op = entrada.nextInt();
		//condicional: se o valor digitado for menor que zero e maior que tr�s, pede outro numero
		  if(op < 0 || op >3) {
			System.out.println("Por Favor, Digite um n�mero v�lido!!");
			
		  }
		//codicional: se valor digitado for zero 
		  if(op == 0) {
			//chama o metodo de fim de programa
			jogo.fimProg();  
			//Imprime Informa��es sobre o trabalho
			System.out.println("Desenvolvido por: Luiz Vinicius de Souza Lara");
			System.out.println("RU: 3424873");
			System.out.println("Disciplina: Programa��o Orientada a Objetos");
			System.out.println("Professor: Leonardo Gomes");
		    //e finaliza o programa
			System.exit(0);;
			
		  }
		  //Condicional: se o numero digitado for um
		  if(op == 1) {
			 //Instancio a Sub-Classe: ComputadorA
			ComputadorA computadorA = new ComputadorA();
			//La�o verdadeiro at� o jogo finalizar
		    while(true) {
		    	//a cada jogada meu contador recebe mais um
		    	jogo.cont += 1;
		    	//chamando a jogada do jogador Humano
			    j1.jogada(jogo);
			    //chamando o metodo de mostrar o jogo
	            jogo.mostrar();
	            
	            //chamando o metodo de jogada do ComputadorA
		        computadorA.jogada(jogo);
		        computadorA.TempoJogada();
		        //chamando o metodo de mostrar o jogo
		        jogo.mostrar();
		        
		        //Minha variavel sit(situa��o) vai receber o metodo validaJogo da classe jogo
				String sit = jogo.validaJogo();
				//imprimi a situa��o do jogo na tela
				System.out.println(sit);
				//Condicional: se a situa��o for igual a: Voc� � vencedor
				if(sit == "Voc� � o vencedor!!") {
					//incremento um na variavel vitorias
					jogo.vit += 1;  
					//volto meu contador de jogadas no valor inicial
					jogo.cont = 1;
					//chamo o metodo de zerar o jogo
					jogo.zerar();
					//encerro meu la�o e volto para o menu
					break;
				}
				//Condicional: se a minha sita��o for igual a: Voc� perdeu
				else if(sit == "Voc� Perdeu!!") {
					//incremento um na variavel derrotas
					jogo.der += 1;
					//volto meu contador de jogadas no valor inicial
					jogo.cont = 1;
					//chamo o metodo de zerar o jogo
					jogo.zerar();
					//encerro meu la�o e volto para o menu
					break;
			   }
				//Condicional: se meu contador for igual a seis e ainda n�o obtive um ganhador
				else if(jogo.cont == 6) {
				   //incremento um na variavel de empates
				   jogo.emp += 1;
				   //volto meu contador de jogadas no valor inicial
				   jogo.cont = 1;
				   //imprimo na tela: Empate
				   System.out.println("Empate!!");
				   //chamo o metodo de zerar o jogo
				   jogo.zerar();
				  //encerro meu la�o e volto para o menu
				   break;
		  }}}
		 //Condicional: se valor digitado for dois
		if(op == 2) {
			//instancio a Sub-Classe ComputadorB
			ComputadorB computadorB = new ComputadorB();
			//la�o verdadeiro ate o jogo finalizar
		    while(true) {
		    	//contador de jogadas incrementa um
		    	jogo.cont += 1;
		    	
		    	//chamando o metodo de jogada do jogador Humano
			    j1.jogada(jogo);
			    //chamando o metodo de mostrar o jogo
	            jogo.mostrar();
	            
	            //se meu contador for menor que seis, ou seja: meu jogo ainda n�o finalizou
	            if(jogo.cont < 6) {
	            //chama o metodo de jogada do ComputadorB
		        computadorB.jogada(jogo);
		        computadorB.TempoJogada();
		        //chama o metodo de mostrar o jogo
		        jogo.mostrar();
	            }
	          //imprimi a situa��o do jogo na tela
	            String sit = jogo.validaJogo();
		       
	            System.out.println(sit);
	          //Condicional: se a situa��o for igual a: Voc� � vencedor
				if(sit == "Voc� � o vencedor!!") {
					//incremento um na variavel vitorias
					jogo.vit += 1;
					//volto meu contador de jogadas no valor inicial
					jogo.cont = 1;
					//chamo o metodo de zerar o jogo
					jogo.zerar();
					//encerro meu la�o e volto para o menu
					break;
				}
				//Condicional: se a minha sita��o for igual a: Voc� perdeu
				else if(sit == "Voc� Perdeu!!") {
					//incremento um na variavel derrotas
					jogo.der += 1;
					//volto meu contador de jogadas no valor inicial
					jogo.cont = 1;
					//chamo o metodo de zerar o jogo
					jogo.zerar();
					//encerro meu la�o e volto para o menu
					break;
				
			   }
				//Condicional: se meu contador for igual a seis e ainda n�o obtive um ganhador
				else if(jogo.cont == 6) {
				   //incremento um na variavel de empates
				   jogo.emp += 1;
				   //volto meu contador de jogadas no valor inicial
				   jogo.cont = 1;
				   //imprimo na tela: Empate
				   System.out.println("Empate!!");
				   //chamo o metodo ade zerar o jogo
				   jogo.zerar();
				   //encerro meu la�o e volto para o menu
				   break;
				   
				   
			   }}}
		//Condicional: se o numero digitado for tr�s
		if(op == 3) {
			//Instancio a Sub-Classe: ComputadorC
			ComputadorC computadorC = new ComputadorC();
			//La�o verdadeiro at� o jogo finalizar
		    while(true) {
		    	//a cada jogada meu contador recebe mais um
		    	jogo.cont += 1;
		    	//chamando a jogada do jogador Humano
			    j1.jogada(jogo);
			  //chamando o metodo de mostrar o jogo
	            jogo.mostrar();
	            
	          //chamando o metodo de jogada do ComputadorC
		        computadorC.jogada(jogo);
		        computadorC.TempoJogada();
		      //chamando o metodo de mostrar o jogo
		        jogo.mostrar();
		        
		        //Minha variavel sit(situa��o) vai receber o metodo validaJogo da classe jogo
				String sit = jogo.validaJogo();
				//imprimi a situa��o do jogo na tela
				System.out.println(sit);
				//Condicional: se a situa��o for igual a: Voc� � vencedor
				if(sit == "Voc� � o vencedor!!") {
					//incremento um na variavel vitorias
					jogo.vit += 1;
					//volto meu contador de jogadas no valor inicial
					jogo.cont = 1;
					//chamo o metodo de zerar o jogo
					jogo.zerar();
					jogo.zerar();
					//encerro meu la�o e volto para o menu
					break;
				}
				//Condicional: se a minha sita��o for igual a: Voc� perdeu
				else if(sit == "Voc� Perdeu!!") {
					//incremento um na variavel derrotas
					jogo.der += 1;
					//volto meu contador de jogadas no valor inicial
					jogo.cont = 1;
					//chamo o metodo de zerar o jogo
					jogo.zerar();
					//encerro meu la�o e volto para o menu
					break;
				 }
				//Condicional: se meu contador for igual a seis e ainda n�o obtive um ganhador
				else if(jogo.cont == 6) {
				   //incremento um na variavel de empates
				   jogo.emp += 1;
				   //volto meu contador de jogadas no valor inicial
				   jogo.cont = 1;
				   //imprimo na tela: Empate
				   System.out.println("Empate!!");
				 //chamo o metodo de zerar o jogo
				   jogo.zerar();
				   //encerro meu la�o e volto para o menu
				   break;
				   
				   
			   }}}}}}
