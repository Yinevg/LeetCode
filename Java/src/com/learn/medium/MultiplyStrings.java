package com.learn.medium;

/**
 * Created by Yinevg on 2019/1/23
 * <p>
 * Given two non-negative integers num1 and num2 represented as strings, return the product
 * of num1 and num2, also represented as a string.
 * <p>
 * Example 1:
 * Input: num1 = "2", num2 = "3"
 * Output: "6"
 * <p>
 * Example 2:
 * Input: num1 = "123", num2 = "456"
 * Output: "56088"
 * <p>
 * Note:
 * The length of both num1 and num2 is < 110.
 * Both num1 and num2 contain only digits 0-9.
 * Both num1 and num2 do not contain any leading zero, except the number 0 itself.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] pos = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int temp = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p = i + j, q = i + j + 1;
                temp += pos[q];
                pos[p] += temp / 10;
                pos[q] = temp % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : pos) {
            if (!(i == 0 && sb.length() == 0)) {
                sb.append(i);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
