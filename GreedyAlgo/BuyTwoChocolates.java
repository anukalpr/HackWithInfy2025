import java.util.Scanner;

public class BuyTwoChocolates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int choco[]=new int[n];
        for(int i=0; i<n; i++){
            choco[i]=sc.nextInt();
        }
        int money=sc.nextInt();
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int num:choco){
            if(num<min1){
                min2=min1;
                min1=num;
            }
            else if(num<min2&&min2!=num){
                min2=num;
            }
        }
        int amt=min1+min2;
        if(money>=amt){
            System.out.println(money-amt);
        }
        else{
            System.out.println(money);
        }
    }
}
