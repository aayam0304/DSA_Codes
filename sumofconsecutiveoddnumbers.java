import java.util.Scanner;
public class sumofconsecutiveoddnumbers {
   public  static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();  //number of test cases
       for(int t=0;t<T;t++){
           int X=sc.nextInt();
           int Y=sc.nextInt();
           int start=Math.min(X,Y)+1;  //excluding X
           int end=Math.max(X,Y)-1;    //excluding Y
           int sum=0;
           for(int i=start;i<=end;i++){
               if(i%2!=0){
                   sum+=i;
               }

           }
           System.out.println(sum);

       }

    }
}
