package TwoSum

// 以大写字母开头，表示将函数导出供包外使用。当首字母小写时，为包内使用，包外无法引用到。
func twoSum(nums []int, target int) []int {
	numMap := make(map[int]int)
	for i, n := range nums {
		preI, ok := numMap[target - n]
		if ok && numMap[target - n] != i {
			return []int{preI, i}
		}
		numMap[n] = i
	}
	return nil
}