import java.util.PriorityQueue;
import java.util.HashSet;

class Solution {
    public long sumOfLargestPrimes(String s) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        HashSet<Long> seenPrimes = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) { 
                String sub = s.substring(i, j);
                long val = Long.parseLong(sub);
                
                if (!seenPrimes.contains(val)) {
                    if (isPrime(sub)) {
                        seenPrimes.add(val);
                        minHeap.add(val);

                        if (minHeap.size() > 3) {
                            minHeap.poll(); 
                        }   
                    }
                }
            }
        }
        
        long totalSum = 0;
        while (!minHeap.isEmpty()) {
            totalSum += minHeap.poll();
        }
        return totalSum;
    }

    public boolean isPrime(String s) {
        long n = Long.parseLong(s);
        if (n <= 1) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
