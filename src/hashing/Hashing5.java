package hashing;

import java.util.Arrays;

public class Hashing5 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2,6,4,3,6};
        int[] prefix = new int[n+1];
        for (int i = 1; i <= n ; i++) {
            prefix[i] = prefix[i-1] + arr[i-1];
        }
        System.out.println(Arrays.toString(prefix));
        int l = 2;
        int r = 4;
        System.out.println(prefix[r] - prefix[l-1]);
    }
}
