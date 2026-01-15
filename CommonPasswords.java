/**
 * CommonPasswords class
 *Contains an Array of common passwords for the user's password to be checked against.
 *
 * @author Kaden Williams, January 15, 2026
 */
public class CommonPasswords {
    public static String[] commonPasswords = {  //This Array will hold the top 50 Most Common Passwords (According to NordPass)
            "123456", "admin", "12345678", "123456789", "12345", "password", "Aa123456", "1234567890", "Pass@123", "admin123", "1234567", "123123", "111111", "12345678910", "P@ssw0rd", "Password", "Aa@123456", "admintelecom", "Admin@123", "112233", "102030", "654321", "abcd1234", "abc123", "qwerty123", "Abcd@1234", "Pass@1234", "11223344", "admin@123", "87654321", "987654321", "qwerty", "123123123", "1q2w3e4r", "Aa112233", "12341234", "qwertyuiop", "11111111", "Admin", "Password@123", "asd123", "Aboy1234", "123321", "admin1", "Admin123", "Demo@123", "1q2w3e4r5t", "admin1234", "aa123456", "121212"
    };

    /**
     * Returns an array containing the top 50 most common passwords.
     * @return String Array 'commonPasswords', which contains the top 50 most common passwords.
     */
    public static String[] checkCommonPasswords(){
        return commonPasswords;
    }

}

