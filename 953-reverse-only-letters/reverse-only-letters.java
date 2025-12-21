class Solution {
    public String reverseOnlyLetters(String s) {
        
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;

        while(left < right){

            if( (arr[left] < 65 || (arr[left] > 90 && arr[left] < 97) || arr[left] > 122 )){
                left++;
            }else if( (arr[right] < 65 || (arr[right] > 90 && arr[right] < 97) || arr[right] > 122 )){
                right--;
            }else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

        }

        String s1 = new String(arr);
        return s1;
    }
}