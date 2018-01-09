import java.util.Scanner;

public class Solution{

     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        
        int asha = in.nextInt();
        int kelly = in.nextInt();
        int ashaAhead = in.nextInt();
        
        int minNum = minNum(asha, kelly, ashaAhead);
        System.out.println(minNum);

 
    }
    
    static int minNum(int A, int K, int P) {
        int minNum = 0;
    	
    	int asha =  P;
    	int kelly = 0;
    	while (kelly <= asha && asha <= 100 && kelly <= 100) {
    	    asha +=A;
    	    kelly += K;
    	    minNum++;
    	}
        if(kelly <= asha)
            return -1;
        else 
            return minNum;
    }
}
