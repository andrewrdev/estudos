package loops;

public class Program {
    public static void main(String[] args) {

        byte number = 0;
        String[] beatles = new String[] { "John", "Paul", "George", "Ringo" };

        // while --------------------------------------------------------------

        System.out.println("==== while ==========");

        while (number <= 10) {

            if (number == 5) {
                break;
            }

            System.out.println("Number: " + number);
            number++;
        }

        // do while -----------------------------------------------------------

        System.out.println("==== do while =======");
        number = 15;

        do {
            System.out.println("Number: " + number);
            number++;
        } while (number <= 10);

        // for ----------------------------------------------------------------

        System.out.println("==== for ============");

        for (byte i = 0; i <= 10; i++) {
            
            if (i == 5) {
                continue;
            }

            System.out.println("Number: " + i);
        }

        // foreach ------------------------------------------------------------

        System.out.println("==== foreach ========");

        for (String beatle : beatles) {
            System.out.println("Beatle: " + beatle);
        }
    }
}
