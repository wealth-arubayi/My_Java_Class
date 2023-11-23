// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class input {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("What is my name: ");
//         String name = scanner.nextLine();

//         System.out.println("What is your Age : ");
//         int age = scanner.nextInt();

//         System.out.println("Your Name is: " + name + "Your Age is: " + age);
//         scanner.close();

//       try {
//         age = scanner.nextInt();
//       } catch (InputMismatchException e){
//         System.out.println("What you provided is not coorect");
//         scanner.nextLine();
//         System.out.println(e.getMessage());
//       } finally {
//         age = scanner.nextInt();
//       }
//       }
//     }import java.util.InputMismatchException;
// import java.util.Scanner;

// public class input {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("What is my name: ");
//         String name = scanner.nextLine();

//         System.out.println("What is your Age : ");
//         int age = scanner.nextInt();

//         System.out.println("Your Name is: " + name + "Your Age is: " + age);
//         scanner.close();

//       try {
//         age = scanner.nextInt();
//       } catch (InputMismatchException e){
//         System.out.println("What you provided is not coorect");
//         scanner.nextLine();
//         System.out.println(e.getMessage());
//       } finally {
//         age = scanner.nextInt();
//       }
//       }
//     }
    import java.util.InputMismatchException;
import java.util.Scanner;

public class input {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    
    System.out.println("What is your name ?");
    
    String name = scanner.nextLine();
            
    System.out.println("What is your age ?");

    int age;
    try {
             age = scanner.nextInt();
    } catch (InputMismatchException e) {
       System.out.println("The was an error" + e.getMessage());
       scanner.nextLine();
            // age = scanner.nextInt();
    }finally{
        
        age = scanner.nextInt();

    }

    // System.out.println("Your name is "+ name +" and you are "+ age +" years old");

scanner.close();
}
}

//handle errors
class multiply{

multiply(){
System.out.println(5/0);
}
}