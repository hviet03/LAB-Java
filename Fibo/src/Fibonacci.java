
import java.math.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
  
public class Fibonacci
{
    // Returns n-th Fibonacci number
    static ArrayList<BigInteger> fibList = new ArrayList<>();
    
    static BigInteger fib(int n) throws Exception
    {
        if(n<=0) throw new Exception();
        if(n==1){
            return BigInteger.ZERO;
        }
        
        if(n==2){
            return BigInteger.ONE;
        }
        if(n < fibList.size()){
            return fibList.get(n);
        }
        BigInteger ret = fib(n-1).add(fib(n-2));
        fibList.add(ret);
        return ret;
    }
  
    public static void main(String[] args)
    {
        fibList.add(BigInteger.ZERO);
        fibList.add(BigInteger.ONE);
        int n = 7;
        for(int i = 0; i < n; i++)
            try {
                System.out.print(fib(i)+" ");
            } catch (Exception e) {}
    }
}