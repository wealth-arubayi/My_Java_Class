public class AssignmentOperators {

    public static void main(String[] args) {
        int x = 15;
        // int y = 2;

        int addition = x += 5;
        int subtraction = x -= 5;
        int multiplication = x *= 5;
        int division = x /= 5;
        int modulus = x %= 5;
        int bitwiseAND = x &= 3;
        int bitwiseOR = x |= 3;
        int bitwiseXOR = x ^= 3;
        int bitwiseRight = x >>= 3;
        int bitwiseLeft = x <<= 3;


        System.out.println("This is the result for addition " + addition);
        System.out.println("This is the result for subtraction " + subtraction);
        System.out.println("This is the result for multiplication " + multiplication);
        System.out.println("This is the result for division " + division);
        System.out.println("This is the result for modulus " + modulus);
        System.out.println("This is the result for bitwiseAND " + bitwiseAND);
        System.out.println("This is the result for bitwiseOR " + bitwiseOR);
        System.out.println("This is the result for bitwiseXOR " + bitwiseXOR);
        System.out.println("This is the result for bitwiseRight " + bitwiseRight);
        System.out.println("This is the resultforbitwiseLeft " + bitwiseLeft);
    }
    
}
