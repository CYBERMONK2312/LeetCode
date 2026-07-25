// class Solution {
//     public int maxProduct(int n) {
//         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(2, Collections.reverseOrder());
//         while(n>0){
//             int temp = n%10;
//             maxHeap.add(temp);
//             n/=10;
//         }

//         return maxHeap.poll()*maxHeap.poll();
//     }
// }

class Solution {
    public int maxProduct(int n) {
        int max1 = 0, max2 = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }

            n /= 10;
        }

        return max1 * max2;
    }
}