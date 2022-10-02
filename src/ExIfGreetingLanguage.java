public class ExIfGreetingLanguage {
    public static void main(String[] args) {
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
    }
}
