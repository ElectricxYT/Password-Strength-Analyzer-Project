# Overview

The Password Strength Analyzer is a Java-based command-line application that evaluates the strength of a user-entered password and provides a clear strength rating as well as personalized recommendations for improvement. The analyzer scores passwords using multiple security-focused criteria, including length, character diversity, repetition detection, and comparison against a list of common weak passwords.

This project emphasizes secure coding practices, object-oriented design, and practical cybersecurity principles.

## Why This Project

Weak passwords remain one of the most common attack vectors in modern security breaches, often enabling brute-force and dictionary attacks. This project translates core password security concepts (such as keyspace expansion, entropy improvement, and defensive input validation) into a practical, user-facing tool.

As an aspiring cybersecurity engineer, this project allowed me to:

- Apply security theory in a real-world context

- Practice clean, modular Java design

- Demonstrate algorithmic reasoning and defensive programming

## Features
- Password Analysis

- Length-based scoring with penalties for passwords under 8 characters

- Detection and counting of:

    - Uppercase letters

    - Lowercase letters

    - Digits (numbers)

    - Symbols

- Detection of consecutive repeated characters

- Comparison against a curated list of common weak passwords

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


