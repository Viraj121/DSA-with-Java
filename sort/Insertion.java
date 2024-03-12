import java.util.Arrays;

//KUNAL'S SOLUTION
class Insertion {
    public static void main(String[] args) {
        int arr[] = { 6, 0, 4, 3, 2, 1 };
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    // two part sorted and unsorted in array than camparison between sorted and
    // unsorted one
    static void insertion(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {

            // unsorted part of array
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                    // break is used for optimizing the code as j at current position all the
                    // elements to its lest will be sorted one if at the first iteration of the j
                    // and j-1 fails it doesnt make any sense to check all the others element before
                    // it..eg 1,2,3,4|sorted part |9,6| at index 9
                }
            }

        }
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
