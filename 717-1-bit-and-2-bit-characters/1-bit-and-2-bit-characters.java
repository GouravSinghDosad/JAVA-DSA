class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        
        int index = 0;
        int n = bits.length;

        while(index < n){

            if(index == n-1 && bits[index] == 0){
                return true;
            }
            else if(bits[index] == 1){
                index += 2;
            }else{
                index++;
            }
        }

        return false;
    }
}