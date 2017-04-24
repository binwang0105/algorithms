class Solution(object):
     
    def failfunc(self, s):
        ss = s + s[::-1]
        cnd = 0
        pos = 2
        t = [0 for x in range(len(ss)+1)]
        print t
        t[0] = -1
         
        while pos <= len(ss):
            if pos == len(s):
                pos += 1
            elif ss[pos-1] == ss[cnd]:
                cnd+=1
                t[pos] = cnd
                pos+=1
            elif cnd > 0:
                cnd = t[cnd]
            else:
                t[pos] = 0
                pos += 1
                cnd = 0
        return t[-1]
         
         
    def shortestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        if len(s)==0:
            return s
        m = self.failfunc(s)
        if m >= len(s):
            return s
        else:
            return s[m:][::-1]+s
         
         
