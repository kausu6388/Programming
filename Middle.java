public class Middle {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;  
        int result = binarySearch(arr, target);
        System.out.println(result);
    }

    static int binarySearch(int[] arr, int target ) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target<arr[mid]) {
                end = mid - 1;// Target found
            } else if (arr[mid] < target) {
                start = mid + 1; // Search in the right half
            } else {
                return mid; // Search in the left half
            }
        }
        return -1; // Target not found
    }
}