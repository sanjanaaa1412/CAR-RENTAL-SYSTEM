import java.util.ArrayList;
import java.util.Scanner;

public class CarRentalSystem {
    private ArrayList<Car> cars;
    private ArrayList<Customer> customers;

    public CarRentalSystem() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
        initializeCars();
    }

    private void initializeCars() {
        cars.add(new Car("Toyota Corolla", "ABC123"));
        cars.add(new Car("Honda Civic", "XYZ789"));
        cars.add(new Car("Ford Mustang", "QWE456"));
    }

    public void rentCar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your phone number:");
        String phoneNumber = scanner.nextLine();
        Customer customer = new Customer(name, phoneNumber);
        customers.add(customer);

        System.out.println("Available cars:");
        displayAvailableCars();

        System.out.println("Enter the license plate of the car you want to rent:");
        String licensePlate = scanner.nextLine();

        for (Car car : cars) {
            if (car.getLicensePlate().equalsIgnoreCase(licensePlate) && !car.isRented()) {
                car.rent();
                System.out.println("Car rented successfully!");
                return;
            }
        }
        System.out.println("Sorry, the car is either not available or already rented.");
    }

    public void returnCar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the license plate of the car you want to return:");
        String licensePlate = scanner.nextLine();

        for (Car car : cars) {
            if (car.getLicensePlate().equalsIgnoreCase(licensePlate) && car.isRented()) {
                car.returnCar();
                System.out.println("Car returned successfully!");
                return;
            }
        }
        System.out.println("Invalid license plate or the car was not rented.");
    }

    public void displayAvailableCars() {
        System.out.println("Available Cars:");
        for (Car car : cars) {
            if (!car.isRented()) {
                System.out.println(car);
            }
        }
    }

    public void viewRentedCars() {
        System.out.println("Rented Cars:");
        for (Car car : cars) {
            if (car.isRented()) {
                System.out.println(car);
            }
        }
    }

    public static void main(String[] args) {
        CarRentalSystem system = new CarRentalSystem();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Car Rental System ---");
            System.out.println("1. Rent a car");
            System.out.println("2. Return a car");
            System.out.println("3. View available cars");
            System.out.println("4. View rented cars");
            System.out.println("5. Exit");
            System.out.println("Choose an option:");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    system.rentCar();
                    break;
                case 2:
                    system.returnCar();
                    break;
                case 3:
                    system.displayAvailableCars();
                    break;
                case 4:
                    system.viewRentedCars();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
