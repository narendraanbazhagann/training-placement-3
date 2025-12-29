class Solution(object):
    def mostWordsFound(self, sentences):
        m=0
        for i in sentences:
            a=i.split(" ")
            if(m<len(a)):
                m=len(a)
        return m
