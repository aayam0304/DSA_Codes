import java.util.Scanner;
public class somesums {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int N=sc.nextInt();
         int A=sc.nextInt();
         int B=sc.nextInt();

         int totalsum=0;
         for(int i=0;i<=N;i++){
             int digitsum=getsumofdigits(i);

             if(digitsum>=A&&digitsum<=B){
                 totalsum+=i;
             }

         }
         System.out.println(totalsum);

    }
    private static int getsumofdigits(int num){
         int sum=0;
         while(sum>0){
             sum+=num%10;
             num/=10;
         }
         return sum;
    }
}
