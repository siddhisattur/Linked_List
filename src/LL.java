public class LL {

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int val){

        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        if(head==null){
            head=node;
        }
        tail.next=node;
        tail=node;
        size+=1;
    }

    public void insertatIndex(int val,int idx){
        if(idx==0){
            insertLast(val);
        }
        if(idx==size){
            insertLast(val);
        }

        Node temp=head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    public void display(){
        Node node=head;
        while(node!=null){
            System.out.print(node.value+" - > ");
            node=node.next;
        }
        System.out.println("End");
    }

    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public Node get(int index){ //returns node at a given index
        Node node=head;
        for(int i=0;i<index;i++)
            node=node.next;
        return node;
    }

    public Node find(int value){ //returns node of a given value
        Node node=head;
        while(node!=null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }

        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        return val;
    }

    public int deleteAtIndex(int idx){
        if(idx==0){
            return deleteFirst();
        }
        if(idx==size-1){
            return deleteLast();
        }
        Node prev=get(idx-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;
    }

    private Node head;
    private Node tail;
    private int size;

    public LL() {

        this.size = 0;
    }

    private class  Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.next=next;
            this.value=value;
        }
    }

    //***************************************
    //       IMP QUESTIONS
    //***************************************

    public void inserRecursion(int val,int index){

    }


}
