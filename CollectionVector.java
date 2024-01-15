import java.util.Vector;
class Main{
public static void main(String args[]){
Vector<String>mammals=new Vector< >();
//Using the add() method
mammals.add("Elephant");
mammals.add("Horse");
mammals.add("Dog");
//Using the index number
mammals.add(3,"Cat");
System.out.println("Vector: "+mammals);
//Using addAll()
Vector<String> animal=new Vector<>();
animal.add("Crocodile");
animal.add("Horse baby");
animal.addAll(mammals);
System.out.println("New Vector: "+animal);
}
}