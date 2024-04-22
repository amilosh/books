public class Main {

    public static void main(String[] args) {
        args = fillArgs();
        try {
            Args arg = new Args("l,p#,d*", args);
            boolean logging = arg.getBoolean('l');
            int port = arg.getInt('p');
            String directory = arg.getString('d');
            System.out.println();
        } catch (ArgsException e) {
            System.out.printf("Argument error: %s\n", e.errorMessage());
        }
    }

    private static String[] fillArgs() {
        return new String[]{"-l", "-p123"};
    }
}
