package src.recursion;

public class SearchElements {

        public static void main(String[] args) {
            int[] arr = {1,2,3,4,6,5};
            int target = 41;
            System.out.println(search(arr,target,0));
        }

        static public boolean search(int[] arr,int target, int index){

            if(index==arr.length-1){
                return false;
            }
            return arr[index]==target || search(arr,target, index+1);
        }
}

