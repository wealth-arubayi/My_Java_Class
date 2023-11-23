import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataTypes{

    enum gender {male, female};

    public static void main(String[] args){
    // System.err.println("Hello World");
    // System.out.println(25);
    gender b = gender.male;
    boolean isValid = true;
    char character = 'W';
    short year = 2023;
    int age = 21;
    long phoneNumber = 21L;
    byte noOfInClass = 23;
    double accountBalance = 1234.23;
    float remainder = (5/2);
    String name = "Wealth";
    int[] number = {1, 2, 3, 4, 5, 6, 7, 8};
    Integer intValue = 54;
    List<String> list = new ArrayList<String>();
    list.add("Wealth");
    HashMap<String, Integer> ages = new HashMap<String, Integer>();
    ages.put("Wealth", 25);
    
    
    int x = 15;
    int y = 2;
    
    int addition = x + y;
    int subtraction = x - y;
    int multipliction = x*y;
    double diviion = x/y;
    int modulus = x % y;
    
    
    
    System.out.println("The remainder is " + remainder);
    System.out.println("The account balance is " + accountBalance);
    System.out.println("The valid answer is " + isValid);
    System.out.println(name);
    System.out.println(number);
    System.out.println(intValue);
    System.out.println(list);
    System.out.println(ages);
    System.out.println(b);
    }
}