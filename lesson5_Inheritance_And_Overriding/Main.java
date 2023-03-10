/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson5_Inheritance_And_Overriding;

/**
 *
 * @author SHOLOGUA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student student= new Student("Anda", "Shologu", 218332173, 15);
        System.out.println("Full details: "+student);
        System.out.println("Hi "+ student.getFristName() + " "+student.getLastName());
        
        Staff staff= new Staff("Anda", "Shologu", 218332173, 15, 9898987);
        System.out.println("Full details: "+staff);
        System.out.println("Hi "+ student.getFristName() + " "+student.getLastName());
    }
    
}
