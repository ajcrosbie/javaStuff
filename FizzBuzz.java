public class FizzBuzz {
    public static void main(String args[]) {
        // int fizz = 5;
        // int buzz = 3;
        for (int i = 0; i < 101; i++) {
            String output = "";
            if (i % 5 == 0) {
                output = output + "fizz";
            }
            if (i % 3 == 0) {
                output = output + "buzz";
            }
            if (output == "") {
                output = String.valueOf(i);
            }
            System.out.println(output);

            
    }
}