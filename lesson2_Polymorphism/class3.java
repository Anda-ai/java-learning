/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson2_Polymorphism;

/**
 *
 * @author SHOLOGUA
 */
public class class3 {
    
    int answer;
    
    public class3(){}
    
    public void add(int a, int b){
        answer = a + b;
        System.out.println(a +" + "+ b +" = "+answer);
    }
    
    public void subtract(int a, int b){
        answer = b - a;
        System.out.println(b +" - "+ a +" = "+answer);
    }
    public void multiply(int a, int b){
        answer = a*b;
        System.out.println(a +" x "+ b +" = "+answer);
    }
    public void divide(int a, int b){
        answer = b/a;
        System.out.println(b +" / "+ a +" = "+answer);
    }
}
