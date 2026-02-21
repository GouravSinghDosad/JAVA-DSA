class Solution {

    public int setBits(int left){

        int setBits = 0;

        while(left > 0){
            int curr = left % 2;
            if(curr != 0) setBits++;

            left = left/2;
        }

        return setBits;
    }

    public int countPrimeSetBits(int left, int right) {
        
        int bincount = 0;

        while(left <= right ){

            int setBits = setBits(left);

            if(setBits < 2) bincount = bincount;
            else{
                int factors = 0;
                for(int i =2; i < setBits; i++){
                if(setBits % i == 0) factors++;
                }
                if(factors > 0) bincount = bincount + 0;
                else bincount++;
            }

            left++;
        }

        return bincount;
    }
}