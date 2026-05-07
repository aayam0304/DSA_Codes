import java.util.Scanner;
public class ThreeNumbers {
   public  static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int K=sc.nextInt();
       int S=sc.nextInt();
       int count=0;
       // iterate over possible values of xand y
       for(int X=0;X<=K;X++){
           for(int Y=0;Y<=K;Y++){
               int Z=S-X-Y;//z is determine by xand y
               if(Z>=0&&Z<=K){
                   count++;
               }
           }
       }
       System.out.println(count);



    }
}
