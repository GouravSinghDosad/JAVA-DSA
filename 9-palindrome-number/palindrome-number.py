class Solution:
    def isPalindrome(self, x: int) -> bool:
        
        strs = str(x)
        first = 0
        last = len(strs)-1
        while(first < last):
            if(strs[first] != strs[last]):
                return False
            
            first = first+1
            last = last-1

        
        return True