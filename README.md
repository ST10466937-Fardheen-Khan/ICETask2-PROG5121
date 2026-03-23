# ICETask2 - Java Identity Checker

## 📌 Overview

This is a simple Java console application that prompts the user to enter their **first name, surname, and age**, and then checks whether the entered details match a predefined identity.

The program verifies if the user is:

* **Name:** Jack
* **Surname:** Khoza
* **Age:** 25

Based on the input, the program outputs whether the identity matches.

---

## 🚀 Features

* Takes user input using `Scanner`
* Performs conditional checks using `if-else`
* Uses a custom method to validate identity
* Returns a boolean result (`true` or `false`)
* Simple and beginner-friendly Java structure

---

## 🧠 How It Works

1. The user is prompted to enter:

   * First name
   * Surname
   * Age
2. The program passes these values to the `checkIdentity()` method
3. The method compares the input with predefined values
4. The program prints:

   * `"This is Jack"` if all details match
   * `"This is not Jack"` if any detail is incorrect

---

## 💻 Code Structure

```
ICETask2/
│── src/
│   └── main/
│       └── java/
│           └── com/mycompany/icetask2/
│               └── ICETask2.java
│── pom.xml
```

---

## ▶️ How to Run

### Using NetBeans / IDE

1. Open the project in your IDE
2. Ensure the main class is set to:

   ```
   com.mycompany.icetask2.ICETask2
   ```
3. Click **Run**

---

### Using Terminal (Maven)

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.mycompany.icetask2.ICETask2"
```

---

## 🧪 Example Output

```
Please enter your first name
Jack
Please enter your surname
Khoza
Please enter your age
25
This is Jack
```

```
Please enter your first name
John
Please enter your surname
Doe
Please enter your age
30
This is not Jack
```

---

## ⚙️ Technologies Used

* Java
* Maven
* NetBeans IDE

---

## 📖 Learning Outcomes

This project demonstrates:

* Basic Java syntax
* User input handling
* Method creation and usage
* Conditional logic (`if-else`)
* Boolean return types

---

## ✍️ Author

* Student Project for Programming ICE Task

---

## 📄 License

This project is for educational purposes.
