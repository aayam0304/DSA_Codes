import java.util.Scanner;
public class sequenceofnumberandsum {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         while (true) {


             int M = sc.nextInt();
             int N = sc.nextInt();
             if (N <= 0 || M <= 0) {
                 break;
             }
             int start = Math.min(N, M);
             int end = Math.max(N, M);

             int sum = 0;
             for (int i = start; i <= end; i++) {
                 System.out.println(i + " ");
                 sum += i;
             }
             System.out.println("sum=" + sum);
         }




    }
}
