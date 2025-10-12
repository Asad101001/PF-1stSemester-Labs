public class Sorting {
    public static void main(String[] args) {
        int[] myList = {24, 12, 13, 11, 55, 44, 5, 7, 10};
        int minIndex;
        int j;

        int currentIndex = 0;

        int temp;

        while (currentIndex < myList.length) {
            minIndex = currentIndex;

            j = minIndex + 1;
            while (j < myList.length) {
                  if (myList[j]>myList[minIndex]){
                      minIndex=j;
                  }
            j=j+1;

            }

        }
    }
}
