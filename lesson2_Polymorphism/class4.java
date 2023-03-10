/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson2_Polymorphism;

/**
 *
 * @author SHOLOGUA
 */
public class class4 {
    
    int answer;
    
    public class4(){}
    
    public int add(int a, int b){
        answer = a + b;
        return answer;
    }
    
    public int subtract(int a, int b){
        answer = b - a;
        return answer;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return b/a;
    }
}
