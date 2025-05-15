package org.csystem.game.card;

import java.util.random.RandomGenerator;

public class Card {
    private static final int DEFAULT_SHUFFLE_COUNT = 100;
    private static final int CARD_COUNT_OF_DECK = 52;
    private CardType m_cardType;
    private CardValue m_cardValue;

    private static void swap(Card [] cards, int i, int k)
    {
        Card temp;

        temp = cards[i];
        cards[i] = cards[k];
        cards[k] = temp;
    }

    public static Card [] newDeck()
    {
        Card [] deck = new Card[CARD_COUNT_OF_DECK];
        int idx = 0;

        for (CardType cardType : CardType.values())
            for (CardValue cardValue : CardValue.values())
                deck[idx++] = new Card(cardType, cardValue);

        return deck;
    }

    public static Card [] newShuffledDeck(RandomGenerator randomGenerator)
    {
        return newShuffledDeck(randomGenerator, DEFAULT_SHUFFLE_COUNT);
    }
    
    public static Card [] newShuffledDeck(RandomGenerator randomGenerator, int count)
    {
        Card [] deck = newDeck();

        for (int i = 0; i < count; ++i)
            swap(deck, randomGenerator.nextInt(deck.length), randomGenerator.nextInt(deck.length));

        return deck;
    }

    public Card(CardType cardType, CardValue cardValue)
    {
        m_cardType = cardType;
        m_cardValue = cardValue;
    }

    public CardType getCardType()
    {
        return m_cardType;
    }

    public void setCardType(CardType cardType)
    {
        m_cardType = cardType;
    }

    public CardValue getCardValue()
    {
        return m_cardValue;
    }

    public void setCardValue(CardValue cardValue)
    {
        m_cardValue = cardValue;
    }

    public String toString()
    {
        return "%s-%s".formatted(m_cardType.toString(), m_cardValue.toString());
    }
}
