class MedianOfTwoSortedArrays:
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        len1 = len(nums1)
        len2 = len(nums2)
        resultLen = len1 + len2
        result = []
        index1 = index2 = 0
        while index1 < len1 and index2 < len2:
            if nums1[index1] < nums2[index2]:
                result.append(nums1[index1])
                index1 += 1
            else:
                result.append(nums2[index2])
                index2 += 1
        while index1 < len1:
            result.append(nums1[index1])
            index1 += 1
        while index2 < len2:
            result.append(nums2[index2])
            index2 += 1
        if resultLen % 2 == 0:
            return (result[resultLen // 2 - 1] + result[resultLen // 2]) / 2
        else:
            return result[resultLen // 2]
