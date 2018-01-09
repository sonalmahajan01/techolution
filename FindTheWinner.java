import java.util.Scanner;

public class FindTheWinner{

     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        
        int noAndrea = in.nextInt();
        int[] andrea = new int[noAndrea];
        for(int i =0; i<noAndrea; i++) {
            andrea[i] = in.nextInt();
        }
        
       	int noMaria = in.nextInt();
        int[] maria = new int[noMaria];
        for(int i =0; i<noMaria; i++) {
            maria[i] = in.nextInt();
        }   
        
        String strGameType = in.next().toLowerCase();

        String gameWinner = winner(andrea, maria, strGameType);
        System.out.println(gameWinner);
 
     }
     
    static String winner(int[] andrea, int[] maria, String s) {
      
      String winner = "";
      
      int scroreAndrea = 0;
      int scoreMaria = 0;
      int index = 0;
      
      if(s.equals("odd")) {
        index = 1;
      }

      while (index < andrea.length && index < maria.length) {
        scroreAndrea = andrea[index] - maria[index];
        scoreMaria = maria[index] - andrea[index];
      	index+=2;
      }
	  winner = scroreAndrea > scoreMaria? "Andrea":"Maria";
      return winner;
    }
}
