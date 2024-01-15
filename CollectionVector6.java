class VectorExample2
{
public static void main(Strng args[])
{
Vector<Integer>in=new Vector<>();
in.add(100);
in.add(200);
in.add(300);
in.add(400);
in.add(500);
in.add(600);
in.add(700);
in.add(800);
System.out.println("values in vector:"+in);
System.out.println("Remove first occourence of element 200:"+in.remove((Integer)200));
System.out.println("values in  vector: "+in);
System.out.println("Remove elements at index 4:"+in.remove(4));
System.out.println("new value list in vector:"+in);
in.removeElementAt(5);
System.out.println("vector element after removal: "+in);
