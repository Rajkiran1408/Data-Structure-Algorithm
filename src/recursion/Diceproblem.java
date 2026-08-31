package src.recursion;

import java.util.ArrayList;

public class Diceproblem {

    static void dice(String p,int up){
        if(up==0){
            System.out.println(p);
            return;
        }

        for(int i=1;i<=up;i++){
            dice(p+i,up-i);
        }
    }

    static ArrayList<String> diceList(String p, int up){
        if(up==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i=1;i<=up;i++){
            ans.addAll(diceList(p+i,up-i));
        }
        return ans;
    }

    static int diceCount(String p,int up){
        if(up==0){
            return 1;
        }
        int count=0;
        for(int i=1;i<=up;i++){
            count+=diceCount(p+i,up-i);
        }

        return count;
    }
    static void main(String[] args) {
        dice("",4);
        System.out.println(diceList("",4));
        System.out.println(diceCount("",4));
    }
}
