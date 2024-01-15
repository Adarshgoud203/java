import java.util.Vector;
class Main{
public static void main(String args[]){
Vector<String>Grocery=new Vector< >();
//Using the add() method
Grocery.add("tooth paste");
Grocery.add("soap");
Grocery.add("thuruthure");
//Using the index number
Grocery.add(3,"Dal");
System.out.println("Vector: "+Grocery);
//Using addAll()
Vector<String> Data=new Vector<>();
Data.add("sampoo");
Data.add("salt");
Data.addAll(Grocery);
System.out.println("New Vector: "+Data);
}
}