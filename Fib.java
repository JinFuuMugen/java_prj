import java.util.*;
public class Fib{
    public static int fibonachi(int n){
        int result=0;
        if (n==1||n==2)
            return 1;
        else
            result=fibonachi(n-1)+fibonachi(n-2);

        return result;
    }
    public static void main(String[] args) {
        int k=(int)Math.random()*100;
        for(int j=1; j<k; j++)
            System.out.println("for j="+j+" result= "+fibonachi(j));
    }
}