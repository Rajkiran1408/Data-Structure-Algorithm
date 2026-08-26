package src.recursion;
import java.util.Arrays;

public class Selection {
    static public void selectionSort(int[] arr, int max,int r, int c){
        if(r==0){
            return;
        }
        if(c<=r){
            if(arr[c]>arr[max]){
                max=c;
            }
            selectionSort(arr,max,r,c+1);
        }
        else{
            int temp = arr[r];
            arr[r]=arr[max];
            arr[max]=temp;
            selectionSort(arr,0,r-1,0);
        }
    }
    static void main(String[] args) {
        int[] arr = { 4,3,2,1};
        selectionSort(arr,0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
}
