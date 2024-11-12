package org.csystem.game.card;

public class Card {
    private CardType m_cardType;
    private CardValue m_cardValue;

    public static Card [] getDeck()
    {
        Card [] deck = new Card[52];
        int idx = 0;

        for (CardType cardType : CardType.values())
            for (CardValue cardValue : CardValue.values())
                deck[idx++] = new Card(cardType, cardValue);

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
