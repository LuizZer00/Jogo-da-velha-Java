package Trabalho;

public class ComputadorB extends Computador {//Classe filha da classe: Computador
	//sobrepondo metodo de jogada da super classe computador
	@Override
	public void jogada(Tabuleiro tab) {
		 //Variavel qe vai me auxiliar a saber quando uma condição for satisfeita
		String aux = "L"; 
		//enquanto minha variavel auxiliar for diferente de O(ocupado)
		while(aux != "O") {
		  //condicional: se minha matriz de jogo nas posições aleatórias geradas pelas variaveis for L(livre)
		  if(tab.valida[linhaA][colunaA] == "L") {
			//matriz de jogo nas mesmas posições receberá O
			tab.jogo[linhaA][colunaA] = " O ";
			//matriz de validação nas mesmas posições receberá O(ocupado)
			tab.valida[linhaA][colunaA] = "O";
			//variavel auxiliar recebe O
			aux = "O";
			return;
			
			
		  }
		  //se minha condição acima não for satisfeita e variavel auxiliar for igual a L
		  else {
			 //gera uma novos avalores aleatórios e volta para a condicional 
			linhaA = gerador.nextInt(3);
			colunaA = gerador.nextInt(3);
		   }}}

	
	}
		
	


