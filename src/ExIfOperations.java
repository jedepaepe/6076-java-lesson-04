public class ExIfOperations {
    public static void main(String[] args) {
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
