# Java Die Simulation Project

A lightweight Object-Oriented Programming (OOP) project built in Java to demonstrate core inheritance principles, method overriding, and statistical probability testing.

## 🚀 Project Components

1. **`Die.java`**: Models a standard 6-sided die using a `protected` value field and a shared random number generator. 
2. **`LoadedDie.java`**: A child class extending `Die` that overrides the `roll()` method to exclude `1`s, restricting outcomes to values between 2 and 6.
3. **`TestLoadedDie.java`**: A driver application that runs comparative simulations (1,000 rounds each) pitting a standard die against both another standard die and a loaded die to analyze win-rate probabilities.

## 🛠️ OOP Concepts Demonstrated
* **Inheritance:** `LoadedDie` inherits properties and methods from `Die`.
* **Method Overriding:** Customizing the `roll()` behavior in the subclass.
* **Encapsulation:** Utilizing `protected` access modifiers for seamless parent-child data sharing.

## 💻 How to Run
1. Clone the repository or download the source files.
2. Compile all files in your terminal or IDE:
   ```bash
   javac Die.java LoadedDie.java TestLoadedDie.java
   