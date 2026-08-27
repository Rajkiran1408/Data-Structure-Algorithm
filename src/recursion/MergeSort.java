package src.recursion;

import java.util.Arrays;

public class MergeSort {

    static public void merge(int[] arr){
        if(arr.length <=1){
            return;
        }
        int mid=arr.length/2;
        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);

        merge(left);
        merge(right);

        mergeSort(arr, left , right);
    }

    static public void mergeSort(int[] arr, int[] left, int[] right){
        int i=0;
        int j=0;
        int k=0;

        while(i<left.length && j< right.length){
            if(left[i] < right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i< left.length){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
    }


    static void main(String[] args) {
        int[] arr = { 5,4,3,2,1};
        merge(arr);
        System.out.println(Arrays.toString(arr));
    }
}
