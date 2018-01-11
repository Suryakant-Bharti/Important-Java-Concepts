import java.io.*;
import java.util.*;
 
/**
 * This program demonstrates how to use the Console class to read a
 * password securely.
 *
 * @author www.codejava.net
 */
public class ConsoleLoginExample {
 
    public static void main(String[] args) throws IOException {
        Console console = System.console();
 
        if (console == null) {
            System.out.println("Console is not supported");
            System.exit(1);
        }
 
        console.printf("Welcome to Java Expert Program!\n");
        String name = console.readLine("Enter your name: ");
        char[] password = console.readPassword("Enter your password: ");
 
        char[] correctPassword = {'n', 'i', 'm', 'd', 'a'};
 
        if (Arrays.equals(password, correctPassword)) {
            console.printf("Thanks %s, you are logged in.\n", name);
        } else {
            console.printf("Sorry, you are denied.\n");
        }
 
        Arrays.fill(password, ' ');
        Arrays.fill(correctPassword, ' ');
    }
}