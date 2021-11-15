package Trabalho;

public class ComputadorA extends Computador{//Classe filha da classe: Computador
	 //sobrepondo metodo de jogada da super classe computador
	  @Override
	  public void jogada(Tabuleiro tab) {
		//laço de repetição que vai iterar as linhas da matriz
	    	for(int l = 0; l < 3; l++) { 
	    		//laço de repetição que vai iterar as colunas da matriz
	    		for(int c = 0; c < 3; c++) {  
	    		 //condicional: se minha matriz de validação em cada posição for L(livre)
	    		  if(tab.valida[l][c] == "L") {  
	    			//matriz de jogo vai receber O na primeira posição livre
	 			     tab.jogo[l][c] = " O ";  
	 			   //matriz de validação recebe O(ocupado) na posição definida
	 				 tab.valida[l][c] = "O";  
	 					return;   
	    			}}}}

	
	}
