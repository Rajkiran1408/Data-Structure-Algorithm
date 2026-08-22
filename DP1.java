
import java.util.Arrays;

public class DP1 {
    static int  count=0;
    static int[] mem;
    static int fib(int n){
        count++;
        if(mem[n]!=-1){
            return mem[n];
        }
        if(n==0 || n==1){
            mem[n]=n;
            return n;
        }
        int res = fib(n-1)+fib(n-2);
        mem[n]=res;
        return res;
    }
    static void main(String[] args) {
        int n=20;
        mem=new int[n+1];
        Arrays.fill(mem,-1);
        System.out.println(fib(n));
        System.out.println("count :"+count);
    }
}
