package arrays;

public class Program {
    public static void main(String[] args) {

        // array --------------------------------------------------------------

        int[] numbers = new int[5];
        String[] rockBands = { "AC/DC", "Metallica", "Led Zeppelin" };
        String[] games = new String[] { "Resident Evil", "Silent Hill", "God of War" };

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        for (byte i = 0; i < numbers.length; i++) {
            System.out.println("Number: " + numbers[i]);
        }

        for (String game : games) {
            System.out.println("Game: " + game);
        }

        for (String band : rockBands) {
            System.out.println("Band: " + band);
        }

        // Multidimensional Arrays --------------------------------------------

        int[][] days = new int[3][3];
        String[][] music = new String[][] { { "Beatles" }, { "Michael Jackson" }, { "Bob Marley" } };
        String[][] languages = { { "HTML", "CSS", "Javascript" }, { "PHP", "Java", "C#" }, { "MySQL", "PostgreSQL" } };

        days[0][0] = 1;
        days[0][1] = 3;
        days[0][2] = 5;

        days[1][0] = 7;
        days[1][1] = 9;
        days[1][2] = 11;

        days[2][0] = 13;
        days[2][1] = 15;
        days[2][2] = 17;

        for (int i = 0; i < days.length; i++) {

            for (int j = 0; j < days[i].length; j++) {
                System.out.println("Day: " + days[i][j]);
            }

        }

        for (String[] arrBase : music) {

            for (String item : arrBase) {
                System.out.println("Music: " + item);
            }

        }

        for (String[] arrBase : languages) {

            for (String language : arrBase) {
                System.out.println("Language: " + language);
            }
        }

    }
}
