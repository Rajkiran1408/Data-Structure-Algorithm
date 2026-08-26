package src.recursion;

import java.util.ArrayList;

public class SearchMultiple {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,5,4};
        int target = 4;
        search(arr,target,0);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static public void search(int[] arr,int target, int index){

        if(arr[index]==target){
            list.add(index);
        }
        if(index==arr.length-1){
            return;
        }

        search(arr,target, index+1);
    }
}
