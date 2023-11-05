package ALL;
import java.util.Arrays;

class PassingFunctions {
    public static void main(String[] args) {

        int[] nums={3,2,1,5,47};

        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
        
    }

    static void change(int[] arr){
        arr[0]=99;
    }
}
