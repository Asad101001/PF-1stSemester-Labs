public class PracticeSelectionSorting {

        public static void main(String[] args) {
            int[] arr = {55,31,96,4,51,88,197,64,88,34,20,99};
            for (int i = 0; i < arr.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

            for (int val : arr) {
                System.out.print(val + " ");

            }
        }}



