# Overview

The Password Strength Analyzer is a Java-based command-line application that evaluates user-entered passwords, provides a clear strength rating, and offers actionable suggestions for improvement. It applies real-world cybersecurity principles, secure coding practices, and object-oriented design.

This project emphasizes secure coding practices, object-oriented design, and practical cybersecurity principles.

## Why This Project

Weak passwords remain one of the most common attack vectors in modern security breaches, often enabling brute-force and dictionary attacks. This project translates core password security concepts (such as keyspace expansion, entropy improvement, and defensive input validation) into a practical, user-facing tool.

As an aspiring cybersecurity engineer, this project allowed me to:

- Apply security theory in a real-world context

- Practice clean, modular Java design

- Demonstrate algorithmic reasoning and defensive programming

## Key Features

- Analyze passwords for:
  - Length
  - Uppercase letters
  - Lowercase letters
  - Digits
  - Symbols
  - Consecutive repeated characters
  - Common weak passwords (top 50 most common)
- Weighted scoring system with strength classifications:
  - Weak (0–2)
  - Moderate (3–4)
  - Strong (5–6)
  - Very Strong (7)
- Personalized recommendations to improve password security
- Session-based analysis: check multiple passwords in a single program run

## Scoring & Classification

Passwords are scored using a weighted system based on:

- Password length

- Presence of multiple character categories

- Penalties for excessive repetition

- Penalties for commonly used passwords

Final strength ratings:

- Weak: 0–2

- Moderate: 3–4

- Strong: 5–6

- Very Strong: 7

## User Feedback

- Displays a breakdown of character composition

- Outputs a clear strength rating

- Provides personalized improvement suggestions

- Explains criteria required to achieve a Very Strong password

# Program Structure
## PasswordAnalyzer.java

- Core analysis and scoring logic

- Encapsulates password attributes using instance variables

- Uses modular private methods for:

    - Character analysis

    - Repetition detection

    - Score calculation

    - Strength classification

    - Recommendation generation

## CommonPasswords.java

- Stores and provides access to a list of commonly used weak passwords

- Enables dictionary-based penalty detection

# Example Session

Hello! Please input your password, and I will evaluate its strength:

*P@ssword123*

Analysis Complete
Your password has:
1 Uppercase letters
6 Lowercase letters
3 Digits (Numbers)
1 Symbol

Your password's strength is: Strong

Your password is strong, but it could be even stronger. To improve your password:

To increase the strength of your password, ensure that it: 
 - Has a minimum of 13 characters 
 - Has at least one lowercase letter 
 - Has at least one uppercase letter 
 - Has at least one digit (number) 
 - Has at least one symbol 
 - Doesn't have any repeating characters 
 - Is not a common password

Meet these requirements and be sure to change your password every 3 months!

Would you like to check another password? Please type 'Yes' or 'No'

*No*

Thank you for using the Password Strength Analyzer. Have a great day!


## Design & Engineering Highlights

- Encapsulates password attributes in `PasswordAnalyzer` objects for modularity and clarity
- Static variables track session-level behavior (multi-password checks)
- Clear separation of methods for character analysis, repetition detection, scoring, and suggestions
- Easy to extend for future features such as GUI, entropy-based scoring, or expanded repetition rules


# Technologies Used

### Language

- Java

### Tools

- IntelliJ IDEA

### Concepts & Skills

- Object-Oriented Programming (OOP)

- Input validation

- Algorithmic problem-solving

- Secure coding principles

- Defensive programming

# Future Improvements

- Replace array-based common password lookup with a HashSet for faster lookups

- Add entropy-based scoring for more precise strength evaluation

- Implement a graphical user interface (GUI)

- Extend repetition detection beyond consecutive characters

- Add unit testing for scoring and validation logic


