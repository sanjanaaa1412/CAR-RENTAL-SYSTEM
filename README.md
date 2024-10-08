# 🚗 Car Rental System

Welcome to the **Car Rental System**! This is a simple Java-based command line application that lets users rent, return, and view available cars in a car rental system.

## 📋 Features

- 🚘 **Rent a Car:** Rent any available car from the system.
- 🔄 **Return a Car:** Return a rented car and make it available again.
- 👀 **View Available Cars:** Check which cars are available for rent.
- 🛠️ **View Rented Cars:** See a list of cars that are currently rented out.

## 🏗️ Project Structure

The project contains the following main files:

- **Car.java**: Defines the car class, including details like model, license plate, and rental status.
- **Customer.java**: Defines the customer class, tracking customer name and phone number.
- **CarRentalSystem.java**: Contains the main logic for renting, returning cars, and interacting with the user through the command line.

## 🚀 How to Run

1. Make sure you have Java installed on your system. You can check by running:
   ```bash
   java -version
   ```
   
2. Clone this repository or download the source code.

3. Compile the Java files using the following command:
   ```bash
   javac CarRentalSystem.java
   ```

4. Run the program:
   ```bash
   java CarRentalSystem
   ```

5. Follow the on-screen instructions to:
   - Rent a car 🚗
   - Return a car 🔄
   - View available cars 👀
   - View rented cars 📋

## 💻 Sample Usage

```text
--- Car Rental System ---
1. Rent a car
2. Return a car
3. View available cars
4. View rented cars
5. Exit
Choose an option: 1

Enter your name: John Doe
Enter your phone number: 555-1234
Available cars:
Toyota Corolla (ABC123) Available
Honda Civic (XYZ789) Available
Ford Mustang (QWE456) Available

Enter the license plate of the car you want to rent: ABC123
Car rented successfully!
```

## 🛠️ Dependencies

No external dependencies are required for this project. Just ensure you have a Java environment set up on your system.

## 📝 License

This project is licensed under the BSD 3-Clause License.

---

Enjoy renting cars with our **Car Rental System**! 😄
