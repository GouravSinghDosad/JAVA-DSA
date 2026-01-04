class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        
        int[] arr1 = new int[n];
        for(int k = 0; k < n; k++){
            arr1[k] = score[k];
        }

        String[] arr2 = new String[n];
        for(int j = 0; j < n; j++){
            arr2[j] = String.valueOf(score[j]);
        }
        Arrays.sort(arr1);


        for(int i = 0; i < n; i++){
            if(score[i] == arr1[n-1]){
                arr2[i] = "Gold Medal"; 
            }else if(score[i] == arr1[n-2]){
                arr2[i] = "Silver Medal";
            }else if(score[i] == arr1[n-3]){
                arr2[i] = "Bronze Medal";
            }else{
                for(int j = 0; j < n; j++){
                    if(score[i] == arr1[j]){
                        arr2[i] = String.valueOf(n-j);
                        break;
                    }
                }
            }
        }

        return arr2;
    }
}