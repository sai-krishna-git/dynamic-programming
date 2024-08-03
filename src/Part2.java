public class Part2 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7,9,12};
        int[] dp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                dp[i] = arr[i];
            }
            else if(i == 1){
                dp[i] = Math.max(dp[i-1],arr[i]);
            }
            else{
                dp[i] = Math.max(dp[i-1], dp[i-2]+arr[i]);
            }
        }
        System.out.println(dp[arr.length-1]);
    }
}
