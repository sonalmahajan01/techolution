import java.util.Scanner;

public class ConsecutiveSum{

     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        
        long num = in.nextLong();
        int noofWays = consecutive(num);
        System.out.println(noofWays);
 
     }
     
    static int consecutive(long num) {
          
        int max = (int)num/2;
        int output = 0;
        
        for(int i = 1; i <= max; i++) {
            int sum = i;
            for(int j = i+1; sum < num; j++) {
                sum +=j;
                if(sum == num) {
                    output++;
                }
            }
        }
        return output;
    }
}
