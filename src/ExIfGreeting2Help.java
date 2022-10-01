public class ExIfGreeting2Help {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("L'application prend deux arguments: le prénom et le nom");
        }
        if (args.length == 2) {
            System.out.println("Bonjour " + args[0] + " " + args[1]);
        }
        if (args.length > 2) {
            System.out.println("L'application prend deux arguments : le prénom et le nom");
        }
    }
}
