public class ExIfIsChild {
    public static void main(String[] args) {
        if (Integer.parseInt(args[0]) < 18) {
            System.out.println("Tu es un enfant");
        }
        if (Integer.parseInt(args[0]) >= 18) {
            System.out.println("Tu es un adulte");
        }
    }
}
