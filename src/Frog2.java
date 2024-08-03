import java.util.Arrays;
import java.util.Scanner;

public class Frog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[1] = 0;
        dp[2] = Math.abs(arr[2]-arr[1]);
        for (int i = 3; i <= n ; i++) {
            int start = i - k;
            if(start < 1)
                start = 1;
            for(int j = start; j < i; j++) {
                dp[i] = Math.min(dp[i],
                        dp[j] + Math.abs(arr[i] - arr[j]));
            }
        }
        System.out.println(Arrays.toString(dp));
    }

}
