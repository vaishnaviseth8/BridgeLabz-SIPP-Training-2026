class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental() {
        customerName = "Guest";
        carModel = "Hatchback";
        rentalDays = 1;
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateCost() {
        double ratePerDay = 1500;
        return rentalDays * ratePerDay;
    }

    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateCost());
    }
}

public class Main {
    public static void main(String[] args) {
        CarRental c1 = new CarRental();
        CarRental c2 = new CarRental("Aman", "Swift", 5);

        c1.display();
        c2.display();
    }
}