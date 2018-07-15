package org.leetcode.string;

/**
 * Created by lightman_mac on 2018/7/15.
 * https://leetcode-cn.com/problems/reverse-words-in-a-string/description/
 * 翻转字符串里的单词
 * 输入: "the sky is blue",
 * 输出: "blue is sky the".
 */
public class Q151 {
    public static void main(String[] args) {
        String input = " the sky is     blue   ";
        input = simpleReverseWords(input);
        System.out.println(input);
    }

    /***
     *
     */
    public static String simpleReverseWords(String s) {
        String res = "";
        String[] words = s.trim().split("\\s+");
        for (int i = words.length - 1; i > 0; i--) {
            res += words[i] + " ";
        }
        return res + words[0];
    }

    public static String reverseWords(String s) {
        if (s == null || s.length() <= 1) return s;
        s = s.trim().replaceAll("\\s+", " ");
        if (s.length() == 0) return s;

        int n = 0;
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] == ' ') {
                reverse(chs, n, i - 1);
                n = i + 1;
            }
        }

        reverse(chs, n, chs.length - 1);
        reverse(chs, 0, chs.length - 1);
        return new String(chs);
    }

    private static void reverse(char[] chs, int i, int j) {
        while (i < j) {
            char tmp = chs[i];
            chs[i] = chs[j];
            chs[j] = tmp;
            i++;
            j--;
        }
    }
}
