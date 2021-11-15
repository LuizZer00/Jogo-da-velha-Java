package Trabalho;

public class Tabuleiro {
   public int vit,der,emp;  //declarando variaveis de vitoria, derrotas e empates
   int cont = 1; //declarando variavel contadora de jogadas
   String[][] jogo = {{"0.0", "0.1", "0.2"},{"1.0","1.1","1.2"},{"2.0", "2.1", "2.2"}};  //declarando matriz de tabuleiro
   String[][] valida = {{"L", "L", "L"},{"L","L","L"},{"L", "L", "L"}}; //declarando matriz de validação

 //Metodo que vai ler a matriz
  public String mostrar() {  
	   for(int l = 0; l < 3; l++) {
		   for(int c = 0; c < 3; c++) {
			   System.out.print("|" + jogo[l][c] + "|");
			      
		   }
		   System.out.printf("\n");
	   }  
	   return null;
   }
  
//Metodo que vai zerar as matrizes
  public void zerar() {
	//cada posição da minha matriz de tabuleiro vai ser zerada dos valores: X,O
	  jogo[0][0] = "0.0"; 
	  jogo[0][1] = "0.1"; 
	  jogo[0][2] = "0.2"; 
	  
	  jogo[1][0] = "1.0"; 
	  jogo[1][1] = "1.1"; 
	  jogo[1][2] = "1.2"; 
	  
	  jogo[2][0] = "2.0"; 
	  jogo[2][1] = "2.1"; 
	  jogo[2][2] = "2.2"; 
	  //cada posição da minha matriz de validação vai ser zerado, e receber L(livre)
	  for(int l = 0; l < 3; l++) {
		   for(int c = 0; c < 3; c++) {
			  valida[l][c] = "L";
			      
		   }
		  
	   }  
	  
  }
	   
	  
  
  
  public String validaJogo() {  //metodo que vai retornar a situação do jogo
	  //condicional que vai retornar se o jogador Humano venceu
	   if(jogo[0][0] == " X " && jogo[0][1] == " X " && jogo[0][2] == " X " ||
		  jogo[1][0] == " X " && jogo[1][1] == " X " && jogo[1][2] == " X " ||
		  jogo[2][0] == " X " && jogo[2][1] == " X " && jogo[2][2] == " X " ||
		  jogo[0][0] == " X " && jogo[1][0] == " X " && jogo[2][0] == " X " ||
		  jogo[0][1] == " X " && jogo[1][1] == " X " && jogo[2][1] == " X " ||
		  jogo[0][2] == " X " && jogo[1][2] == " X " && jogo[2][2] == " X " ||
		  jogo[0][0] == " X " && jogo[1][1] == " X " && jogo[2][2] == " X " ||
		  jogo[2][0] == " X " && jogo[1][1] == " X " && jogo[0][2] == " X " ) {
		   
		   
		           return "Você é o vencedor!!";
		   
	   }
	   //condicional qe vai retornar se o jogador Computador venceu
	   else if(jogo[0][0] == " O " && jogo[0][1] == " O " && jogo[0][2] == " O " ||
	      jogo[1][0] == " O " && jogo[1][1] == " O " && jogo[1][2] == " O " ||
		  jogo[2][0] == " O " && jogo[2][1] == " O " && jogo[2][2] == " O " ||
		  jogo[0][0] == " O " && jogo[1][0] == " O " && jogo[2][0] == " O " ||
		  jogo[0][1] == " O " && jogo[1][1] == " O " && jogo[2][1] == " O " ||
		  jogo[0][2] == " O " && jogo[1][2] == " O " && jogo[2][2] == " O " ||
		  jogo[0][0] == " O " && jogo[1][1] == " O " && jogo[2][2] == " O " ||
		  jogo[2][0] == " O " && jogo[1][1] == " O " && jogo[0][2] == " O " ) {
				   
				   
				   return "Você Perdeu!!";
				   
			   }
	 //se o jogo ainda não tem um vencedor me retorne vazio
	   else {
				   return "";
				   
			   }
	   
	
	   
  
   
}
  //metodo que vai retornar o fim do programa,as vitórias,derrotas e empates 
  public void fimProg() {
	  System.out.println("\nVitórias: " + vit);
		System.out.println("Derrotas: " + der);
		System.out.println("Empates: " + emp);
		System.out.println("Encerrando Programa...\n");
	  
	  
	  
  }
}