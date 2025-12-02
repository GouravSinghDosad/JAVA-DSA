class Solution {
    public String[] findWords(String[] words) {

        boolean status = false;

        String regEx1 = "^[qwertyuiopQWERTYUIOP]+$";
        String regEx2 = "^[asdfghjklASDFGHJKL]+$";
        String regEx3 = "^[zxcvbnmZXCVBNM]+$";

        List<String> newNames = new ArrayList<>();

        for(int i = 0; i < words.length; i++){

            if(words[i].matches(regEx1)){
                newNames.add(words[i]);
            }else if(words[i].matches(regEx2)){
                newNames.add(words[i]);
            }else if(words[i].matches(regEx3)){
                newNames.add(words[i]);
            }

        }

        String[] array = newNames.toArray(new String[0]);

        return array;
    }
}