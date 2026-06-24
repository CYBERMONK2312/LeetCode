class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int maxWater = 0;

        while(left < right){
            int area = Math.min(height[left], height[right]) * (right - left);
            System.out.print(area + " ");
            if(maxWater < area) maxWater = area;
            if(height[left] >= height[right]){
                right--;
            }
            else left++;
        }

        return maxWater;
    }
}