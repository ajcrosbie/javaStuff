public class FizzBuzz {
    public static void main(String args[]) {
        int fizz = 5;
        int buzz = 3;
        for (int i = 0; i < 101; i++) {
            if (i % (fizz * buzz) == 0) {
                System.out.println("fizzBuzz");
            } else if (i % buzz == 0) {
                System.out.println("Buzz");
            } else if (i % fizz == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}