import java.util.*;
public class DAA1_fibonacci{
    public static void iterative(int N){
        int num1=0;
        int num2=1;
            for(int i=0;i<N;i++){
                System.out.print(num1+" ");
                int num3=num1+num2;
                num1=num2;
                num2=num3;
            }
    }
    public static int recur(int n){
        if(n<=1){
            return n;
        }

        return recur(n-1)+recur(n-2);
    }
    public static void main(String[] args) {
        //iterative(10);
        int n=10;
        for(int i=0;i<n;i++){
            System.out.print(recur(i)+" ");
        }
    }
}