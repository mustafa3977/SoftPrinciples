# Soft Principles Project - Polymorphism

## Problem:
Before using **Polymorphism**, different classes (Dog, Cat) had separate methods (`bark()`, `meow()`), requiring **manual method calls**.  
This made the code **inflexible** and **hard to extend**.

## Solution:
By applying **Polymorphism**:
- We created an abstract `Animal` class with a common `speak()` method.
- Dog and Cat **override** this method.
- The `Main` class now treats all animals **generically**, making it **more scalable**.

## Benefits:
✅ Code is more **reusable and maintainable**.  
✅ The `Main` class **doesn’t need modification** for new animals.  
✅ Follows **Open/Closed Principle (OCP)**.  
https://github.com/user-attachments/assets/4b809cfe-b1c5-4861-a019-26fb1cf634dd
