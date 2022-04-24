public class Program {
    public static void main(String[] args) {
        String name = "Dean Winchester";
        String name2 = "Sam & ";

        System.out.println(name.charAt(2));
        System.out.println(name.length());
        System.out.println(name.replace("Dean", "Sam"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(0, 3));
        System.out.println(name.trim());
        System.out.println(name2.concat(name));
    }
}
