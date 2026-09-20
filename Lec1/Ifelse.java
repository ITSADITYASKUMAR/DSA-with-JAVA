package Lec1;

public class Ifelse {

    public static void main(String[] args) {

        int age = 80;

        if (age >= 18) {

            if (age > 18 && age <= 30) {
                System.out.println("drinking water");
            } 
            else if (age > 30 && age <= 50) {
                System.out.println("soda");
            } 
            else if (age > 50 && age <= 90) {
                System.out.println("medicine");
            } 
            else {
                System.out.println("bdiya hai");
            }

        } else {
            System.out.println("nhi de skta");
        }
    }
}
