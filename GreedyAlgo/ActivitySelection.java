import java.util.Arrays;
import java.util.Scanner;

public class ActivitySelection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++ ){
                arr[i][j]=sc.nextInt();
            }
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1] ));
        for(int row[]:arr){
            System.out.println(Arrays.toString(row));
        }
        int count=1;
        int lastEnd=arr[0][1];
        for(int i=1; i<arr.length; i++){
            if(arr[i][0]>=lastEnd){
                count++;
                lastEnd=arr[i][1];
            }
        }
        System.out.println(count);
    }

}