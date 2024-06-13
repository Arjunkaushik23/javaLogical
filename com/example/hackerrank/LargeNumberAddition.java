package com.example.hackerrank;

public class LargeNumberAddition {
    public static void main(String[] args) {
        String num1 =  "123456789012345678901234567890123456789012345678901234567890";
        String num2 = "987654321098765432109876543210987654321098765432109876543210";


        String sum = add(num1, num2);
        System.out.println(sum);
    }

    private static String add(String a, String b) {
        StringBuilder result = new StringBuilder();

        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;

        while(i >= 0 || j >= 0 || carry > 0){
            int digitA = i >= 0 ? a.charAt(i)-'0' : 0;
            int digitB = j >= 0 ? b.charAt(j) - '0' : 0;

            int sum = digitA + digitB + carry;
            carry = sum/10;    // 1  1 
            result.insert(0, sum%10);   //0 0 

            i--;
            j--;

        }

        return result.toString();
    }
}
