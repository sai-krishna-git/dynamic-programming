import java.util.Arrays;
import java.util.Scanner;

public class Frog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[n+1];
        dp[1] = 0;
        dp[2] = Math.abs(arr[2]-arr[1]);
        for (int i = 3; i <= n ; i++) {
            dp[i] = Math.min(dp[i-1]+ Math.abs(arr[i] - arr[i-1]),
                    dp[i-2] + Math.abs(arr[i]-arr[i-2]));
        }
        System.out.println(Arrays.toString(dp));
    }

}
