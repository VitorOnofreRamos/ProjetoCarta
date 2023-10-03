package org.example;

import org.example.Deck.Carta;

public class Main {
    public static void main(String[] args) {
        var cartaGhalta = new Carta();
        cartaGhalta.setNome("Ghalta, Stampede Turante");
        cartaGhalta.setTipoDeCriatura("Legendary Creature — Elder Dinosaur");
        cartaGhalta.setCustoDeMana("{5}{G}{G}{G}");
        cartaGhalta.setDescriao("Trample \n When Ghalta, Stampede Tyrant enters the battlefield, put any number of creature cards from your hand onto the battlefield");
        cartaGhalta.setPoder(12);
        cartaGhalta.setResistencia(12);
        cartaGhalta.setIlustrador("Sidhard Chaturve");
        cartaGhalta.setDataDeLancamento("17-11-2023");
        cartaGhalta.setNomeDoDeck("Lost Caverns of Ixalan (ICL)");
        cartaGhalta.setNumeroDoDeck(326);
        cartaGhalta.setRaridadeDoDeck("Mythic Rare");
        cartaGhalta.setLingua("Inglês");

        System.out.println(cartaGhalta);
        cartaGhalta.VisualizarIlustrador();
        cartaGhalta.VisualizarDeck();
        cartaGhalta.VisualizarPrints();
    }
}