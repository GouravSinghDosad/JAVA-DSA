class Solution {
    public int myAtoi(String s) {
        
        long num = 0;

        char[] req = s.toCharArray();

        int i =0;
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }

        String s1 = "";
        if( i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')){
                s1 = s1 + s.charAt(i);
                i++;
            }

        while( i < s.length()){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                s1 += s.charAt(i);
                i++;
            }
            else{
                break;
            }
        }

        if(s1.equals("") || s1.equals("+") || s1.equals("-")) return 0;

         try {
            return Integer.parseInt(s1);
        } catch(Exception e){
            return s1.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

    }
}