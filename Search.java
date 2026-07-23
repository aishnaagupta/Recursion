public class Search {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 20 };
        int target = 5;

        if (search(arr, target, 0)) {
            System.out.println("Target found at: " + find(arr, target, 0));
        } else {
            System.out.println("Target not found");
        }
    }

    static boolean search(int[] arr, int target, int i) {
        if (i == arr.length) {
            return false;
        }
        return arr[i] == target || search(arr, target, i + 1);
    }

    static int find(int[] arr, int target, int i) {
        if (arr[i] == target) {
            return i;
        } else {
            return find(arr, target, i + 1);
        }
    }
}
