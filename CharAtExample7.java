javac import java.util.ArrayList;
import java.util.Scanner;

 class CountDigitsUsingArrayList {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a string: ");
String inputString = scanner.nextLine();

ArrayList<Character> digitsList = new ArrayList<>();

for (int i = 0; i < inputString.length(); i++) {
char currentChar = inputString.charAt(i);

if (Character.isDigit(currentChar)) {
digitsList.add(currentChar);
}
}
 System.out.println("Digits in the string: " + digitsList);
System.out.println("Number of digits: " + digitsList.size());
scanner.close();
}
}