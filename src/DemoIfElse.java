public class DemoIfElse {
    public static void main(String[] args) {
        if (args.length >= 1) {
            System.out.println("Bonjour "+ args[0]);
        } else {
            System.out.println("Veuillez introduire le nom de la personne");
            System.out.println("Par exemple java DemoIfElse Sarah");
        }
    }
}
