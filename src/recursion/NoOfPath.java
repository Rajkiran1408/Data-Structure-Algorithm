package src.recursion;

import java.util.ArrayList;

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

    static ArrayList<String> pathRet(String s , int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        if(r>1){
            ans.addAll(pathRet(s+'D',r-1,c));
        }

        if(c>1){
            ans.addAll(pathRet(s+'R',r,c-1));

        }
        return ans;

    }


    static void main(String[] args) {
        System.out.println(pathCount(3,3));
        path("",3,3);
        System.out.println(pathRet("",3,2));
    }
}
