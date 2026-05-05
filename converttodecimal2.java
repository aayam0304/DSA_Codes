import java.util.Scanner;
public class converttodecimal2 {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int t=0;t<=T;t++){
           int N=sc.nextInt();
           int onescount=0;
           int temp=N;
           while(temp>0){
               if(temp%2!=0){
                   onescount++;
               }
               temp=temp/2;
           }
           int result=0;
           for(int i=0;i<onescount;i++){
               result=result*2+1;
           }
           System.out.println(result);
       }

    }
}
