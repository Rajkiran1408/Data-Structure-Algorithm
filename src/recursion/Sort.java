package src.recursion;

class Sort {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,2};
        System.out.println(sorted(arr,0));
    }

    static public boolean sorted(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sorted (arr, index+1);
    }
}