public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Велосипед 1");
        Car car = new Car("Легковое авто", 4);
        Truck truck = new Truck("Грузовое авто", 4);


        ServiceStation serviceStation = new ServiceStation();

        System.out.println("Диагностика велосипеда: ");
        serviceStation.check(vehicle);
        System.out.println("________________________");

        System.out.println("Диагностика легкового авто: ");
        serviceStation.check(car);
        System.out.println("________________________");

        System.out.println("Диагностика грузового авто: ");
        serviceStation.check(truck);
        System.out.println("________________________");
    }
}