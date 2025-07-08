import java.util.Scanner;

public class HouseRobber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int dp[]=new int[n];
        if(a.length==1){
            System.out.println(a[0]);
        }
        if(a.length==2){
            System.out.println(Math.max(a[0],a[1]));
        }
        dp[0]=a[0];
        dp[1]=Math.max(a[0], a[1]);
        for(int i=2; i<n; i++){
            dp[i]=Math.max(a[i]+dp[i-2],dp[i-1]);
        }
        System.out.println(dp[n-1]);
    }
}
