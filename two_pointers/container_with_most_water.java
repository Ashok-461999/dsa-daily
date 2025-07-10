class Solution {
    public int maxArea(int[] height) {

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int min = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, (right - left) * min);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}