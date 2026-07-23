public class SortedArray{
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        if(isSorted(arr,0)){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }

    static boolean isSorted(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        return arr[i] < arr[i+1] && isSorted(arr, i+1);
    }
}