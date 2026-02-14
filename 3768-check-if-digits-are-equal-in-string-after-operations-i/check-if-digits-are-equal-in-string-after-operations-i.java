class Solution {
    public boolean hasSameDigits(String s) {
        
        if(s.length() == 2 && (s.charAt(0) == s.charAt(1)) ){
            return true;
        }
        
        if(s.length() == 2 && (s.charAt(0) != s.charAt(1)) ){
            return false;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            Integer num = Integer.valueOf(s.charAt(i) - '0');
            list.add(num);
        }
        int size = list.size();

        // for(int i = 0; i < s.length(); i++){
        //     char n = s.charAt(i);
        //     Integer num = Character.digit(n, 10); 
        //     list.add(num);
        // }

        while( size > 2){
            for(int i = 0; i < size-1; i++){
                int sum = (list.get(i) + list.get(i+1)) % 10;
                list.set(i, sum);
            }

            list.remove(size-1);
            size--;
        }

        if(list.get(0) == list.get(1)) return true;

        return false;

    }
}