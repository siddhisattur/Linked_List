public class Main {
    public static void main(String[] args) {

//        LL list=new LL();
//        list.insertFirst(3);
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(5);
//        list.insertLast(90);
//        list.insertatIndex(100,3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.deleteAtIndex(2));

//        DLL list=new DLL();
//        list.insertFirst(3);
//        lnserist.itFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(5);
//        list.insertLast(100);
//        list.insertAfter(2,32);
//        list.deleteFirst();
//        //list.deleteLast();
//        list.display();

        CLL list=new CLL();
        list.insert(21);
        list.insert(13);
        list.insert(54);
        list.insert(78);
        list.insert(92);

        list.display();
        list.delete(54);
        System.out.println();
        list.display();
    }
}