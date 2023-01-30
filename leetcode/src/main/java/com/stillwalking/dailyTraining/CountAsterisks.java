package com.stillwalking.dailyTraining;

/**
 * 给你一个字符串 s ，每 两个 连续竖线 '|' 为 一对 。换言之，第一个和第二个 '|' 为一对，第三个和第四个 '|' 为一对，以此类推。
 * 请你返回 不在 竖线对之间，s 中 '*' 的数目。
 * 注意，每个竖线 '|' 都会 恰好 属于一个对。
 *
 * @author wyb
 * @date 2023/1/29 9:36
 */
public class CountAsterisks {

    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";
        int i = countAsterisks(s);
        System.out.println(">>>>>>>>>>*号出现的次数：" + i);
    }

    public static int countAsterisks(String s) {
        // 统计偶数个竖线之后出现的*号数
        int N = s.length();
        // 竖线出现的次数
        int count = 0;
        // 星号出现的次数
        int starCount = 0;
        for (int i = 0; i < N; i++) {
            if (count % 2 == 0 && s.charAt(i) == '*') {
                starCount++;
            }
            if (s.charAt(i) == '|') {
                count++;
            }
        }
        return starCount;
    }

}
