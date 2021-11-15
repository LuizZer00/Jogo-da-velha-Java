package Trabalho;

import java.util.Scanner;

public class Jogador {
	Scanner entrada = new Scanner(System.in);
   //metodo de jogada do jogador humano
   void jogada(Tabuleiro tab) {  
	   //enquanto meu la�o de repeti��o for verdadeiro
	   while(true) { 
		 //vai capturar a linha
	     System.out.printf("Digite a Linha: \n");
	     int lin = entrada.nextInt();  
	   //e a coluna
	     System.out.printf("Digite a Coluna: \n");
	     int col = entrada.nextInt();  
	       
	     //Condicional: se meu numero digitado for menor que 3 e maior ou igual a 0 
	     if(lin < 3 && lin >= 0 && col < 3 && col >= 0) {  
	      //Condicional: se a posi��o digitada da matriz de valida��o for igual a L(livre) 
	       if(tab.valida[lin][col] == "L") {  
	    	 //minhas coordenadas capturadas da matriz v�o receber X
	         tab.jogo[lin][col] = " X ";  
	       //e as coordenadas da matriz de valida��o recebera O(ocupado)
	         tab.valida[lin][col] = "O";
	       //encerra o la�o de repeti��o
	         break;  
	      }
	     //se minha posi��o digitada for igual a O(ocupada)
	       else {  
	    	 //indico ao suario que aquela posi��o est� ocupada
		     System.out.println("Posi��o Ocupada!");  
		   //continuo o meu la�o de repeti��o, pedindo outro valor
		     continue;  
		   
		   
	    }}
	   //se o numero digitado for maior que 3 ou menor que 0
	     else {  
	    	//indico a posi��o de matriz inexistente e
		     System.out.println("Posi��o Inexistente!\n");
		   //continou o la�o de repeti��o
		     continue; 
		   
	   }
   }}
}
