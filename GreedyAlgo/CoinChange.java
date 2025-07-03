import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int coins[]=new int[n];
        for(int i=0; i<n; i++){
            coins[i]=sc.nextInt();
        }
        int amount=sc.nextInt();
        Arrays.sort(coins);
        int count=0;
        for(int i=n-1; i>=0; i--){
            while(amount>=coins[i]){
                count++;
                amount-=coins[i];
            }
        }
        System.out.println(count);
    }
}
