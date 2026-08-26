package src.data_structure_algorithm;

public class RotatedBinarySearch {
    static public int BinarySearch(int[] arr , int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[s]<=arr[mid]){                          // start element is less than the mid-element , the first half is sorted
            if(target >= arr[s] && target <=arr[mid]){  // target element is less thanOrEqual start and greater thanOrEqual mid ,
                                                        // defiantly target is inside rather than go to else

                return BinarySearch(arr,target,s,mid-1);
            }
            return BinarySearch(arr,target,mid+1,e);
        }
            // mid-element is less than the last element , second half is sorted
        if(target >= arr[mid] && target <= arr[e]){
            return BinarySearch(arr,target,mid+1,e);
        }
        return BinarySearch(arr,target,s,mid-1);
    }
    static void main(String[] args) {
        int[] arr = {3,4,5,6,7,1,2};
        int target = 2;
        System.out.println(BinarySearch(arr,target,0,arr.length-1));
    }
}
