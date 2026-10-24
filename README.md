# Bubble Tea Preparation Using the Strategy Pattern

## 1. Project Overview

This project implements the Strategy design pattern in Java. The example focuses on preparing three types of bubble tea: classic milk tea, brown sugar tea, and fruit tea.

Each preparation method is implemented in a separate class. All strategies follow the same interface, which allows the selected preparation method to be changed at runtime without modifying the context class.

## 2. Implementation

The project consists of the following classes:

- **BubbleTeaStrategy** — defines the `prepareTea()` method that must be implemented by each preparation strategy.
- **ClassicPreparationStrategy** — implements the preparation steps for classic milk bubble tea.
- **BrownSugarPreparationStrategy** — implements the preparation steps for brown sugar bubble tea.
- **FruitTeaPreparationStrategy** — implements the preparation steps for fruit bubble tea.
- **BubbleTeaMaker** — acts as the context. It stores a reference to the current strategy, allows the strategy to be changed through `setStrategy()`, and delegates preparation to `prepareTea()`.
- **Main** — acts as the client. It creates the context, selects the strategies, and demonstrates their execution.

## 3. Program Execution

The `Main` class demonstrates the following sequence:

1. Create a `BubbleTeaMaker` with the classic preparation strategy.
2. Prepare classic milk bubble tea.
3. Change the strategy to brown sugar preparation and execute it.
4. Change the strategy to fruit tea preparation and execute it.

The program uses the same context for all three preparation methods. The `BubbleTeaMaker` class does not contain conditional statements for selecting a specific strategy; it delegates the operation through the `BubbleTeaStrategy` interface.

## 4. Clean Code Principles

**1. Meaningful Names**

Class and method names describe their responsibilities. For example, `BrownSugarPreparationStrategy` identifies the preparation method, while `setStrategy()` indicates that the current strategy can be changed.

**2. Single Responsibility Principle**

Each concrete strategy handles one preparation method. `BubbleTeaMaker` manages the current strategy and delegates the preparation process instead of implementing the details of each tea.

**3. Polymorphism Instead of Conditional Statements**

All concrete strategies implement `BubbleTeaStrategy`. The context calls `prepareTea()` through this interface instead of using `if-else` or `switch` statements to select a preparation method.

**4. Separation of Responsibilities**

The interface defines the common method, concrete strategies implement the preparation steps, the context delegates execution, and the client selects the strategy. Each component therefore has a distinct role.

**5. Open/Closed Principle**

A new preparation method can be introduced by creating another class that implements `BubbleTeaStrategy`. The existing concrete strategies and `BubbleTeaMaker` do not need to be modified to support the new strategy.

## 5. Technologies

- Java
- Object-Oriented Programming
- Strategy Design Pattern

## 6. How to Run

1. Open the project in IntelliJ IDEA.
2. Configure a Java Development Kit (JDK).
3. Open `src/Main.java`.
4. Run the `main()` method.

The program displays the preparation steps for all three bubble tea variants in the console.
