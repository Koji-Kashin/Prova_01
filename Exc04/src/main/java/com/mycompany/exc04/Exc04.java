/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exc04;
import java.util.Scanner;
/**
 *
 * @author d.rodrigues
 */
public class Exc04 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int num;
        System.out.println("Digite um numero: ");
        num = ler.nextInt();
        
        System.out.println("O antecessor de " +num+ " eh: " + (num -1)+" seu sucessor eh: " + (num+1));
    }
}
