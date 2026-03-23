class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        List<String> req = new ArrayList<>();

        if(words.length == 1){
            req.add(words[0]);
            return req;
        }

        int i = 0;
        while(i < words.length){
            if(req.size() == 0){
                req.add(words[i]);
            }
            else if(!(compare(words[i],req.get(req.size()-1)))){
                req.add(words[i]);
            }
            i++;
        }
        return req;
    }

    static boolean compare(String s1, String s2){
        char[] first = s1.toCharArray();
        char[] second = s2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);
        
        return Arrays.equals(first, second);
    }
}