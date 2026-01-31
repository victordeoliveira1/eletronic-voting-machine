# 📘 Electronic Voting Machine – Java

This project is a **console-based electronic voting machine simulation** developed in **Java** for **study**.

It was created to practice **Java fundamentals** and **Object-Oriented Programming (OOP)** concepts through a realistic and structured example.

---

## 🎯 Project Purpose

The main goal of this project is to demonstrate:

- Understanding of Java syntax and structure
- Application of Object-Oriented Programming principles
- Clean and organized code
- Input validation and basic business rules
- Console interaction and formatted output

This repository is part of my **learning journey in software development**.

---

## 🚀 Features

- Candidate registration using objects
- Display of candidates with formatted numeric codes (e.g. `01`, `02`)
- Vote input via console
- Vote counting and percentage calculation
- Detection of winner or draw
- Handling of null (invalid) votes
- Data validation using getters and setters

---

## 🛠️ Technologies Used

- Java
- Scanner (console input)
- Object-Oriented Programming (OOP)

---

## 📂 Project Structure

```

src/
│
├── App.java                     
├── Candidate.java               
└── EletronicVotingMachine.java  

````

---

## 🧩 Class Overview

### 🔹 Candidate
Represents a candidate in the election.

**Attributes:**
- `name`
- `number`
- `votes`

**Responsibilities:**
- Store candidate data
- Validate inputs
- Manage vote count

---

### 🔹 EletronicVotingMachine
Controls the voting flow and result processing.

**Responsibilities:**
- Display candidates
- Receive and validate votes
- Count votes and calculate percentages
- Identify the winner or a draw
- Count null votes

---

### 🔹 App
Application entry point.

- Initializes candidates
- Starts the voting process

---

## 🖥️ Example Output

```
Welcome to Electronic Voting Machine!

Candidates:
01 - Ada Lovelace
02 - Alan Turing
03 - Marie Curie
04 - Albert Einstein
05 - Ludwig van Beethoven

Enter your candidate's number:

```

