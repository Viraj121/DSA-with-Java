// public class Practice2 {

//     public static void towerOfHanoi(int n, String src, String Helper, String Dest) {
//         if (n == 1) {
//             System.out.println("transfer disk" + n + " from " + src + " to " + Dest);
//             return;
//         }

//         towerOfHanoi(n-1, src,Dest, Helper);
//         System.out.println("transfer disk" + n + " from " + src + " to " + Dest);
//         towerOfHanoi(n-1, Helper, src, Dest);
 
//     }

//     public static void main(String[] args) {
// int n=3;// as in output it takes 7 steps in total as we seen in the vedio why it is 7 
// towerOfHanoi(n, "S", "H", "D");
//     }
// }


// class Practice2{

//     public static void PrintRev(String str,int index){
//         if(index==0){
//             System.out.println(str.charAt(index));
//             return;
//         }

//         System.out.print(str.charAt(index));
//         PrintRev(str,index-1);
//     }
//     public static void main(String[] args) {
//         // reverse a string using recursion
//         String str="abcd";
//         PrintRev(str,str.length( )-1);
//     }
// }



//find occurance of word in a string using recurrence
class Practice2{

    public static int first=-1;
    public static int last=-1;

    public static void findOccurance(String str,int idx,char element){

        if(idx==str.length()){
            System.out.println("First occurance of "+element+" is "+first);
            System.out.println("Last occurance of "+element+" is "+last);
            return;
        }
        
        char currChar=str.charAt(idx);
        if(currChar==element){
            if(first==-1){  
                first=idx;
            }else{
                last=idx;
            }
        }
findOccurance(str, idx+1, element);

    }
    public static void main(String[] args) {
        String str="abaacdaefaah";
        findOccurance(str, 0, 'a');
    }
}