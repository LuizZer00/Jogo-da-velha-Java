package Trabalho;

public class ComputadorB extends Computador {//Classe filha da classe: Computador
	//sobrepondo metodo de jogada da super classe computador
	@Override
	public void jogada(Tabuleiro tab) {
		 //Variavel qe vai me auxiliar a saber quando uma condi��o for satisfeita
		String aux = "L"; 
		//enquanto minha variavel auxiliar for diferente de O(ocupado)
		while(aux != "O") {
		  //condicional: se minha matriz de jogo nas posi��es aleat�rias geradas pelas variaveis for L(livre)
		  if(tab.valida[linhaA][colunaA] == "L") {
			//matriz de jogo nas mesmas posi��es receber� O
			tab.jogo[linhaA][colunaA] = " O ";
			//matriz de valida��o nas mesmas posi��es receber� O(ocupado)
			tab.valida[linhaA][colunaA] = "O";
			//variavel auxiliar recebe O
			aux = "O";
			return;
			
			
		  }
		  //se minha condi��o acima n�o for satisfeita e variavel auxiliar for igual a L
		  else {
			 //gera uma novos avalores aleat�rios e volta para a condicional 
			linhaA = gerador.nextInt(3);
			colunaA = gerador.nextInt(3);
		   }}}

	
	}
		
	


