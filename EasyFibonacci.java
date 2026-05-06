import java.util.Scanner;
public class EasyFibonacci {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         if (sc.hasNextInt()) {
             int N = sc.nextInt();
             printfibonacci(N);
         }
     }
     public static void printfibonacci(int N){
          int first=0, second=1;
          for(int i=1;i<=N;i++){
              if(i==1){
                  System.out.println(first);
              }
              else if(i==2){
                  System.out.println(" "+second);
              }
              else{
                  int next =first +second;
                  System.out.println(" "+next);
                  first=second;
                  second=next;
              }
          }
         System.out.println();
     }


}
