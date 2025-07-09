// public class fibonaccii {
//     public static void main(String[] args) {
//         int n=5;
//         int a=1,b=1;
        
//     }
// }
import java.util.*;

public class MaxEventsAttender {

    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));  // Sort by startDay

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int day = 1, i = 0, count = 0;
        int n = events.length;

        while (i < n || !minHeap.isEmpty()) {
            if (minHeap.isEmpty() && i < n && events[i][0] > day) {
                day = events[i][0];
            }

            while (i < n && events[i][0] <= day) {
                minHeap.offer(events[i][1]); 
                i++;
            }

            while (!minHeap.isEmpty() && minHeap.peek() < day) {
                minHeap.poll();
            }

            if (!minHeap.isEmpty()) {
                minHeap.poll();
                count++;
                day++;  
            }
        }

        return count;
    }

    public static void main(String[] args) {
        MaxEventsAttender solver = new MaxEventsAttender();
        int[][] events = {{1,2}, {2,3}, {3,4}, {1,2}};
        System.out.println(solver.maxEvents(events));  // Output: 4
    }
}