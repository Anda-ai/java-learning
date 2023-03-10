/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson4_overloading;

import java.util.Scanner;

/**
 *
 * @author SHOLOGUA
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog chip = new Dog();
        chip.count();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial value");
        int from = scanner.nextInt();
        System.out.println("Enter final value");
        int to = scanner.nextInt();
        chip.count(from, to);
    }
    
}
