package Trabalho;

public class ComputadorA extends Computador{//Classe filha da classe: Computador
	 //sobrepondo metodo de jogada da super classe computador
	  @Override
	  public void jogada(Tabuleiro tab) {
		//la�o de repeti��o que vai iterar as linhas da matriz
	    	for(int l = 0; l < 3; l++) { 
	    		//la�o de repeti��o que vai iterar as colunas da matriz
	    		for(int c = 0; c < 3; c++) {  
	    		 //condicional: se minha matriz de valida��o em cada posi��o for L(livre)
	    		  if(tab.valida[l][c] == "L") {  
	    			//matriz de jogo vai receber O na primeira posi��o livre
	 			     tab.jogo[l][c] = " O ";  
	 			   //matriz de valida��o recebe O(ocupado) na posi��o definida
	 				 tab.valida[l][c] = "O";  
	 					return;   
	    			}}}}

	
	}
