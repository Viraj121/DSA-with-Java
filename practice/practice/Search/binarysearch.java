package practice.Search;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6, 7, 9, 10 };
        // int arr2[] = { 90, 87, 54, 36, 22, 1 };
        binary(arr, 4);
        // binaryDesc(arr2, 36);
    }

    public static void binary(int arr[], int target) {

        int start=0;
        int end=arr.length-1;
        int ans=0;
        
            while (start<=end) {

                int mid=start+(end-start)/2;

                if (arr[mid]==target) {
                    ans=mid;
                    break;
                    
                }else if(arr[mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
                start++;
                end--;
            }
            if (ans == -1) {
                System.out.println("element not found");
            }else{
                System.out.println(ans);
            }
        
    }

    public static void binaryDesc(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                end=mid-1;
            } else {
                start=mid+1;
            }
            start--;
            end++;
        }

        if (ans == -1) {
            System.out.println("target not found");
        } else {
            System.out.println("target at index: " + ans);
        }
    }
}

