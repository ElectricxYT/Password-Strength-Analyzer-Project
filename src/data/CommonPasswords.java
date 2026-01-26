import java.util.HashSet;
/**
 * CommonPasswords class
 * Contains an Array of common passwords for the user's password to be checked against.
 *
 * @author Kaden Williams, January 8, 2026
 */
public class CommonPasswords {
    private static final HashSet<String> commonPasswords = new HashSet<>(); //Create a HashSet to store common passwords in

    static {
        commonPasswords.add("123456");
        commonPasswords.add("admin");
        commonPasswords.add("12345678");
        commonPasswords.add("123456789");
        commonPasswords.add("12345");
        commonPasswords.add("password");
        commonPasswords.add("Aa123456");
        commonPasswords.add("1234567890");
        commonPasswords.add("Pass@123");
        commonPasswords.add("admin123");
        commonPasswords.add("1234567");
        commonPasswords.add("123123");
        commonPasswords.add("111111");
        commonPasswords.add("12345678910");
        commonPasswords.add("P@ssw0rd");
        commonPasswords.add("Password");
        commonPasswords.add("Aa@123456");
        commonPasswords.add("admintelecom");
        commonPasswords.add("Admin@123");
        commonPasswords.add("112233");
        commonPasswords.add("102030");
        commonPasswords.add("654321");
        commonPasswords.add("abcd1234");
        commonPasswords.add("abc123");
        commonPasswords.add("qwerty123");
        commonPasswords.add("Abcd@1234");
        commonPasswords.add("Pass@1234");
        commonPasswords.add("11223344");
        commonPasswords.add("admin@123");
        commonPasswords.add("87654321");
        commonPasswords.add("987654321");
        commonPasswords.add("qwerty");
        commonPasswords.add("123123123");
        commonPasswords.add("1q2w3e4r");
        commonPasswords.add("Aa112233");
        commonPasswords.add("12341234");
        commonPasswords.add("qwertyuiop");
        commonPasswords.add("11111111");
        commonPasswords.add("Admin");
        commonPasswords.add("Password@123");
        commonPasswords.add("asd123");
        commonPasswords.add("Aboy1234");
        commonPasswords.add("123321");
        commonPasswords.add("admin1");
        commonPasswords.add("Admin123");
        commonPasswords.add("Demo@123");
        commonPasswords.add("1q2w3e4r5t");
        commonPasswords.add("admin1234");
        commonPasswords.add("aa123456");
        commonPasswords.add("121212");
    }

    /**
     * Checks whether the given password is a common password.
     */
    public static boolean isCommonPassword(String password){
        return commonPasswords.contains(password); //returns TRUE if the HashSet contains the password
    }
}
