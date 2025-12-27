class Solution {
    public int countSegments(String s) {

        
       s = s.trim();
        if(s.isEmpty()){
            return 0;
        }


        String[] arr = s.split("\\s+");
        int n = arr.length;
        return n;
    }
}