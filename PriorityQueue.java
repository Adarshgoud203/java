import java.util.*;
class TestJava{
public static void main(String args[]){
PriorityQueue<String>queue=new PriorityQueue<String>();
queue.add("Amit Sha");
queue.add("KGF");
queue.add("KGF2");
queue.add("Guntur Kaarram");
System.out.println("head:"+queue.element());
System.out.println("head:"+queue.peek());
System.out.println("iterating the queen elements: ");
iterator itr= queue.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
queue.remove();
queue.poll();
System.out.println("after removing two elements:");
Iterator<String>itr2=queue.iterator();
while(itr2.hasNext()){System.out.println(itr2.next());}
}
}