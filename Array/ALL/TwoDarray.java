package ALL;
class TwoDaaray{
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {3,2,1},
            {9,9,9}
        };


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}