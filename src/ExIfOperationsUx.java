public class ExIfOperationsUx {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Le programme prend trois arguments");
            System.out.println("Le premier est un nombre entier");
            System.out.println("Le second est + - x ou /");
            System.out.println("Le troisième est un nombre entier");
            return;
        }
        if (! args[1].equals("+") && ! args[1].equals("-") && ! args[1].equals("x") && ! args[1].equals("/")) {
            System.out.println("Utilisez les caractères + - x / pour indiquer l'opération de votre choix");
            return;
        }
        System.out.print(args[0] + " " + args[1] + " " + args[2] + " = ");
        if (args[1].equals("+")) {
            System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[2]));
        }
        if (args[1].equals("-")) {
            System.out.println(Integer.parseInt(args[0]) - Integer.parseInt(args[2]));
        }
        if (args[1].equals("x")) {
            System.out.println(Integer.parseInt(args[0]) * Integer.parseInt(args[2]));
        }
        if (args[1].equals("/")) {
            System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[2]));
        }
    }
}