package Trabalho;

import java.util.Scanner;

public class Jogador {
	Scanner entrada = new Scanner(System.in);
   //metodo de jogada do jogador humano
   void jogada(Tabuleiro tab) {  
	   //enquanto meu laço de repetição for verdadeiro
	   while(true) { 
		 //vai capturar a linha
	     System.out.printf("Digite a Linha: \n");
	     int lin = entrada.nextInt();  
	   //e a coluna
	     System.out.printf("Digite a Coluna: \n");
	     int col = entrada.nextInt();  
	       
	     //Condicional: se meu numero digitado for menor que 3 e maior ou igual a 0 
	     if(lin < 3 && lin >= 0 && col < 3 && col >= 0) {  
	      //Condicional: se a posição digitada da matriz de validação for igual a L(livre) 
	       if(tab.valida[lin][col] == "L") {  
	    	 //minhas coordenadas capturadas da matriz vão receber X
	         tab.jogo[lin][col] = " X ";  
	       //e as coordenadas da matriz de validação recebera O(ocupado)
	         tab.valida[lin][col] = "O";
	       //encerra o laço de repetição
	         break;  
	      }
	     //se minha posição digitada for igual a O(ocupada)
	       else {  
	    	 //indico ao suario que aquela posição está ocupada
		     System.out.println("Posição Ocupada!");  
		   //continuo o meu laço de repetição, pedindo outro valor
		     continue;  
		   
		   
	    }}
	   //se o numero digitado for maior que 3 ou menor que 0
	     else {  
	    	//indico a posição de matriz inexistente e
		     System.out.println("Posição Inexistente!\n");
		   //continou o laço de repetição
		     continue; 
		   
	   }
   }}
}
