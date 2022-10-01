public class ExIfGreeting2HelpBetter {
    public static void main(String[] args) {
        if (args.length == 2) {
            System.out.println("Bonjour " + args[0] + " " + args[1]);
        } else {
            System.out.println("L'application prend deux arguments : le prénom et le nom");
        }
    }
}
