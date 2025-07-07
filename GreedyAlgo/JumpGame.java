import java.util.Scanner;

public class JumpGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        JumpGame ob=new JumpGame();
        System.out.println(ob.jumpGame(nums));
    }
    public boolean jumpGame(int nums[]){
        int maximum_reach=0;
        for(int i=0; i<nums.length; i++){
            if(i>maximum_reach){
                return false;
            }
            else{
                maximum_reach=Math.max(maximum_reach,(i+nums[i]));
            }
        }
        return true;
    }
}
