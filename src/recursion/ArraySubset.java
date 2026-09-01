package src.recursion;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySubset {

    //without remove duplicate
    static public ArrayList<List<Integer>> subset(int[] arr){
        ArrayList<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n= outer.size();
            for(int i=0;i<n;i++){
                List<Integer> in = new ArrayList<>(outer.get(i));
                in.add(num);
                outer.add(in);

            }
        }
        return outer;
    }

    // remove duplicate
    static public ArrayList<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        ArrayList<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        for(int i=0;i< arr.length;i++){
            int n= outer.size();
            if(i>0 && arr[i]==arr[i-1]){
                start=n/2;
            }
            else{
                start=0;
            }

            for(int j=start;j<n;j++){
                List<Integer> in = new ArrayList<>(outer.get(j));
                in.add(arr[i]);
                outer.add(in);

            }
        }
        return outer;
    }
    static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subset(arr));
        System.out.println(subsetDuplicate(arr));
    }
}
