class Solution {
    public String reverseVowels(String s) {
        
        char[] ch = s.toCharArray();

        int left = 0;
        int right = ch.length-1;

        while(left < right){

            if( !(String.valueOf(ch[left]).matches("[aeiouAEIOU]")) ){
                left++;
            }else if( !(String.valueOf(ch[right]).matches("[aeiouAEIOU]")) ){
                right--;
            }
            else{
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }

            
        }

        String name  = new String(ch);
        return name;
    }
}