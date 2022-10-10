public class RevisionIf {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Il y a moins de 3 arguments");
        } else {
            System.out.println("Il y a 3 arguments ou plus");
        }
    }
}
