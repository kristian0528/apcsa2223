package lessons2022;

public class Java31_Inheritance02022023 {

    // Inheritance builds relations between classes, one super(parent) and sub(child)
    //advantage improves reusability and easy to maintain


}

class Car{
    String model;
    String made;
    int year;
}

class ElectricCar extends Car{
    String BatterySize;
}

class HybridCar{
    String HybridBatteryRange;
}
