package oop.modifiers;

public class Program {
    public static void main(String[] args) {
        Game game = new Game();

        game.setName("Resident Evil");
        game.setDeveloper("Capcom");
        game.setYear(1996);

        System.out.println(game.getName());
        System.out.println(game.getDeveloper());
        System.out.println(game.getYear());
    }
}
