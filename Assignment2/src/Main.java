public class Main {
    public static void main(String[] args) {
        Librarian sarah = new Librarian(1, "sarah", "abylaikhan 12a", 3);
        System.out.println(sarah.getAccess());
        System.out.println(sarah.getInfo());

        Customer zhandos = new Customer(2, "zhandos", "obshaga", 15);
        System.out.println(zhandos.getAccess());
        System.out.println(zhandos.getInfo());
        zhandos.address = "sd";
    }
}