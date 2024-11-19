package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

class App {
    public static void main(String[] args)
    {
        Fighter f = new Fighter();

        f.setHealth(90);
        f.setStrength(67);
        f.setAgility(100);
        f.setRange(34);
        f.setSpeed(245);

        System.out.println(f.averageOfAbilities());
        System.out.println(f.totalOfAbilities());
    }
}

class Fighter {
    private static final int HEALTH = 0;
    private static final int STRENGTH = 1;
    private static final int AGILITY = 2;
    private static final int RANGE = 3;
    private static final int SPEED = 4;
    private static final int COUNT = 5;
    private String m_name;
    private final int [] m_abilities = new int[COUNT];

    //...

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public int getHealth()
    {
        return m_abilities[HEALTH];
    }

    public void setHealth(int health)
    {
        m_abilities[HEALTH] = health;
    }

    public int getStrength()
    {
        return m_abilities[STRENGTH];
    }

    public void setStrength(int strength)
    {
        m_abilities[STRENGTH] = strength;
    }

    public int getAgility()
    {
        return m_abilities[AGILITY];
    }

    public void setAgility(int agility)
    {
        m_abilities[AGILITY] = agility;
    }

    public int getRange()
    {
        return m_abilities[RANGE];
    }

    public void setRange(int range)
    {
        m_abilities[RANGE] = range;
    }

    public int getSpeed()
    {
        return m_abilities[SPEED];
    }

    public void setSpeed(int speed)
    {
        m_abilities[SPEED] = speed;
    }

    public int totalOfAbilities()
    {
        return (int)ArrayUtil.sum(m_abilities);
    }

    public double averageOfAbilities()
    {
        return totalOfAbilities() / (double)m_abilities.length;
    }
}