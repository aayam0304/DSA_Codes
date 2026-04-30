import java.util.Scanner;
public class digits {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         if(sc.hasNextInt()){
         int T =sc.nextInt();
         while(T-->0){
             String N=sc.next();


         for(int i=N.length()-1;i>=0;i--){
             System.out.println(N.charAt(i));
             if(i>0){
                 System.out.println(" ");
             }


         }
             System.out.println();
         }
         }



         }




}
