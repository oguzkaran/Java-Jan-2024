package org.csystem.game.card;

import java.util.random.RandomGenerator;

public class RandomCardGenerator {
    private static final CardType [] CARD_TYPES = CardType.values();
    private static final CardValue [] CARD_VALUES = CardValue.values();
    private final RandomGenerator m_randomGenerator;

    public RandomCardGenerator(RandomGenerator randomGenerator)
    {
        m_randomGenerator = randomGenerator;
    }

    public Card create()
    {
        return new Card(CARD_TYPES[m_randomGenerator.nextInt(CARD_TYPES.length)], CARD_VALUES[m_randomGenerator.nextInt(CARD_VALUES.length)]);
    }
}
