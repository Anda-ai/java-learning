/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson4_overloading;

/**
 *
 * @author SHOLOGUA
 */
public class Dog {
    
    public void count(int from, int to){//Dynamic
        for(int value = from; value <= to; value++){
            System.out.println(value);
        }
    }
    public void count(){//static
        for(int value = 0; value < 10; value++){
            System.out.println(value);
        }
    }
}
