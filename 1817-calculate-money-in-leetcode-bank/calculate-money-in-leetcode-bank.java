class Solution {
    public int totalMoney(int n) {
        
        int weeks = n/7;
        int days = n%7;

        int current = weeks*28 + ((weeks *(weeks-1))/2) *7;

        for(int i = 0; i < days; i++){
            current += weeks+ i+1;
        }

        return current;

    }
}