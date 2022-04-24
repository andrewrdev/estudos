package conditional;

public class Program {
    public static void main(String[] args) {

        byte position = 4;

        // if else ------------------------------------------------------------

        System.out.println("==== IF ELSE ===============");

        if (position == 1) {

            System.out.println("Position: 1");

        } else if (position == 2) {

            System.out.println("Position: 2");

        } else if (position == 3) {

            System.out.println("Position: 3");

        } else {

            System.out.println("Position: invalid");

        }

        // switch -------------------------------------------------------------

        System.out.println("==== Switch ================");

        switch (position) {

            case 1:
                System.out.println("Position: 1");
                break;
            case 2:
                System.out.println("Position: 2");
                break;
            case 3:
                System.out.println("Position: 3");
                break;
            default:
                System.out.println("Position invalid");

        }

    }
}
