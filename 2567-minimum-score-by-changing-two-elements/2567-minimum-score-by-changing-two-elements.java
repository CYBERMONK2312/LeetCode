class Solution {
    public int minimizeSum(int[] nums) {
        if (nums.length <= 3) return 0;

        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;
        int thirdLowest = Integer.MAX_VALUE;

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int thirdHighest = Integer.MIN_VALUE;

        for (int num : nums) {
            // Track 3 lowest
            if (num < lowest) {
                thirdLowest = secondLowest;
                secondLowest = lowest;
                lowest = num;
            } else if (num < secondLowest) {
                thirdLowest = secondLowest;
                secondLowest = num;
            } else if (num < thirdLowest) {
                thirdLowest = num;
            }

            // Track 3 highest
            if (num > highest) {
                thirdHighest = secondHighest;
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest) {
                thirdHighest = secondHighest;
                secondHighest = num;
            } else if (num > thirdHighest) {
                thirdHighest = num;
            }
        }

        int changeTwoSmallest = highest - thirdLowest;
        int changeTwoLargest = thirdHighest - lowest;
        int changeOneEach = secondHighest - secondLowest;

        return Math.min(changeTwoSmallest, Math.min(changeTwoLargest, changeOneEach));
    }
}
