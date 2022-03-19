/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marisol.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author maris
 */
public class Deck {

    private String[] palo = {"corazones", "diamantes", "trébol", "picas"};
    private String[] color = {"rojo", "negro"};
    private String[] valor = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

    private ArrayList<Card> deck = new ArrayList<Card>();

    public Deck() {
        for (int palo = 0; palo < 2; palo++) {
            for (int valor = 0; valor < this.valor.length; valor++) {
                deck.add(new Card(this.palo[palo], color[0], this.valor[valor]));
            }
        }

        for (int palo = 2; palo < 4; palo++) {
            for (int valor = 0; valor < this.valor.length; valor++) {
                deck.add(new Card(this.palo[palo], color[1], this.valor[valor]));
            }
        }
    }

    public int getSize() {
        return deck.size();
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void pick() {
        Random random = new Random();
        System.out.println(
                deck.get(
                        random.nextInt(
                                deck.size()
                        )
                )
        );

        deck.remove(random.nextInt(deck.size()));
        System.out.println("Quedan " + deck.size() + " cartas");
    }

    public void head() {
        System.out.println(deck.get(0));
        deck.remove(0);
        System.out.println("Quedan " + deck.size() + " cartas");
    }

    public void hand() {
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }
        for (int i = 0; i < 5; i++) {
            deck.remove(i);
        }
        System.out.println("Quedan " + deck.size() + " cartas");
    }

    public void suflle() {
        Collections.shuffle(deck);
        System.out.println("Se mezclo el Deck.");

        for (Card elemento : deck) {
            System.out.print(elemento + " / ");
        }
    }

}
