package org.csystem.game.card;

import java.util.Random;

public class RandomCardGenerator {
    private static final CardType [] CARD_TYPES = CardType.values();
    private static final CardValue [] CARD_VALUES = CardValue.values();
    private final Random m_random;

    public RandomCardGenerator(Random random)
    {
        m_random = random;
    }

    public Card create()
    {
        return new Card(CARD_TYPES[m_random.nextInt(CARD_TYPES.length)], CARD_VALUES[m_random.nextInt(CARD_VALUES.length)]);
    }
}
