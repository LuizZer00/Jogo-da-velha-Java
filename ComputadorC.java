package Trabalho;

public  class ComputadorC extends Computador {//Classe filha da classe: Computador
	//sobrepondo metodo de jogada da super classe computador
	@Override
	public void jogada(Tabuleiro tab) {
		//la�o de repeti��o que vai iterar as linhas da matriz come�ando na ultima posi��o e voltando
		for(int l = 2; l >= 0; l--) { 
			//la�o de repeti��o que vai iterar as colunas da matriz come�ando na ultima posi��o e voltando
    		for(int c = 2; c >= 0; c--) {  
    		//condicional: se minha matriz de valida��o em cada posi��o for L(livre)
    		  if(tab.valida[l][c] == "L") {  
    			//matriz de jogo vai receber O na primeira posi��o livre de tr�s para frente
 			     tab.jogo[l][c] = " O ";  
 			   //matriz de valida��o recebe O(ocupado) na posi��o definida
 				 tab.valida[l][c] = "O"; 
 					return;   
    			}}}}

	
	}
