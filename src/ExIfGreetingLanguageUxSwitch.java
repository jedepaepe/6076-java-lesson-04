public class ExIfGreetingLanguageUxSwitch {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Vous devez introduire au minimum deux arguments");
            System.out.println("1. la langue avec le choix suivant EN FR NL");
            System.out.println("2. le nom de la personne à saluer");
            return;
        }

        switch (args[0]) {
            case "EN" -> System.out.print("Hello ");
            case "FR" -> System.out.print("Bonjour ");
            case "NL" -> System.out.print("Hallo ");
            default -> {
                System.out.println("Le programme ne supporte que les langues EN FR NL");
                return;
            }
        }

        for (int i = 1;i < args.length; ++i) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
    }
}
