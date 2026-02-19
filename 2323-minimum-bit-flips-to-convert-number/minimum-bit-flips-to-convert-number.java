class Solution {
    public int minBitFlips(int start, int goal) {
        
        String bin1 = "";

        if(start == 0) bin1 = "0";
        while(start > 0){
            bin1 = (start%2) + bin1;
            start = start/2;
        }

        String bin2 = "";

        if(goal == 0) bin2 = "0";
        while(goal > 0){
            bin2 = (goal%2) + bin2;
            goal = goal/2;
        }

        while(bin1.length() < bin2.length()) bin1 = "0" + bin1;
        while(bin1.length() > bin2.length()) bin2 = "0" + bin2;

        char[] arr1 = bin1.toCharArray();
        char[] arr2 = bin2.toCharArray();

        int steps =0;

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                arr1[i] = arr2[i];
                steps++;
            } 
        }

        return steps;
    }
}