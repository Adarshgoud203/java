interface printable{
void print();
}
class A6 implements printable{
public void print()
{System.out.println("Hello");}
}
class Test{
public static void main(String args[]){
A6 b=new A6();
b.print();
}
}