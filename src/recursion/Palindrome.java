package src.recursion;

public class Palindrome {

    static int helper(int n,int digit){
        if(n%10 == n){                  // return if 1==1 or 5==5  or 7==7
            return n;
        }

        int rem=n%10;                // give the last number of digits
        return rem *                 // reminder value |^
                (int)Math.pow(10,digit) +      //give the power of 10 value , like digit is 3 -> 1000 or 4 -> 10000
                helper(n/10,digit-1);      // Call recursive helper method with n/10 , digit -1
    }

    static int rev(int n){
        int digit= (int)Math.log10(n);   // Count number of digits-1 in passed n  // Eg: 1234 = 3 ,200 = 2
        return helper(n,digit);          // Call helper method
    }


    static void main(String[] args) {
        int n=123456789;
        int value=rev(n);              // Call a reverse method and pass n
        Boolean isTrue = (n==value);   // check palindrome
        System.out.println(value);
        System.out.println(isTrue);
    }
}
