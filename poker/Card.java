/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marisol.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author maris
 */
public class Card {
    private String palo;
    private String color;
    private String valor;

    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Palo: " + palo + " | " + "Color: " + color +
                " | " + "Valor: " + valor;
    }
}
