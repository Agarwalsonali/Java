// Car Rental Management System
import java.text.SimpleDateFormat;
import java.io.*;
import java.util.*;

// Car.java
class Car implements Serializable {
    String carID;
    String model;
    String type;
    String location;
    boolean isAvailable;

    Car(String carID, String model, String type, String location, boolean isAvailable) {
        this.carID = carID;
        this.model = model;
        this.type = type;
        this.location = location;
        this.isAvailable = isAvailable;
    }

    String getCarID() { 
		return carID; 
	}
    String getModel() { 
		return model; 
	}
    String getType() { 
		return type;
	}
    String getLocation() {
		return location;
	}
    boolean isAvailable() { 
		return isAvailable; 
	}
}

// Customer.java
class CrmsCustomer implements Serializable {
    String customerID;
    String name;
    String phone;
    String paymentInfo;

    CrmsCustomer(String customerID, String name, String phone, String paymentInfo) {
        this.customerID = customerID;
        this.name = name;
        this.phone = phone;
        this.paymentInfo = paymentInfo;
    }

    String getCustomerID() { 
		return customerID; 
	}
    String getName() { 
		return name;
	}
    String getPhone() { 
		return phone; 
	}
    String getPaymentInfo() { 
		return paymentInfo; 
	}
}

// Rental.java
class Rental implements Serializable {
    String bookingID;
    String customerID;
    String carID;
    String bookingDate;
    String rentalAgreement;

    Rental(String bookingID, String customerID, String carID, String bookingDate, String rentalAgreement) {
        this.bookingID = bookingID;
        this.customerID = customerID;
        this.carID = carID;
        this.bookingDate = bookingDate;
        this.rentalAgreement = rentalAgreement;
    }

    String getBookingID() { 
		return bookingID; 
	}
    String getBookingDate() { 
		return bookingDate; 
	}
    String getRentalAgreement() {
		return rentalAgreement; 
	}
}

// CarService.java
class CarService {
    
    void addCar(Car car) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("cars.txt", true));
        writer.write(car.getCarID() + "," + car.getModel() + "," + car.getType() + "," + car.getLocation() + "," + car.isAvailable());
        writer.newLine();
        writer.close();
    }

    void showAvailableCars(String type, String location) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("cars.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 5 && parts[2].equals(type) && parts[3].equals(location) && parts[4].equals("true")) {
                System.out.println("Car ID: " + parts[0] + ", Model: " + parts[1]);
            }
        }
        reader.close();
    }
	
	void markCarUnavailable(String carID) throws IOException {
		File inputFile = new File("cars.txt");
		File tempFile = new File("cars_temp.txt");

		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

		String line;
		while ((line = reader.readLine()) != null) {
			String[] parts = line.split(",");
			if (parts.length == 5 && parts[0].equals(carID)) {
				parts[4] = "false"; 
				line = String.join(",", parts);
			}
			writer.write(line);
			writer.newLine();
		}

		reader.close();
		writer.close();

		inputFile.delete();
		tempFile.renameTo(inputFile);
	}

}

//CustomerService.java
class CustomerService {
  
    void registerCustomer(CrmsCustomer customer) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("customers.txt", true));
        writer.write(customer.getCustomerID() + "," + customer.getName() + "," + customer.getPhone());
        writer.newLine();
        writer.close();
    }

    void listCustomers() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("customers.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}

//RentalService.java

class RentalService {

    void addBooking(Rental rental) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("rentals.txt", true));
        writer.write(rental.bookingID + "," + rental.customerID + "," + rental.carID + "," + rental.bookingDate + "," + rental.rentalAgreement);
        writer.newLine();
        writer.close();
    }
}


//CarRentalMain.java
class CarRentalMain {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        CarService carService = new CarService();
        CustomerService customerService = new CustomerService();
        RentalService rentalService = new RentalService();

        while (true) {
            System.out.println("1. Add Car\n2. Show Available Cars\n3. Register Customer\n4. Book Car\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Car ID:");
                    String carID = sc.nextLine();
                    System.out.println("Enter Model:");
                    String model = sc.nextLine();
                    System.out.println("Enter Type:");
                    String type = sc.nextLine();
                    System.out.println("Enter Location:");
                    String location = sc.nextLine();
                    Car car = new Car(carID, model, type, location, true);
                    carService.addCar(car);
					System.out.println("----------------------------");
                    break;
                case 2:
                    System.out.println("Enter Type:");
                    String searchType = sc.nextLine();
                    System.out.println("Enter Location:");
                    String searchLocation = sc.nextLine();
                    carService.showAvailableCars(searchType, searchLocation);
					System.out.println("----------------------------");
                    break;
                case 3:
                    System.out.println("Enter Customer ID:");
                    String customerID = sc.nextLine();
                    System.out.println("Enter Name:");
                    String name = sc.nextLine();
                    System.out.println("Enter Phone:");
                    String phone = sc.nextLine();
                    System.out.println("Enter Payment Info:");
                    String paymentInfo = sc.nextLine();
                    CrmsCustomer customer = new CrmsCustomer(customerID, name, phone, paymentInfo);
                    customerService.registerCustomer(customer);
					System.out.println("----------------------------");
                    break;
                case 4:
                    System.out.println("Enter Booking ID:");
                    String bookingID = sc.nextLine();
                    System.out.println("Enter Customer ID:");
                    String bookCustomerID = sc.nextLine();
                    System.out.println("Enter Car ID:");
                    String bookCarID = sc.nextLine();
                    String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
					System.out.println("Enter Terms and Conditions:");
                    String agreement =sc.nextLine();
                    Rental booking = new Rental(bookingID, bookCustomerID, bookCarID, date, agreement);
                    rentalService.addBooking(booking);
					System.out.println("----------------------------");
                    break;
                case 5:
                    return;
            }
        }
    }
}

	
