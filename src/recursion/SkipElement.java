package src.recursion;

public class SkipElement {
    static void main(String[] args) {
        System.out.println(skip("abcabe"));
        System.out.println(skipApple("abcapplekgjapple"));
    }

    //skip character
    static public String skip(String down){
        if(down.isEmpty()){
            return "";
        }

        char ch = down.charAt(0);

        if(ch == 'a'){
            return skip(down.substring(1));
        }
        else {
            return ch+skip(down.substring(1));
        }
    }

    // skip substring
    static public String skipApple(String down){
        if(down.isEmpty()){
            return "";
        }

        if(down.startsWith("apple")){
            return skipApple(down.substring(5));
        }
        else {
            return down.charAt(0)+skipApple(down.substring(1));
        }
    }
}
