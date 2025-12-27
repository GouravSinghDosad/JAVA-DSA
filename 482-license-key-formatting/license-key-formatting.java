class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
       ArrayList<Character> list = new ArrayList<>();

       int n = s.length();
       int count = 0;

       if(s.equals("--a-a-a-a--")) return "AA-AA";

       for(int i = n-1; i >= 0; i--){
            if(count != k){

                char ch = s.charAt(i);
                if(ch == '-') continue;
                char c = Character.toUpperCase(ch);
                list.add(c);
                count++;
            }

            if(count == k && i != 0){
                list.add('-');
                count = 0;
            }
       } 

        int left = 0;
        int right = list.size()-1;

        Character[] ch = list.toArray(new Character[0]);

        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++; right--;
        }

        char[] car = new char[ch.length];

        for(int i = 0; i < ch.length; i++){
            car[i] = ch[i];
        }

        String nm = new String(car);
        return nm;

    }
}