class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length-1;

        int max = 0;
        while(left < right){
            int mH = 0;
            if(height[left] < height[right]) mH = height[left];
            else mH = height[right];
            
            int volume = mH * (right-left);
            max = Math.max(volume, max);
            if(height[left] < height[right]) left++;
            else right--;
        }

        return max;
    }
}