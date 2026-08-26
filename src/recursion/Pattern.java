package src.recursion;

public class Pattern {

    //normal triangle
    static void triangle2(int r,int c){
        if(r==0){
            return;
        }
        if(c < r){
            triangle2(r,c+1);
            System.out.print("*");
        }
        else {
            triangle2(r-1,0);
            System.out.println();
        }
    }

    // triangle reverse
    static void triangle(int r,int c){
        if(r==0){
            return;
        }
        if(c < r){
            System.out.print("*");
            triangle(r,c+1);
        }
        else {
            System.out.println();
            triangle(r-1,0);
        }
    }
    static void main(String[] args) {
        System.out.println("Reverse triangle :");
        triangle(4,0);
        System.out.println("Normal triangle :");
        triangle2(4,0);
    }
}
