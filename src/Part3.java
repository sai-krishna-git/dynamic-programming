public class Part3 {
    public static void main(String[] args) {
        int[] arr1 = {1,5,3,21234};
        int[] arr2 = {-540,200,3,40};
        int[] dp = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if(i == 0){
                dp[i] = Math.max(arr1[i],arr2[i]);
            }
            else if(i == 1){
                dp[i] = Math.max(dp[i-1], Math.max(arr1[i], arr2[i]));
            }
            else {
                dp[i] = Math.max(dp[i-1],dp[i-2] + Math.max(arr1[i], arr2[i]));
            }
        }
        System.out.println(dp[arr1.length-1]);
    }
}
