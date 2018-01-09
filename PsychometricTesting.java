import java.util.Scanner;

public class PsychometricTesting{

     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        
        int iScore = in.nextInt();
        int[] arrscore = new int[iScore];
        for(int i=0; i< iScore; i++) {
            arrscore[i] = in.nextInt();
        }
        
        int iLowerLimit = in.nextInt();
        int[] arrLowerLimit = new int[iLowerLimit];
        for(int i=0; i< iLowerLimit; i++) {
            arrLowerLimit[i] = in.nextInt();
        }
        
        int iUpperLimit = in.nextInt();
        int[] arrUpperLimit = new int[iUpperLimit];
        for(int i=0; i< iUpperLimit; i++) {
            arrUpperLimit[i] = in.nextInt();
        }   
        
        int[] result = jobOffers(arrscore, arrLowerLimit, arrUpperLimit);
        for(int i =0; i<result.length; i++) {
            System.out.println(result[i]);
        }

 
    }
    static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {

    	int[] result = new int[lowerLimits.length];
	
      	for(int i =0; i< scores.length; i++) {
      	    
      	    int currNo = scores[i];
      	    for(int j =0; j < lowerLimits.length; j++) {
      	        
      	        if(currNo >= lowerLimits[j] && currNo <= upperLimits[j]) {
      	            result[j] += 1;
      	        } 
      	    }
      	}
      
      return result;
    }
}
