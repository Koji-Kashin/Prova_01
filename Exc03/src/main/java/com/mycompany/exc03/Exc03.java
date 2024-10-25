/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exc03;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Exc03 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double vlrExpr = 0.75, vlrCappu = 1.00, vlrLatto = 1.25;
        int totalVendas_Expr = 0, totalVendas_Cappu = 0, totalVendas_Latto = 0;
        int qtdExpr = 0, qtdCappu = 0, qtdLatto = 0, qtdTotal_Vendas = 0, esC = 0;

        double valorTotalVendaExpr = 0;
        double valorTotalVendaCappu = 0;
        double valorTotalVendaLatto = 0;

        while (esC != 4) {
            System.out.println("1 - cafe expresso; 2 - cafe capuccino;"
                    + "3 - leite com cafe; 4 - totalizar vendas;");
            System.out.println("Digite a opcao desejada abaixo: ");
            esC = ler.nextInt();
            switch (esC) {
                case 1 -> {
                    while (esC == 1) {
                        totalVendas_Expr = totalVendas_Expr + 1;
                        valorTotalVendaExpr = valorTotalVendaExpr + vlrExpr;
                        esC = 0;

                    }
                }
                case 2 -> {
                    while (esC == 2) {
                        totalVendas_Cappu = totalVendas_Cappu + 1;
                        valorTotalVendaCappu = valorTotalVendaCappu + vlrCappu;
                        esC = 0;

                    }
                }
                case 3 -> {
                    while (esC == 3) {
                        totalVendas_Latto = totalVendas_Latto + 1;
                        valorTotalVendaLatto = valorTotalVendaLatto + vlrLatto;
                        esC = 0;

                    }
                }
                case 4 -> {
                    System.out.println("Quantidade de expresso(s) vendido(s) = "
                            + totalVendas_Expr + ", valor total vendido = " + valorTotalVendaExpr);

                    System.out.println("Quantidade de cappucino(s) vendido(s) = " + totalVendas_Cappu
                            + ", valor total vendido = " + valorTotalVendaCappu);

                    System.out.println("Quantidade de cafe(s) com leite vendido = " + totalVendas_Latto
                            + ", valor total vendido = " + valorTotalVendaLatto);
                }
                default -> {
                }
            }

        }

    }
}
