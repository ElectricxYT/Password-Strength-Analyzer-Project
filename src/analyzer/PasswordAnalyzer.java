import java.util.Scanner;
/**
 * PasswordAnalyzer class
 * Takes the password from the user and evaluates its strength before returning its score and
 * suggestions for improvement.
 *
 * @author Kaden Williams, January 8, 2026
 */

public class PasswordAnalyzer {
    private static Scanner keyboard; //Create the scanner object 'keyboard' for the whole class to use
    private String pswd; //This variable will hold the user's password
    private int score; //This variable will hold the password's complexity score
    private int pswlength; //This variable will hold the length of the password
    private int numOfUpper; //This variable will hold the number of uppercase letters
    private int numOfLower; //This variable will hold the number of lowercase letters
    private int numOfSymb; //This variable will hold the number of symbols
    private int numOfDigits; //This variable will hold the number of digits (numbers)
    private int numOfRepeats; //This variable will hold the number of repeats
    private boolean isCommon; //This variable will hold a boolean that indicates whether the user's password is common or not
    private static int counter = 0;//Tracks the number of times the user checks a password.
    private static boolean failedLast = false; //Checks whether the last inputted password invalid ("")?

    public PasswordAnalyzer(Scanner keyboard){ // Create a PasswordAnalyzer object to hold details of the user's password based on the input contained within the keyboard object from Main.java
        this.keyboard = keyboard;
        score = 0;
        numOfUpper = 0;
        numOfLower = 0;
        numOfSymb = 0;
        numOfDigits = 0;
        numOfRepeats = 0;
        isCommon = false;
    }

    public PasswordAnalyzer(String pswd){  //Constructor for PasswordAnalyzer objects with a String parameter
        this.pswd = pswd;
        score = 0;
        pswlength = pswd.length();
        numOfUpper = 0;
        numOfLower = 0;
        numOfSymb = 0;
        numOfDigits = 0;
        numOfRepeats = 0;
        isCommon = false;
    }


    /**
     * Check each character in the password and add to the respective count depending on
     * if it's either an upper/lowercase letter, digit, or symbol.
     */
    private void checkCharacters(){
        for(int i = 0; i < pswd.length(); i++){
            char c = pswd.charAt(i);
            if(Character.isUpperCase(c)){
                numOfUpper++;
            }else if(Character.isLowerCase(c)){
                numOfLower++;
            }else if(Character.isDigit(c)){
                numOfDigits++;
            }else if(!Character.isLetterOrDigit(c)){
                numOfSymb++;
            }
        }
    }

    /**
     * Checks the user's password for any repetitions in upper or lowercase letters,
     * digits, or symbols, incrementing 'numOfRepeats' for each repetition found.
     */
    private void hasRepeats(){
        for(int i = 1; i < pswd.length(); i++){
            if(pswd.charAt(i) == pswd.charAt(i - 1)){
                numOfRepeats++;
            }
        }
    }

    /**
     * Calculates the score of the user's password.
     * @return  The score of the user's password (Weak, Moderate, Strong, Very Strong).
     */
    private void calculateScore(){
        String[] commonPasswords;

        if(pswd.length() < 8){
            score--;
        }else if(pswd.length() >= 8 && pswd.length() < 13){
            score+=2;
        }else if(pswd.length() >= 13){
            score+=3;
        }

        if(numOfUpper > 0){
            score++;
        }

        if(numOfLower > 0){
            score++;
        }

        if(numOfDigits > 0){
            score++;
        }

        if(numOfSymb > 0){
            score++;
        }

        if(numOfRepeats > 2){
            score--;
        }

        if (CommonPasswords.isCommonPassword(pswd)) { //Check to see if the password is in the HashSet located in CommonPasswords.java
            score -= 2;
            isCommon = true;
        }

    }

    /**
     * Displays to the user the criteria that must be met in order to have a Very Strong password.
     * @return  A String containing the aspects of a strong password.
     */
    private static String passwordCriteria(){
        String criteria = "\n -Has a minimum of 13 characters \n -Has at least one lowercase letter \n -Has at least one uppercase letter \n -Has at least one digit (number) \n -Has at least one symbol \n -Doesn't have any repeating characters \n -Is not a common password";
        return criteria;
    }

    /**
     * Provides suggestions to improve the user's password
     */
    private void provideScore(){
        if(score <= 2){ //If the user's password is Weak
            System.out.println("Your password's strength is: Weak");
        }else if(score == 3 || score == 4){ //If the user's password is Moderate
            System.out.println("Your password's strength is: Moderate");
        }else if(score == 5 || score == 6){ //If the user's password is Strong
            System.out.println("Your password's strength is: Strong");
        }
        if(score == 7){ //If the user's password is Very Strong
            System.out.println("Your password's strength is: Very Strong");
        }
    }

