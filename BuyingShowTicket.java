import java.util.Scanner;

public class BuyingShowTicket{

     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        
        int len = in.nextInt();
        int[] tickets = new int[len];
        for(int i=0; i< len; i++) {
            tickets[i] = in.nextInt();
        }
        
        int position = in.nextInt();
        long no = waitingTime(tickets, position);
        System.out.println(no);
        
    }
    
    static long waitingTime(int[] tickets, int p) {

        long count=0;
        
        for(int i =0; i< tickets.length; i++) {
            
            if(tickets[i] - tickets[p] < 0) {
                count += tickets[i];
            }else {
                
                if(i <= p)
                    count += tickets[p];
                else 
                    count += tickets[p] -1;
            }
            
        }
        
        
        
        return count;
    }
}
