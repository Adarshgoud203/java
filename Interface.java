 interface Bank{
float rateOfInterest();
}
class SBI implements Bank{
public float rateOfInterest(){return 9.15f;}
}
class HDFC implements Bank{
public float rateOfInterest(){return 10.15f;}
}
class TestInterface{
public static void main(String args[]){
Bank b=new SBI();
System.out.print("ROI"+b.rateOfInterest());
}
}