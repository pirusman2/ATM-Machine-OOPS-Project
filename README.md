ATM Machine - OOPS Project 💳
A simple, console-based Java application that simulates the core functionalities of an Automated Teller Machine (ATM). This project demonstrates the use of Object-Oriented Programming principles such as classes, objects, and method encapsulation.

 Features
Secure Access: Requires a 4-digit PIN (Default: 1122) to access account features.

Check Balance: View current account holdings.

Deposit Money: Add funds to the account.

Withdraw Money: Remove funds with automated "Insufficient Balance" validation.

Interactive Menu: A user-friendly command-line interface for seamless navigation.

 Technical Stack
Language: Java

Concepts: * Class and Object creation

Methods and Recursion

User input handling via Scanner

Conditional Logic (if-else)

📂 Project Structure
Plaintext
├── src/
│   ├── Main.java     # Entry point of the application
│   └── ATM.java      # Contains ATM logic and data
└── README.md         # Project documentation
📖 How to Run
Ensure you have JDK (Java Development Kit) installed on your machine.

Clone this repository:

Bash
git clone https://github.com/pirusman2/ATM-Machine-OOPS-Project.git
Navigate to the src folder:

Bash
cd ATM-Machine-OOPS-Project/src
Compile the code:

Bash
javac Main.java
Run the application:

Bash
java Main
 Future Enhancements
[ ] Add support for multiple user accounts using a HashMap.

[ ] Implement Transaction History (Mini-statement).

[ ] Add PIN change functionality.

[ ] Enhance security by limiting login attempts.

How to add this to your GitHub:
Create a new file in your local ATM-Machine-OOPS-Project folder called README.md.

Paste the text above and save it.

Run these commands in your terminal:

PowerShell
git add README.md
git commit -m "docs: add project documentation"
git push origin main
