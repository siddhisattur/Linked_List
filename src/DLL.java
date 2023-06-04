public class DLL {

    private Node head;
    private Node tail=null;

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null)
            head.prev=node;
        head=node;
    }

    public void insertLast(int val){
        Node node=new Node(val);
        if(head==null){
            node.prev=null;
            head=node;
        }
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
        last=node;
    }

    public void display(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print(node.value+" <--> ");
            last=node;
            node=node.next;
        }
        System.out.println("END");
        System.out.println("Print in reverse");
        while (last!=null){
            System.out.print(last.value +" <--> ");
            last=last.prev;
        }
        System.out.println("START");
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

    public void insertAfter(int after,int val){
        Node p=find(after);
        if(p==null){
            System.out.println("node dosent exist");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null)
            node.next.prev=node;
    }

    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        Node last=head;
        if(head==null){
            last=null;
        }
        while(last.next!=null){
            last=last.next;
        }

        return val;
    }
    public Node get(int index){ //returns node at a given index
        Node node=head;
        for(int i=0;i<index;i++)
            node=node.next;
        return node;
    }

    public void deleteLast(){
        if(head==null)
            return;
        else{
            if(head!=tail){
                tail=tail.prev;
                tail.next=null;
            }
            else{
                head=tail=null;
            }
        }

    }


    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node(int value) {
            this.value = value;
        }
    }
}
