class Solution {
    public int[] sortByBits(int[] arr) {
        HashMap<Integer, Integer> bitC = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int count = bitCount(arr[i]);
            bitC.put(arr[i],count);
        }

        Integer[] temp = new Integer[arr.length];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }

            Arrays.sort(temp, (a,b) ->{

              int bitA = bitC.get(a);  
              int bitB = bitC.get(b);

              if(bitA == bitB) return a-b;

              return bitA - bitB;  
            });

        for(int i =0 ;i < arr.length; i++){
            arr[i] = temp[i];
        }
        return arr;
    }
    public int bitCount(int n){
            int count = 0;
            while(n > 0){
                if(n%2 == 1) count++;
                n = n/2;
            }
            return count;
        }
}