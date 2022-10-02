public class ExIfOperationSwitch {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Le programme prend trois arguments");
            System.out.println("Le premier est un nombre entier");
            System.out.println("Le second est + - x ou /");
            System.out.println("Le troisième est un nombre entier");
            return;
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);
        switch (args[1]) {
            case "+" -> System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + (x + y));
            case "-" -> System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + (x - y));
            case "x" -> System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + (x * y));
            case "/" -> System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + (x / y));
            default -> System.out.println("Utilisez les caractères + - x / pour indiquer l'opération de votre choix");
        }
    }
}
