public class ExIfGreeting2Ux {
    public static void main(String[] args) {
        if (args.length >= 2) {
            System.out.println("Bonjour " + args[0] + " " + args[1]);
        } else {
            System.out.println("Vous devez introduire deux arguments");
            System.out.println("Par exemple 'java ExIfGreeting2Ux Simon Lefranc");
        }
    }
}
