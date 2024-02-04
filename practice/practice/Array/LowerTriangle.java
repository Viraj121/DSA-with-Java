package practice.Array;

//tcs nqt 2024 question 
class LowerTriangle{
    public static void main(String[] args) {
        int arr[][]={
            {3,2,1,9},
            {6,5,4,8},
            {9,7,6,5},
            {5,4,3,2}
        };

        int  row=arr.length;
        int cols=arr[0].length;

        if (row!=cols) {
            System.out.println("matrix is not vaild");
        }else{
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (j>i) {
                        System.out.print(0+" ");
                    }else{
                        System.out.print(arr[i][j]+" ");
                    }
                }
                System.out.println();
            }
        }


    }
}