class Solution {
    public boolean wordPattern(String pattern, String s) {
       
       String[] arr = s.split(" ");
       int p = pattern.length();
       int n = arr.length; 

        if(p != n){
            return false;
        }


        HashMap<Character, String> cToW = new HashMap<>();

        HashMap<String, Character> wToC = new HashMap<>();


        for(int i = 0; i < pattern.length(); i++){
            Character ch = pattern.charAt(i);
            String wd = arr[i];

            if(cToW.containsKey(ch) || wToC.containsKey(wd)){
                if( !(wd.equals(cToW.get(ch))) || wToC.get(wd) != ch){
                    return false;
                } 
            }
                else {
                    cToW.put(ch, wd);
                    wToC.put(wd, ch);
                    }
            }
        return true;
    }
}