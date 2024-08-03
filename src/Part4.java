import java.util.Arrays;

public class Part4 {
    public static void main(String[] args) {
        int n = 20;
        int[] dp = new int[n+1];
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;
        for(int i = 4; i <=  n; i++){
            dp[i] = Math.min(dp[i-1],dp[i-2])+1;
            if(i %7 == 0){
                dp[i] = Math.min(dp[i],dp[i/7] + 1);
            }
        }
        System.out.println(Arrays.toString(dp));
    }
}
