package com.stillwalking.dailyTraining;

import java.util.HashMap;
import java.util.Map;

/***
 * @Description:
 * 给你字符串 key 和 message ，分别表示一个加密密钥和一段加密消息。解密 message 的步骤如下：
 *
 * 使用 key 中 26 个英文小写字母第一次出现的顺序作为替换表中的字母 顺序 。
 * 将替换表与普通英文字母表对齐，形成对照表。
 * 按照对照表 替换 message 中的每个字母。
 * 空格 ' ' 保持不变。
 * 例如，key = "happy boy"（实际的加密密钥会包含字母表中每个字母 至少一次），据此，可以得到部分对照表（'h' -> 'a'、'a' -> 'b'、'p' -> 'c'、'y' -> 'd'、'b' -> 'e'、'o' -> 'f'）。
 *
 *
 * @Author wyb
 * @Date 2023年02月01日 23:52  
 */
public class DecodeMessage {

    public static String decodeMessage(String key, String message) {

        char cur = 'a';
        Map<Character, Character> rules = new HashMap<Character, Character>();

        for (int i = 0; i < key.length(); ++i) {
            char c = key.charAt(i);
            if (c != ' ' && !rules.containsKey(c)) {
                rules.put(c, cur);
                ++cur;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); ++i) {
            char c = message.charAt(i);
            if (c != ' ') {
                c = rules.get(c);
            }
            sb.append(c);
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepusv";
        String s = decodeMessage(key, message);
        System.out.println(s);
    }

}
