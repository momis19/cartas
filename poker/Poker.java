/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package marisol.poker;

/**
 *
 * @author maris
 */
public class Poker {

    public static void main(String[] args) {
        Deck cartas = new Deck();

        System.out.println("Deck de Cartas para Iniciar: " + cartas.getSize());

        for (Card carta : cartas.getDeck()) {
            System.out.print(carta + " / ");
        }
        System.out.println("\n");
        cartas.suflle();
        System.out.println("\n");
        cartas.head();
        System.out.println("\n");
        cartas.pick();
        System.out.println("\n");
        cartas.hand();
    }
}
