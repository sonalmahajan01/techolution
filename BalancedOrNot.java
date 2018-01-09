import java.util.Scanner;

public class BalancedOrNot{

     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        
        int noOfExpr = in.nextInt();
        String[] expr = new String[noOfExpr];
        for(int i =0; i<noOfExpr; i++) {
            expr[i] = in.next();
        }
        int maxReplacements = in.nextInt();
        int[] arrMaxReplacements = new int[maxReplacements];
        for(int i =0; i<maxReplacements; i++) {
            arrMaxReplacements[i] = in.nextInt();
        } 
        
        int[] result = balancedOrNot(expr, arrMaxReplacements);
        for(int i =0; i<result.length; i++) {
            System.out.println(result[i]);    
        }
        
     }

  	static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
      
    	int[] result = new int[expressions.length];
	
      	for(int i =0; i< expressions.length; i++) {
      	
        	String expr = expressions[i];
        	int maxRep  = maxReplacements[i];
        	int totalReplacement = 0;
        
        	for(int j =0; j<expr.length(); j++) {
        		char ch = expr.charAt(j);

          		if(ch == '>') {
            		totalReplacement++;
          		} else {
          			if(ch =='<') {
          				//check the next charracter is >
            			if(j != expr.length()-1 && expr.charAt(j+1) == '>') {
              		   		
                       		j ++;
             		   		continue; 
            			}
            			else {
            			   totalReplacement++; 
            			}
                	}
          		}
          	}
          if(totalReplacement <= maxRep) {
          		result[i] = 1;
          }else {
          		result[i] =0;
          }
      }
      return result;
    }
}
