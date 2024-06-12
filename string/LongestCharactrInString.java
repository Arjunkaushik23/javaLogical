package string;

public class LongestCharactrInString {

    public static void main(String[] args) {
        String[] strs = {"arjun", "arjunkaushik","arj"};
        String res=strs[0];

        for (int i = 0; i < strs.length; i++) {
           System.out.println( common(res, strs[i]));
        }

    }

    private static StringBuilder common(String res, String string) {

        int n = Math.min(res.length(), string.length());
        StringBuilder stringBuilder=new StringBuilder();

        for (int i = 0; i < n; i++) {
            if(res.charAt(i)==string.charAt(i)){
                stringBuilder.append(res.charAt(i));
            }else{break;
            }
        }
        return stringBuilder;
    
    }
}
