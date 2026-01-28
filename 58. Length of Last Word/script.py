class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        i,count_letter = len(s)-1,0
        while s[i] == ' ' : i-=1
        for k in range(i+1):
            if s[k] != ' ':
                count_letter+=1
            else:
                count_letter=0
        return count_letter