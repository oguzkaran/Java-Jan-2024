package org.csystem.app;

import org.csystem.game.card.Card;

class App {
    public static void main(String[] args)
    {
        for (Card card : Card.getDeck())
            System.out.println(card.toString());
    }
}

