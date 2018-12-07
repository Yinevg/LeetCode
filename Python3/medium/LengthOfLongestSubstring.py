class LengthOfLongestSubstring:
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        if len(s) <= 1:
            return len(s)
        longest = 0
        start = 0
        dic = {}
        # for i in range(len(s)):
        #     if s[i] in dic:
        #         start = max(start, dic[s[i]] + 1)
        #     dic[s[i]] = i
        #     longest = max(longest, i - start + 1)
        for idx, c in enumerate(s):
            if c in dic:
                start = max(start, dic[c] + 1)
            dic[c] = idx
            longest = max(longest, idx - start + 1)
        return longest
