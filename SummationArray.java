import java.util.Scanner;
public class SummationArray {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int []arr=new int [N];
       int sum=0;
       for(int i=0;i<=N;i++){
           long num=sc.nextLong();
           sum+=Math.abs(num);
       }
       System.out.println(sum);

    }

}
