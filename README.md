# Password-Strength-Analyzer-Project

# Objective

In this project, I will use Java to create an algorithm that takes an inputted password, evaluates its strength, rates its strength, and then provides feedback on how to improve the complexity of the password. 

# Why Create a Password Strength Analyzer?
As an aspiring cybersecurity engineer, understanding and mitigating common security weaknesses is critical, and weak passwords remain one of the most prevalent attack vectors. Passwords often serve as the first line of defense against unauthorized access, yet many users underestimate how vulnerable simple or short passwords are to modern brute-force and dictionary attacks.

The strength of a password is directly influenced by both its length and complexity. Increasing the number of characters and incorporating a mix of uppercase and lowercase letters, numbers, and symbols exponentially expands the possible keyspace, significantly increasing the time and computational effort required for an attacker to crack it. For example, a 4-digit PIN offers only 10,000 possible combinations (10⁴), whereas a four-character password using uppercase and lowercase letters provides over 7.3 million combinations (56⁴).

As password length and character diversity increase, the number of possible combinations grows exponentially. An eight-character password that includes uppercase and lowercase letters, numbers, and symbols results in trillions of possible combinations, making brute-force attacks computationally impractical with current hardware. This project was created to demonstrate these security principles in a tangible way and to help users better understand how small changes in password construction can dramatically improve account security. 

### Tools Used
IntelliJ

### Programming Language Used
Java

# Steps

## Step 1: Planning

|-| First, I decided to complete my code within one class. The class will import the Scanner utility and contain a method that takes the input of the user (the password) and evaluates it's strength.

|-| I thought of creating a scoring system, where after the password has been evaluated it's score will determine it's rating. 

## Step 2: Pseudocode

Writing out pseudocode makes it so much easier for me to write code, as it organizes my thoughts and effectively helps me plan. As such, here is the pseudocode I wrote before programming in Java: 

Import Scanner Utility
Greet the user and ask them to input their password. 
Create a scoring variable to hold the password's score. Initialize it to 0.
Create a password length variable to store the length of the password. 
Create 4 variables that will count the number of uppercase letters, lowercase letters, numbers, and symbols contained within the password. 
Create a variable that will check if a character is repeated. 
Check the length of the password. If it it less than eight characters long, decrease the scoring variable by 1. If it is between 8 and 12 characters long, increase the scoring variable by 2. If it is 13 or more characters long, increase the scoring variable by 3. 
Loop through each character in the password.
    Increase the respective counter depending on if the current character is either an uppercase letter, lowercase letter, number, or symbol
    If the current character matches the previous character, increase the character repeat variable by 1
Evaluate the score:
    If the number of repeated characters is greater than 2, decrease the scoring variable by 1. 
    Increase the scoring variable by 1 for each of these cases:
        The number of upper case letters is greater than 0
        The number of lower case letters is greater than 0
        The number of symbols is greater than 0
        The number of numbers is greater than 0
    Check the pasword against a list of common passwords. If the password matches, decrease the score by 2. 
Output to the user their score. Weak: 0 - 2, Moderate: 3 - 4, Strong: 5 - 6, Very Strong: 7. If the score is less than 0, make it 0. 
    If the password is less than 8 characters long, suggest that the user increase the length of the password to at least 8 characters.
    If the password doesn't contain any lowercase letters, suggest that the user includes some.
    If the password doesn't contain any uppercase letters, suggest that the user includes some.
    If the password doesn't contain any numbers, suggest that the user includes at least one number.
    If the password doesn't contain any symbols, suggest that the user includes at least one symbol.
End the program.


