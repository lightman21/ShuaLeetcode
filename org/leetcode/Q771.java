package org.leetcode;

/**
 * Created by lightman_mac on 2018/7/9.
 * <p>
 * https://leetcode-cn.com/problems/jewels-and-stones/description/
 * <p>
 * <p>
 * 771. 宝石与石头
 * <p>
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * <p>
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 */
public class Q771 {

    public static void main(String[] args) {
        String J = "aA", S = "aAAbbbb";
        int count = numJewelsInStones(J, S);
        System.out.println(count);
    }

    public static int numJewelsInStones(String J, String S) {
        char[] chsJ = J.toCharArray();
        char[] chsS = S.toCharArray();
        int hit = 0;
        for (int i = 0; i < chsS.length; i++) {
            if (isJewel(chsS[i], chsJ)) {
                hit++;
            }
        }
        return hit;
    }

    private static boolean isJewel(char c, char[] chs) {
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] == c)
                return true;
        }

        return false;
    }
}
