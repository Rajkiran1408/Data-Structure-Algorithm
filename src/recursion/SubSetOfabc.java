package src.recursion;

import java.util.ArrayList;

public class SubSetOfabc {

    // return without square bracket
    static public void subset(String flag , String str){
        if(str.isEmpty()){
            System.out.println(flag);
            return;
        }

        char ch = str.charAt(0);

        subset(flag,str.substring(1));
        subset(flag+ch,str.substring(1));
    }

    //return with square bracket
    static public ArrayList<String> subsetRet(String flag , String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(flag);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> left = subsetRet(flag+ch,str.substring(1));
        ArrayList<String> right = subsetRet(flag,str.substring(1));


        left.addAll(right);
        return left;
    }

    static void main(String[] args) {
        String str = "abc";
        subset("",str);
        System.out.println(subsetRet("","abc"));
    }
}
