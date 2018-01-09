import java.util.Scanner;

public class TwoCircles{

     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        
        int NoOfInputs = in.nextInt();
        in.nextLine();
        String[] conditions = new String[NoOfInputs];
        for(int i =0; i<NoOfInputs; i++) {
            conditions[i] = in.nextLine();
        }   
        
        String[] type = circles(conditions);
        for(int i =0; i <type.length; i++) {
            System.out.println(type[i]);
        }
 
     }
     
    static String[] circles(String[] info) {
        
        String[] result = new String[info.length]; 
        for(int i =0; i < info.length; i++) {
            
            //System.out.println(info[i]);
            String[] arrInfo = info[i].split(" ");
            
            int r1 =  Integer.parseInt(arrInfo[2]);
            int r2 =  Integer.parseInt(arrInfo[5]);
            
            //type coordinate
            int c1 = Integer.parseInt(arrInfo[0]);
            int c2 = Integer.parseInt(arrInfo[3]);
            if(Integer.parseInt(arrInfo[0]) == 0 ) {
                c1 = Integer.parseInt(arrInfo[1]);
                c2 = Integer.parseInt(arrInfo[4]);
            }
            
            int min1 = c1 - r1;
            int max1 = c1 + r1;
            int min2 = c2 - r2;
            int max2 = c2 + r2;
            
            //Touching
            if(min1 == min2 || min1 == max2 || max1 == max2 || max1 == min2) {
                result[i] = "Touching"; 
            }
            else if(c1 == c2) {
                result[i] = "Concentric"; 
            }
            else if((max1 > min2 && max1 < max2) || (max2 > min1 && max2 < max1)) {
                result[i] = "Intersecting"; 
            }
            else if ((min2 > min1 && max2 < max1) || (min1 > min2 && max1 < max2)) {
                result[i] = "Disjoint‐Inside"; 
            }
            else {
                result[i] = "Disjoint‐Outside"; 
            }
            
        }
        return result;
    }
}
