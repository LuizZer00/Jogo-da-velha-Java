package Trabalho;

public  class ComputadorC extends Computador {//Classe filha da classe: Computador
	//sobrepondo metodo de jogada da super classe computador
	@Override
	public void jogada(Tabuleiro tab) {
		//laço de repetição que vai iterar as linhas da matriz começando na ultima posição e voltando
		for(int l = 2; l >= 0; l--) { 
			//laço de repetição que vai iterar as colunas da matriz começando na ultima posição e voltando
    		for(int c = 2; c >= 0; c--) {  
    		//condicional: se minha matriz de validação em cada posição for L(livre)
    		  if(tab.valida[l][c] == "L") {  
    			//matriz de jogo vai receber O na primeira posição livre de trás para frente
 			     tab.jogo[l][c] = " O ";  
 			   //matriz de validação recebe O(ocupado) na posição definida
 				 tab.valida[l][c] = "O"; 
 					return;   
    			}}}}

	
	}
