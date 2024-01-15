abstract class Bank{
abstract float getRateOfInterest();
}
class SBI extends Bank{
float getRateOfInterest(){return 7;}
}
class PNB extends Bank{
float getRateOfInterest(){return 8;}
}
class ICIC  extends Bank{
float getRateOfInterest(){return 6;}
}
class Andhra extends Bank{
float getRateOfInterest(){return 5;}
}
class Fedreal extends Bank{
float getRateOfInterest(){return 4;}
}
class TestBank{
public static void main(String args[]){
Bank b;
b=new SBI();
System.out.println("Rate of interest is : "+b.getRateOfInterest()+"%");
b=new PNB();
System.out.println("Rate of interest is : "+b.getRateOfInterest()+"%");
b=new ICIC();
System.out.println("Rate of interest is : "+b.getRateOfInterest()+"%");
b=new Andhra();
System.out.println("Rate of interest is : "+b.getRateOfInterest()+"%");
b=new Fedreal();
System.out.println("Rate of interest is : "+b.getRateOfInterest()+"%");
}}

 