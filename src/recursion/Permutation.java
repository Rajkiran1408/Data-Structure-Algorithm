package src.recursion;

import java.util.ArrayList;

public class Permutation {

    //without return type
    static public void permu(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String e = p.substring(i,p.length());
            permu(f+ch+e,up.substring(1));
        }
    }

    // with ArrayList return type
    static public ArrayList<String> permuList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String e = p.substring(i,p.length());
            ans.addAll(permuList(f+ch+e,up.substring(1)));
        }
        return ans;
    }

    //return count

    static public int permuCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }

        int c=0;

        char ch = up.charAt(0);

        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String e = p.substring(i,p.length());
            c += permuCount(f+ch+e,up.substring(1));
        }

        return c;
    }
    static void main(String[] args) {
        permu("","abc");
        System.out.println(permuList("","abc"));
        System.out.println(permuCount("","abc"));
    }
}
