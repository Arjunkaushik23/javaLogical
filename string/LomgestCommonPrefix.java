package string;

public class LomgestCommonPrefix {
    public static void main(String[] args) {
        
        String[] str = {"flower","flow","flight"}; 
        int n = str.length;
        String res=str[0];

        for (int i = 0; i < n; i++) {
            common(str[i], res);
        }

        // System.out.println(res);

    }

    private static String common(String str, String res) {

        StringBuilder stringBuilder = new StringBuilder();
        int n = Math.min(str.length(),res.length());

        for (int i = 0; i < n; i++) {
            if (str.charAt(i)==res.charAt(i)) {
                stringBuilder.append(str.charAt(i));
            }
            else{
                break;
            }
    }
    return stringBuilder.toString();
    }
}
