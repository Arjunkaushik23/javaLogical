package hackerrank;

class A {

    public void add(int... nums) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sb.append(nums[i]);

            if (i < nums.length - 1) {
                sb.append("+");
            }

        }

        sb.append("=").append(sum);

        System.out.println(sb.toString());
    }
}


public class MultiFunction {
    public static void main(String[] args) {
        A a = new A();
        a.add(6, 6, 6);
    }
}
