package DP;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int coin[]={1,5,6,9};
        int amt=11;
        int dp[]=new int[amt+1];
        Arrays.fill(dp, amt+1);
        dp[0]=0;
        for(int c:coin){
            for(int i = c; i<=amt; i++){
                dp[i]=Math.min(dp[i], dp[i-c]+1);
            }
        }
        System.out.println(dp[amt]>amt?-1:dp[amt]);
    }
}
