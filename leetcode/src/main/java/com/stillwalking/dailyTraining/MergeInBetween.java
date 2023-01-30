package com.stillwalking.dailyTraining;

import java.util.List;

/**
 * @Description:
 *  给你两个链表 list1 和 list2 ，它们包含的元素分别为 n 个和 m 个。
 *  请你将 list1 中下标从 a 到 b 的全部节点都删除，并将list2 接在被删除节点的位置。
 *
 * @Author wyb
 * @Date 2023年01月31日 0:15  
 */
public class MergeInBetween {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode na = list1;
        for (int i = 0; i < a - 1; i++) {
            na = na.next;
        }
        ListNode nb = na;
        for (int i = 0; i < b - a + 2; i++) {
            nb = nb.next;
        }
        na.next = list2;
        while (list2.next != null) {
            list2 = list2.next;
        }
        list2.next = nb;
        return list1;

    }


}
