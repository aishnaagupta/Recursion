import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 2, 20 };
        int target = 2;

        System.out.println(search(arr, target, 0));
        System.out.println(findIndex(arr, target, 0));
        System.out.println(findIndexlast(arr, target, arr.length - 1));

        findIndexAll1(arr, target, 0);
        System.out.println(list);

        System.out.println(findIndexAll2(arr, target, 0, new ArrayList<>()));
        System.out.println(findIndexAll3(arr, target, 0));
    }

    static boolean search(int[] arr, int target, int i) {
        if (i == arr.length) {
            return false;
        }
        return arr[i] == target || search(arr, target, i + 1);
    }

    static int findIndex(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        } else {
            return findIndex(arr, target, i + 1);
        }
    }

    static int findIndexlast(int[] arr, int target, int i) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        } else {
            return findIndexlast(arr, target, i - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findIndexAll1(int[] arr, int target, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        findIndexAll1(arr, target, i + 1);
    }

    static ArrayList findIndexAll2(int[] arr, int target, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        return findIndexAll2(arr, target, i + 1, list);
    }

    // Initializing ArrayList inside function
    static ArrayList findIndexAll3(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>(); //this creates a new list on every call
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        ArrayList<Integer> ansFromBefore = findIndexAll3(arr, target, i + 1);
        list.addAll(ansFromBefore);
        return list;
    }
}
