class Solution(object):
    def checkValid(self, a):
        b = [[a[j][i] for j in range(len(a))]for i in range(len(a))]
        flag = True
        for i in range(len(a)):
            if len(set(a[i])) == len(a[i]) and len(set(b[i])) == len(b[i]):
                flag = True
            else: 
                return False
        return flag      
