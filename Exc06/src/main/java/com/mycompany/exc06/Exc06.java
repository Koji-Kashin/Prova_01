/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exc06;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Exc06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float n, media;
        int somaNum;
        int esC = 1, qtdNum = 0;
        while (esC == 1) {
            System.out.print("Digite um numero: ");
            n = ler.nextFloat();
            qtdNum = qtdNum + 1;
            System.out.print("Deseja adcionar outro numero? 1 - SIM 2 - NAO:");
            esC = ler.nextInt();
            System.out.println(" ");
            
        }
        
        System.out.println("quantidade de números digitados: "+ qtdNum);

    }
}
