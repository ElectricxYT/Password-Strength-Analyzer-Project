import java.util.Scanner;
/**
 * Main class
 * Executes the code within PasswordAnalyzer.java and CommonPasswords.java
 *
 * @author Kaden Williams, January 25, 2026
 */

public class Main{

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        PasswordAnalyzer analyzer = new PasswordAnalyzer(keyboard);
        analyzer.startPasswordAnalysis();

        keyboard.close();
    }
}
