package Calculator;

public class MainApp {
    public static void main(String[] args) {

        String arg;

        if (args.length > 0) {
            arg = args[0];
        } else {
            arg = "0";
        }

        new MainFrame(arg);
    }
}
