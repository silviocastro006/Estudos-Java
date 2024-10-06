/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author acer
 */
public class OperadoresLogicos {
    public static void main(String[] args) {
        int x,y,z;
        x = 4;
        y = 3;
        z = 12;
        boolean r1,r2,r3,r4;
        r1 = (x == y && y == z); // x == y é False e y == z é False
        r2 = (x != y || y==4); // x != y é True ou y==4 é True
        r3 = !(x==4 ); // Não x == 4 é False
        r4 = (x==4 ^ y==3); // Ou exclusivo de x==4 True e y==3 True = False
        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}
