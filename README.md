# Number Guessing Game

A robust, console-based implementation of the classic "Guess the Number" game written in Java. This project demonstrates core programming concepts including random number generation, input validation, and control flow logic.

## 📝 Project Description

The **Number Guessing Game** challenges the user to find a hidden number within a specific range. Unlike standard guessing games, this application allows the user to define their own number range (Min/Max) and select a difficulty level that determines the number of attempts allowed.

The program provides real-time feedback ("Higher" or "Lower") to guide the user toward the correct number before they run out of attempts.

## ✨ Key Features

- **Customizable Range:** Users set the lower and upper bounds for the random number generation.
- **Difficulty Levels:** Four distinct difficulty settings that adjust the maximum number of attempts.
- **Input Validation:** The game checks for invalid inputs (non-integers) to prevent crashes.
- **Smart Feedback:** Tells the user if their guess is too high or too low and displays remaining attempts.

## 🎮 Game Logic & Difficulty

The game utilizes a `switch` statement to handle difficulty selection. If an invalid difficulty is chosen, the game defaults to **Medium**.

- **0. Easy:** 10 Attempts (Relaxed gameplay)
- **1. Medium:** 7 Attempts (Standard challenge, optimized for binary search strategies)
- **2. Hard:** 5 Attempts (Requires high precision)
- **3. Nightmare:** 1 Attempt (Pure luck!)

## 🛠️ Tech Stack

- **Language:** Java
- **Tools:** standard `java.util.Scanner` for input and `java.util.Random` for number generation.

## 🚀 How to Run

1. **Clone the repository** (or download the file):
   ```bash
   git clone [https://github.com/Debrup09/NumberGuessingGame.git](https://github.com/Debrup09/NumberGuessingGame.git)
