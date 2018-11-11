class PalindromeNumber:
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0:
            return False
        result = 0
        temp = x
        while temp != 0:
            result = result * 10 + temp % 10
            temp //= 10
        return result == x
