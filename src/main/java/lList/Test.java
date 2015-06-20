package lList;

/**
 * Created by javior on 15/6/20.
 */
public class Test {
    public static void main(String[] args){
        Node last = null;
        for(int i=0;i<100;i++){
            Node node = new Node(i,last);
            last = node;
        }

        /*while (last.getNext()!=null){
            print(last.getValue()+"-->"+last.getNext());
            last = last.getNext();
        }*/
        //last = transfer(null,last);
        last = forreach(last);

        while (last.getNext()!=null){
            print(last.getValue()+"-->"+last.getNext());
            last = last.getNext();
        }








    }

    static Node transfer(Node last,Node current){
        if (current == null) return last;
        Node next = current.getNext();
        current.setNext(last);
       return transfer(current,next);
    }

    static Node forreach(Node first){
        Node last = null;
        Node current = first;
        while (current.getNext()!=null){
            Node next = current.getNext();
            current.setNext(last);
            last = current;
            current = next;
        }
        return last;
    }

    static void print(Object o){
        System.out.println(o);
    }


}
