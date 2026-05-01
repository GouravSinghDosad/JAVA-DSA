class Solution:
    def isPalindrome(self, x: int) -> bool:
        
        newString = str(x)
        j = len(newString)-1
        i = 0


        while(i < j):
            if newString[i] != newString[j]:
                return False
            
            i = i+1
            j -= 1

        return True