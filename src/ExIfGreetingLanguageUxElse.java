public class ExIfGreetingLanguageUxElse {
    public static void main(String[] args) {
        if (args.length >= 2) {
            if (args[0].equals("EN") || args[0].equals("FR") || args[0].equals("NL")) {
                if (args[0].equals("EN")) {
                    System.out.print("Hello ");
                }
                if (args[0].equals("FR")) {
                    System.out.print("Bonjour ");
                }
                if(args[0].equals("NL")) {
                    System.out.print("Hallo ");
                }
                for (int i = 1;i < args.length; ++i) {
                    System.out.print(args[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("Le programme ne supporte que les langues EN FR NL");
            }
        } else {
            System.out.println("Vous devez introduire au minimum deux arguments");
            System.out.println("1. la langue avec le choix suivant EN FR NL");
            System.out.println("2. le nom de la personne à saluer");
        }
    }
}
