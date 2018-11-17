class ValidParentheses:
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        dic = {'(': ')', '[': ']', '{': '}'}
        for i in range(len(s)):
            if s[i] in dic.keys():
                stack.append(dic[s[i]])
            else:
                if stack == [] or stack.pop() != s[i]:
                    return False
        return stack == []
