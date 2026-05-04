import java.util.Scanner;
public class PUM {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int N=sc.nextInt();
         int num=1;
         for(int i=1;i<=N;i++){
             for(int j=0;j<3;j++){
                 System.out.println(num+" ");
                 num++;
             }
             System.out.println("PUM");
             num++;
         }

    }
}
