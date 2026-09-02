package src.recursion;

public class NoOfPath {

    static int pathCount(int r,int c){
        if(r==1 || c==1){
            return 1;
        }

        int left = pathCount(r-1,c);
        int right = pathCount(r,c-1);

        return left+right;
    }

    static void path(String s ,int r,int c){
        if(r==1 && c==1){
            System.out.println(s);
            return;
        }
        if(r>1){
            path(s+'D',r-1,c);
        }

        if(c>1){
            path(s+'R',r,c-1);

        }

    }


    static void main(String[] args) {
        System.out.println(pathCount(3,3));
        path("",3,3);
    }
}
