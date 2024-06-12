package string;

public class ReverseString2 {
    public static void main(String[] args) {
        String str = "arjunkaushik";
        char [] array = str.toCharArray();
        String str2 = "";
        int i,j;
        

        for ( i = 0; i < array.length; i++) {
            // System.out.print(i);
            // System.out.println();
            for ( j = 0; j < i; j++) {
                // System.out.print(j);
                if(array[i]==array[j]){
                    break;
                }
            }
            // System.out.println();
            if (j==i) {
                str2=str2+array[i];
            }
        }

        System.out.println(str2);
    }
    
}
