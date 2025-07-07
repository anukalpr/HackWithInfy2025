import java.util.Scanner;
public class jumpgameII {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(jg(nums));
    }
    public static int jg(int nums[]){
        int n=nums.length;
        if(n==0){
            return Integer.MAX_VALUE;
        }
        int dp[]=new int[n];
        dp[0]=0;
        for(int i=1; i<n; i++){
            dp[i]=Integer.MAX_VALUE;
            for(int j=0; j<i; j++){
                if(i<=(j+nums[j])&&dp[j]!=Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i], dp[j]+1);
                }
            }
        }
        return dp[n-1];
    }
}
