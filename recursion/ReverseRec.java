public class ReverseRec {
    public static void main(String[] args) {
        String old="Viraj";
        rev(old,old.length()-1);

    }

    static void rev(String str,int index){
        if (index==0) {
            System.out.print(str.charAt(index));
            return;
        }

        System.out.print(str.charAt(index));
        rev(str, index-1);

    }
}
