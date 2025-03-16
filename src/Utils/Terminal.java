package Utils;

import java.io.IOException;

public class Terminal {

    public static void showInvalidOption() {
        showInvalidOption("Informe uma opção válida.");
    }

    public static void showInvalidOption(String message) {
        System.out.println(message);
        System.console().readLine();
    }

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException ex) {
            System.out.println("Erro ao limpar a tela!");
        }
    }
}
