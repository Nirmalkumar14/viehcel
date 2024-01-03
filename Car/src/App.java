public class App {
    public static void main(String[] args) throws Exception {

        login admin = new login();
        admin.cho();
        CarRentalSystem rentalSystem = new CarRentalSystem();
    
        Car car1 = new Car("NN1", "Toyota", "Camry", 500.0); 
        Car car2 = new Car("NN2", "Honda", "Accord", 5000.0);
        Car car3 = new Car("NN3", "Mahindra", "Thar", 10000.0);
        Car car4 = new Car("NN4", "BMW", "X7", 100000.0);
        Car car5 = new Car("NN5", "BENZ", "S", 1000000.0);
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);
        rentalSystem.addCar(car4);
        rentalSystem.addCar(car5);
        rentalSystem.menu();
    }
}
