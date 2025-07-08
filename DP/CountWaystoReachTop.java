public class CountWaystoReachTop {
    static int c=0;
    public static void main(String[] args) {
        int n=4;
        if(n==0){
            System.out.println(1);;
        }
        if(n==1){
            System.out.println(1);
        }
        if(n==2){
            System.out.println(2);
        }
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for(int i=3; i<=n; i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        System.out.println(dp[n]);
    }
    // public static void stair(int n){
    //     if(n==0){
    //         c++;
    //         return;
    //     }
    //     if(n<0){
    //         return;
    //     }
    //     stair(n-1);
    //     stair(n-2);
    //     stair(n-3);
    // }
}
