package Trabalho;

import java.util.Random;

public abstract  class Computador {//Classe Mãe das classes: Computador A,B e C
	//gerador de números aleatórios
	Random gerador = new Random();
	//criação variaveis de valor aleatório
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

