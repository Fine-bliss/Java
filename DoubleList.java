//双向链表
class ListNode1{
    public int data;
    public ListNode1 next;
    public ListNode1 prev;
    public ListNode1(int data){
        this.data = data;
    }
}

class DoubleList {
    public ListNode1 head;
    public ListNode1 last;


    //头插法
    public void addFirst(int data){
        ListNode1 cur = new ListNode1(data);
        if(this.head == null){
            this.head = cur;
            this.last = cur;
        }else{
            cur.next = this.head;
            this.head.prev = cur;
            this.head = cur;
        }
    }

    //尾插法
    public void addLast(int data){
        ListNode1 cur = new ListNode1(data);
        if(this.head == null){
            this.head = cur;
            this.last = cur;
        }else{
            this.last.next = cur;
            cur.prev = this.last;
            this.last = cur;
        }
    }
    //打印链表
    public void display() {
        if (this.head == null) {
            return;
        }
        ListNode1 cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    //得到链表的长度
    public int size(){
        ListNode1 cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    private ListNode1 searchIndex(int index){
        if(index < 0 || index >= size()){
            return null;
        }
        ListNode1 cur = this.head;
        while(index > 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //插入到index节点
    public void addIndex(int index,int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        if(index == size()){
            addLast(data);
            return;
        }
        //中间插入
        ListNode1 node = new ListNode1(data);
        ListNode1 cur = searchIndex(index);
        if(cur == null) {
            return ;
        }
        node.next =  cur;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;
    }
    //查找是否包含关键字key是否在链表当中
    public boolean contains(int key){
        ListNode1 cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除key节点
    public void remove(int key){
        ListNode1 cur = this.head;
        while (cur != null){
            if(cur.data == key){
                if(cur.data == this.head.data) {
                    //key为头
                    this.head = this.head.next;
                    this.head.prev = null;
                }else{
                    //key为中间
                    cur.prev.next = cur.next;
                  if(cur.next != null){
                      cur.next.prev = cur.prev;
                  }else{
                      this.last = this.last.prev;
                  }
                }
                return;
            }
            cur = cur.next;
        }
    }
    //删除所有为key的节点
    public  void removeAllKey(int key){
        ListNode1 cur = this.head;
        while (cur != null){
            if(cur.data == key){
                if(cur.data == this.head.data) {
                    //key为头
                    this.head = this.head.next;
                    this.head.prev = null;
                }else{
                    //key为中间
                    cur.prev.next = cur.next;
                    if(cur.next != null){
                        cur.next.prev = cur.prev;
                    }else{
                        //key为尾巴
                        this.last = this.last.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }
    public  void clear(){
        while(this.head != null){
            ListNode1 cur = this.head.next;
            this.head.next = null;
            this.head.prev = null;
            this.head = cur;
        }
        this.last = null;
    }
}