    private String provideSuggestions(){
        String suggestions = ""; //This String will hold all of the password-specific suggestions.
        String specificSuggestions = ""; //This String will hold info on what the user's password needs and will be added to String suggestions.
        String addUpper = "\n -Add some Uppercase Letters";
        String addLower = "\n -Add some Lowercase Letters";
        String addDigits = "\n -Add some Digits (numbers)";
        String addSymbols = "\n -Add some Symbols";
        String common = "\n -Do not use Common Passwords (Top 200 most common passwords: https://nordpass.com/most-common-passwords-list/ )";

        if (numOfUpper == 0){  //If there are no uppercase letters, add a String informing the user to add some to their password to String specificSuggestions
            specificSuggestions += addUpper;
        }

        if (numOfLower == 0){ //If there are no lowercase letters, add a String informing the user to add some to their password to String specificSuggestions
            specificSuggestions += addLower;
        }

        if (numOfDigits == 0){ //If there are no Digits, add a String informing the user to add some to their password to String specificSuggestions
            specificSuggestions += addDigits;
        }

        if (numOfSymb == 0){ //If there are no Symbols, add a String informing the user to add some to their password to String specificSuggestions
            specificSuggestions += addSymbols;
        }

        if (isCommon){
            specificSuggestions += common;
        }

        /* Based on the password's score, add the password's specific suggestions
         (String specificSuggestions) to String suggestions as well as add
         the criteria of a Very Strong password to String suggestions.
        */
        if(score == 7){
            suggestions = "Congratulations! Your password meets the following criteria: ";
            suggestions += passwordCriteria();
            suggestions += "\n Be sure to change your password every 3 months!";
        }else if(score == 6 || score == 5){
            suggestions = "Your password is strong, but it could be even stronger. To improve your password: ";
            suggestions += specificSuggestions;
            suggestions += "\n To increase the strength of your password, ensure that it: ";
            suggestions += passwordCriteria();
            suggestions += "\n Meet these requirements and be sure to change your password every 3 months!";
        }else if (score == 4 || score == 3){
            suggestions = "Your password needs some work. To improve your password: ";
            suggestions += specificSuggestions;
            suggestions += "\n To increase the strength of your password, ensure that it: ";
            suggestions += passwordCriteria();
            suggestions += "\n Meet these requirements and be sure to change your password every 3 months!";
        }else if (score <= 2){
            suggestions = "Your password needs a lot of improvement. To improve your password: ";
            suggestions += specificSuggestions;
            suggestions += "\n To increase the strength of your password, ensure that it: ";
            suggestions += passwordCriteria();
            suggestions += "\n Meet these requirements and be sure to change your password every 3 months!";
        }
        return suggestions; //Return the String of suggestions
    }

    /**
     * Add toString method to display the number of uppercase letters, lowercase letters, symbols, and digits.
     */
    public String toString(){
        String n = "Your password has: ";
        n+="\n"+numOfUpper+" Uppercase letters.";
        n+="\n"+numOfLower+" Lowercase letters.";
        n+="\n"+numOfDigits+" Digits (Numbers).";
        n+="\n"+numOfSymb+" Symbols.";
        return n;
    }

    /**
     * Contains the code for analyzing the user's password, allowing them to continuously check passwords until satisfied
     */
    public void startPasswordAnalysis(){
        boolean active = true;
        while(active) {
            if (counter == 0) {
                System.out.println("Hello! Please input your password, and I will evaluate its strength:"); //Ask the user to input their password
            } else if (counter > 0 && failedLast == true) {
                System.out.println("\nPlease input a valid password, and I will evaluate its strength");
            } else if (counter > 0) {
                System.out.println("Welcome back! Please input another password, and I will evaluate its strength");
            }

            String input = keyboard.nextLine(); //Store the user's password in String variable 'password'
            if (input.equals("")) { //If nothing is inputted, inform the user to input a valid password and restart the method
                System.out.println("No password received. Please input a password.");
                failedLast = true;
                counter++;
                continue; //Restart the loop
            }
            counter++;
            failedLast = false;
            PasswordAnalyzer password = new PasswordAnalyzer(input); //Create a new PasswordAnalyzer 'password'

            //Part 1: Get the number of lowercase letters, uppercase letters, symbols, digits, and repeated characters
            password.checkCharacters();
            password.hasRepeats();
            //Calculate the score of the password. Minimum of 0, maximum of 7
            password.calculateScore();

            //Part 2: Display to the user their score as well as suggestions (if needed) to improve their password
            System.out.println("Analysis Complete");
            System.out.println(password); //Call the toString method and display the numbers collected in Part 1
            password.provideScore(); //Provide the user their password's score (Weak, Moderate, Strong, or Very Strong)
            System.out.println();
            System.out.println(password.provideSuggestions()); //Provide the user suggestions to improve their password's strength

            //Part 3: Ask the user if they'd like to check another password
            boolean checkAnswer = true; //Make sure this code repeats if an invalid response is given
            while (checkAnswer) {
                System.out.println("Would you like to check another password? Please type 'Yes' or 'No'");
                String answer = keyboard.nextLine();
                if (answer.equals("Yes")) {
                    checkAnswer = false;
                    continue;
                } else if (answer.equals("No")) {
                    System.out.println("Thank you for using the Password Strength Analyzer. Have a great day!");
                    checkAnswer = false;
                    active = false; //Close the loop
                } else {
                    System.out.println("Invalid response. Please type 'Yes' or 'No'");
                }
            }
        }
    }

}
