public class PracticeBinarySearch {
    static int search(int[] arr, int start, int end, int find) {
        if (start > end) {
            return -1;  // element not found
        }

        int half = (start + end) / 2;

        if (arr[half] == find) {
            return half;
        }
        else if (arr[half] < find) {
            return search(arr, half + 1, end, find);
        }
        else {
            return search(arr, start, half - 1, find);
        }
    }

    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,69,77,88,99,101,111,122};
        int start = 0;
        int end = arr.length-1;
        int find = 69;
        int found = search(arr,start,end,find);
        if (found==-1) System.out.println("Target element : "+find+" was not found");
        else {
            System.out.println("Target element : "+find+" is located at index : "+found);
        }
    }
}
