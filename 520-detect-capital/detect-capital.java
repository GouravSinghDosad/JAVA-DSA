class Solution {
    public boolean detectCapitalUse(String word) {
        
        boolean stat = false;

        int countU = 0;
        int left = 0;
        
        char[] arr = word.toCharArray();
        while(left < arr.length){
            if(Character.isUpperCase(arr[left])){
                countU++;
            }
            left++;
        }

        if(countU == arr.length){
            stat = true;
        }else if(countU == 0){
            stat = true;
        }else if(countU == 1 && Character.isUpperCase(arr[0])){
            stat = true;
        }

        return stat;
    }
}