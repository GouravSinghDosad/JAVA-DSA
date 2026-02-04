class Solution {
    public int[] getNoZeroIntegers(int n) {
        

        int a = 1;
        int b = n-1; 

        for(int i = 1; i < n; i++){
            // a  = n/2;
            // b = n/2;
            if(String.valueOf(a).contains("0") || String.valueOf(b).contains("0")){
                a++;
                b--;
            }
        }

        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;

        return arr;

    }
}