## Overview
This document explains how to compile and run the Password Strength Analyzer from the command line.

## Prerequisites

- Java Development Kit (JDK) 8 or higher

- A terminal or command prompt

- (Optional) IntelliJ IDEA or another Java IDE

To verify Java is installed, run:

```java -version```

## Project Files

Ensure the following files are present in the same directory:

- Main.java

- PasswordAnalyzer.java

- CommonPasswords.java

## Compile the Program

From the project root directory, run:

```javac Main.java PasswordAnalyzer.java CommonPasswords.java```


This will generate the corresponding ```.class``` files.

## Run the Program

After compiling, run:

```java Main```

## Using the Program

1. When prompted, enter a password.

2. Review the strength rating and suggestions.

3. Choose whether to analyze another password.

4. Type Yes to continue or No to exit.

## Example
```
Hello! Please input your password, and I will evaluate its strength:
P@ssword123
```
## Notes

- Input is case-sensitive.

- Empty passwords are rejected and re-prompted.

- The program runs until the user chooses to exit.

## Troubleshooting

**Error: ```javac``` not recognized**

- Ensure the JDK is installed

- Ensure Java is added to your system PATH

**Error: Could not find or load main class Main**

- Ensure you compiled all .java files

- Ensure you are running the command from the correct directory

## IDE Users (Optional)

If using IntelliJ IDEA:

1. Open the project folder

2. Ensure Main.java is set as the run configuration

3. Click Run
