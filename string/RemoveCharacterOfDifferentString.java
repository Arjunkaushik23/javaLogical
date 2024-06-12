package string;

public class RemoveCharacterOfDifferentString {
    public static void main(String[] args) {

        String str1 ="abcdef";
        String str2 ="cefz";
        

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            int count= 0;

            for (int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i)== str2.charAt(j)){
                    count++;
                }
            }

            if (count != 1) {
                sb.append(str1.charAt(i));
            }
        
        }
        System.out.println(sb.toString());
    }
    
}


