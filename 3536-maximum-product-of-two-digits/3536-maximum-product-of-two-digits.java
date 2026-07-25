class Solution {
    public int maxProduct(int n) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(2, Collections.reverseOrder());
        while(n>0){
            int temp = n%10;
            maxHeap.add(temp);
            n/=10;
        }

        return maxHeap.poll()*maxHeap.poll();
    }
}