/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-11-03
 * Time: 11:35
 */
public class TestDemo {
        //合并两个有序链表
        public static ListNode mergeTwoLists(ListNode headA,ListNode headB){
                ListNode newHead = new ListNode(-1);
                ListNode tmp = newHead;
                while(headA != null && headB != null){
                        if(headA.data < headB.data){
                                tmp.next = headA;
                                headA = headA.next;
                                tmp = tmp.next;
                        }else{
                                tmp.next = headB;
                                headB = headB.next;
                                tmp = tmp.next;
                        }
                }
                if(headA == null){
                        tmp.next = headB;
                }
                if(headB  == null){
                        tmp.next = headA;
                }
                return newHead.next;
        }

        //判断两个单链表是否相交
        public static ListNode getIntersectionNode(ListNode headA,ListNode headB){
                if(headA == null || headB == null){
                        return null;
                }
                ListNode pl = headA;//永远指向长链表
                ListNode ps = headB;//永远指向短链表
                int lenA = 0;
                int lenB = 0;
                //求lenA lenB的长度
                while(pl.next != null){
                        lenA++;
                        pl = pl.next;
                }
                while(ps.next != null){
                        lenB++;
                        ps = ps.next;
                }
                pl = headA;
                ps = headB;
                //求两个链表差值
                int len = lenA - lenB;
                if(len < 0) {
                        pl = headB;
                        ps = headA;
                        len = lenB - lenA;
                }
                //让pl先走len步
                while (len > 0){
                        pl = pl.next;
                        len--;
                }
                //开始一人一步走
                while (pl.next != ps.next){
                        pl = pl.next;
                        ps = ps.next;
                }
                if(pl.next == null){
                        return null;
                }
                return pl.next;
        }
        //写一个相交的节点
        public static void  creatCut(ListNode headA,ListNode headB) {
                headA.next.next = headB.next.next.next;
        }
        //复杂列表的复制(复制一个带指针的链表）



    public static void main(String[] args) {
            MySingleList mySingleList = new MySingleList();
            //mySingleList.addIndex(0,199);
            mySingleList.addLast(1);
            mySingleList.addLast(3);
            mySingleList.addLast(5);
            mySingleList.addLast(7);
            mySingleList.addLast(9);
            mySingleList.display();
            MySingleList mySingleList2 = new MySingleList();
            mySingleList2.addLast(2);
            mySingleList2.addLast(4);
            mySingleList2.addLast(6);
            mySingleList2.addLast(10);
            mySingleList2.addLast(12);
            mySingleList2.addLast(14);
            mySingleList2.addLast(16);
            mySingleList2.addLast(18);
            mySingleList2.display();
            creatCut(mySingleList.head,mySingleList2.head);
            ListNode node = getIntersectionNode(mySingleList.head,mySingleList2.head);
            System.out.println(node.data);
            //ListNode newHead = mergeTwoLists(mySingleList.head,mySingleList2.head);
            //mySingleList.display2(newHead);
           //ListNode newHead =  mySingleList.chkPalindrome();

        /*mySingleList.addIndex(0,2);
        mySingleList.display();
        mySingleList.addIndex(7,2);
        mySingleList.display();//99 199 1 2 3 4 5 999

        mySingleList.clear();
        System.out.println("fakfalls");

        mySingleList.removeAllKey(2);
        mySingleList.display();
       mySingleList.remove(99);
        System.out.println("删除99");
        mySingleList.display();//199 1 2 3 4 5 999
        mySingleList.remove(999);
        System.out.println("删除999");
        mySingleList.display();//199 1 2 3 4 5
        mySingleList.remove(2);
        System.out.println("删除2");
        mySingleList.display();//199 1 3 4 5*/

       /* boolean flg = mySingleList.contains1(99);
        System.out.println(flg);

        ListNode node = mySingleList.contains2(500);
        System.out.println(node.data);//5节点的地址*/
    }
}
