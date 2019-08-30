import java.text.DecimalFormat;

public class questao5 {
	

		public static void main(String[] args) {
	      double prova1 = 8.5 / 2 ;
	      double prova2 = 5.0 / 3 ;
	      double prova3 = 9.2 / 5 ;  
	      double media = prova1 + prova2 + prova3;
	      
	      DecimalFormat df = new DecimalFormat("#,###.00");
	      df.format(media); 
	      
	      if (media>=7) {
	    	  System.out.printf (" Voce foi Aprovado: " + df.format(media) );
	      }else {
	    	   System.out.println(" Você está ferrado corre.... ");
	       }
	    		
		  }
	   }


	/*
	 * variaveis
	 * inteiro peso1, peso2, peso3
	 * real nota1, nota2, nota3, media
	 * 
	 * programa
	 * 
	 * ler(nota1)
	 * ler(nota2)
	 * ler(nota3)
	 * 
	 	media = ( ((nota1*peso1)+(nota2*peso2)+(nota3+peso3))/ peso1+pes2+peso3)
	 	
	 	se(media>7)
	 		escrever(foi aprovado)
	 *  senao
	 *  	escrever(foi reprovado)
	 */