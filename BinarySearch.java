public class BinarySearch {

    static public int search(int[] arr, int target,int start,int end){
        if(start>end){
            return -1;
        }
        int m = start+(end-start)/2;

        if(arr[m]==target){
            return m;
        }
        if(arr[m]>target){
            return search(arr,target,start,m-1);
        }
        return search(arr,target,m+1,end);
    }

    static void main(String[] args) {
        int[] arr = { 1,3,5,7,8,13,16,35};
        int target = 16;
        System.out.println(search(arr,target,0,arr.length-1));
    }

}
