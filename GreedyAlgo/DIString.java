import java.util.Arrays;
import java.util.Scanner;

public class DIString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int perm[]=new int[n+1];
        int i=0, j=n;
        int pos=0;
        while(i<j){
            if(s.charAt(pos)=='I'){
                perm[pos++]=i++;
            }
            else{
                perm[pos++]=j--;
            }
        }
        perm[n]=i;
        System.out.println(Arrays.toString(perm));
    }
}
