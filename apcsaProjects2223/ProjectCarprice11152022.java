package apcsaProjects2223;

public class ProjectCarprice11152022 {
    public static int methodCarprice(String color, int wheel, boolean sunroof){
        int totalPrice = 0;
        int basePrice = 20000;
        totalPrice+=basePrice;
        if(color.equalsIgnoreCase("white")){
            totalPrice=basePrice+2000;
        }
        if(color.equalsIgnoreCase("black")){
            totalPrice=basePrice+3000;
        }
        if(color.equalsIgnoreCase("red")){
            totalPrice=basePrice+5000;
        }
        if(wheel==19){
            totalPrice=basePrice+3000;
        }
        if(wheel==21){
            totalPrice=basePrice+5000;
        }
        if(sunroof){
            totalPrice=totalPrice+6000;
        }
        return totalPrice;
    }
}
