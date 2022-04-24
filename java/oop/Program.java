package oop;

public class Program {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();

        user1.name = "User name";
        user1.email = "user1@email.com";
        user1.password = "145adff45";

        user2.name = "User 2 name";
        user2.email = "user2@email.com";
        user2.password = "a25d545f#@";

        user1.printUser();

        System.out.println("================================================");

        user2.printUser();
    }
}
