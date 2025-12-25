class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character, Integer> myMap = new HashMap<>();
        for(char ch: s.toCharArray()){
            myMap.put(ch, myMap.getOrDefault(ch, 0)+1);
        }

        for(int i = 0; i < s.length(); i++){
            if(myMap.get(s.charAt(i))==1){
                return i;
            }
        }
return -1;
    }
}