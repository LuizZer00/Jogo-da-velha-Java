package Trabalho;

import java.util.Random;

public abstract  class Computador {//Classe M�e das classes: Computador A,B e C
	//gerador de n�meros aleat�rios
	Random gerador = new Random();
	//cria��o variaveis de valor aleat�rio
	public int linhaA = gerador.nextInt(3);  
	public int colunaA = gerador.nextInt(3);
	
	//definindo um metodo abstrato
	public abstract void jogada(Tabuleiro tab);
		
		
		
	
	//metodo que faz a chamada da jogada, e aguarda o tempo especificado
     public void TempoJogada() throws InterruptedException {
    	System.out.println("\nVez do Computador: \n");
    	Thread.currentThread();
    	Thread.sleep(800);
      }}

