import java.util.*;
class TestjavaCollections4{
public static void main(String args[]){
Stack<String> stack=new Stack<String>();
stack.push("Ayush\t");
stack.push("Gravit\t");
stack.push("Amit\t");
stack.push("Ashish\t");
stack.push("Garima\t");
stack.pop();
Iterator<String> itr=stack.iterator();
while(itr.hasNext()){
System.out.print(itr.next());
}
}
}


