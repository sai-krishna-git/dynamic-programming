import java.util.Arrays;

public class Part1 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,8,4,6};
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(dp));
    }
}
