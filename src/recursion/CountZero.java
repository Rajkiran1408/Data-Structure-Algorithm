package src.recursion;

public class CountZero {

    static int countZero(int n){
        int c=0;
        return helper(n,c);
    }

//    static int helper(int n , int c){
//        if(n%10 == 0){
//            c=c+1;
//        }
//        if(n%10 == n){
//            return c;
//        }
//
//        return helper(n/10,c);
//    }

    // better readability and simplicity
    static int helper(int n , int c){
        if(n==0){                         // id Total number is zero return count
            return c;
        }
        if(n%10 == 0){                      // if the digit is zero , call and add count + 1
            return helper(n/10,c+1);
        }

        return helper(n/10,c);         // Otherwise , call the method
    }

    static void main(String[] args) {
        int n =300000010;
        System.out.println(countZero(n));
    }
}
