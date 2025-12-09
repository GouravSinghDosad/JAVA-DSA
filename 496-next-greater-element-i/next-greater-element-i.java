
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        // Map to store the Next Greater Element relationship: {Element -> NGE}
        // This is the core data structure to quickly answer the queries for nums1.
        Map<Integer, Integer> ngeMap = new HashMap<>();
        
        // Deque used as a Monotonic Stack (stores elements of nums2).
        // It maintains elements in decreasing order. 
        Deque<Integer> stack = new ArrayDeque<>();

        // 1. Find NGE for all elements in nums2 (O(nums2.length))
        for (int num : nums2) {
            
            // While the stack is NOT empty AND the top element is smaller than the current 'num':
            // The current 'num' is the NGE for the element(s) being popped.
            while (!stack.isEmpty() && stack.peek() < num) {
                
                int smallerElement = stack.pop();
                // Store the result: the smaller element found its NGE (which is 'num')
                ngeMap.put(smallerElement, num);
            }
            
            // Push the current number onto the stack. It waits for its own NGE.
            stack.push(num);
        }

        // 2. Handle remaining elements in the stack
        // Any element left has no NGE in the array (NGE is -1).
        while (!stack.isEmpty()) {
            ngeMap.put(stack.pop(), -1);
        }

        // 3. Construct the result array for nums1 (O(nums1.length))
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            // Look up the NGE for the element from nums1 using the map.
            result[i] = ngeMap.get(nums1[i]);
        }

        return result;
    }
}