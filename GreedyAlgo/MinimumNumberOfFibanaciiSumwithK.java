import java.util.ArrayList;
import java.util.*;
public class MinimumNumberOfFibanaciiSumwithK{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        int a = 1, b = 1;
        while (a <= k) {
            l.add(a);
            int next = a + b;
            a = b;
            b = next;
        }
        
        int cnt = 0;
        for (int i = l.size() - 1; i >= 0; i--) {
            if (l.get(i) <= k) {
                k -= l.get(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}