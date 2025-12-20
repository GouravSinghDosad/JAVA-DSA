class Solution {
    public String toLowerCase(String s) {
        
        char[] arr = s.toCharArray();

        int left = 0;
        while(left < arr.length){
            arr[left] = Character.toLowerCase(arr[left]);
            left++;
        }

        String s1 = new String(arr);
        return s1;
    }
}