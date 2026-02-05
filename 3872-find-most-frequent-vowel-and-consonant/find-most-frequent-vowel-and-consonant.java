class Solution {
    public int maxFreqSum(String s) {
        
        int vowelFreq = 0;
        int consonentFreq = 0;

        HashMap<Character, Integer> myMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            myMap.put(s.charAt(i), myMap.getOrDefault(s.charAt(i), 0)+1);
        }

        String vowel = "aeiou";

        for(Map.Entry<Character, Integer> entry: myMap.entrySet()){

            if(vowel.contains(String.valueOf(entry.getKey()))){
                if(entry.getValue() >= vowelFreq) vowelFreq = entry.getValue(); 
            }else{
                if(entry.getValue() >= consonentFreq) consonentFreq = entry.getValue(); 
            }
        }

        int sum = vowelFreq + consonentFreq;
        return sum;
    }
}