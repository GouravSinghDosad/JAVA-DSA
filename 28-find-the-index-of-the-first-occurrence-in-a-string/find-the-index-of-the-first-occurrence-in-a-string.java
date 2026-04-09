class Solution {
    public int strStr(String haystack, String needle) {
        
        // char[] hay = haystack.toCharArray();
        // char[] need = needle.toCharArray();

        // int i = 0;
        // int j = 0;
        // int needed = -1;

        // while(i < hay.length && j < need.length){
        //     if(hay[i] == need[j]){
        //         i++;
        //         j++;
        //         if(j == need.length){
        //             needed = 
        //         }
        //     }else if(j == 0 && hay[i] != need[j]){
        //         i++;
        //         j = 0;
        //     }
        //     else if(hay[i] != need[j]){
        //         needed = i;
        //         j = 0;
        //     }
        // }
        // return needed;


        int pos=haystack.indexOf(needle);
return pos;
    }
}
