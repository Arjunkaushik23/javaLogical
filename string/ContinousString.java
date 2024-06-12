package string;

public class ContinousString {
    public static void main(String[] args) {
        String s1 = "abcdefabcdefgabcdefgh";

        int n = s1.length();
        System.out.println(longestCountinousString(s1, n));
    }

    private static int longestCountinousString(String s1, int n) {

        // Set<Character> set = new HashSet<>();
        int max = 0;
        int start = 0;
        int end = 0;

        while(end<n){

            while(end+1<n && (int)s1.charAt(end)+1 == (int)s1.charAt(end+1)){
                end++;
            }

            int curLength = end-start+1;
            max = Math.max(max, curLength);
            end++;
            start=end;

        }

        return max;
    }
}
