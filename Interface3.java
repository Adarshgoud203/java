//Interface decleration: by first user
interface Drawable{
void draw();
}
//Implementation: by second user
class Rectangle implements Drawable{
public void draw()
{System.out.println("drawing rectangle");}
}
class circle implements Drawable{
public void draw()
{System.out.println("drawing circle");}
}
//using interface third user
class TestInterface{
public static void main(String args[]){
Drawable d=new circle();
//in real scenario,objects is provided by method e.g. getDrawable()
d.draw();
}
}