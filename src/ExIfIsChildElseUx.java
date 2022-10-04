public class ExIfIsChildElseUx {
    public static void main(String[] args) {
        if (args.length >= 1) {
            if (Integer.parseInt(args[0]) < 18) {
                System.out.println("Tu es un enfant");
            } else {
                System.out.println("Tu es un adulte");
            }
        } else {
            System.out.println("Vous devez donner l'âge de la personne");
            System.out.println("Par exemple 'java ExIfIsChildElseUx 90");
        }
    }
}
