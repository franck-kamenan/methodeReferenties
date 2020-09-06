package be.intecbrussel.lambda.methodeReferenties;

import java.util.Random;

@FunctionalInterface
interface Parseable
{
    Integer parse(Character c);
}

public class Scrambler
{
    private final String original;
    private final Integer[] scrambled;
    private final int KEY;

    public Scrambler(String original, int KEY)
    {
        if (original.isEmpty()) throw new RuntimeException("Not a valid String to scramble.");
        if (KEY < 0) throw new RuntimeException("Not a valid key!");

        this.original = original;
        this.KEY = KEY;
        this.scrambled = new Integer[original.length()];
    }

    public void parse(Parseable parser)
    {
        for (int i = 0; i < original.length(); i++)
        {
            scrambled[i] = parser.parse(original.charAt(i)) + new Random().nextInt(KEY);
        }
    }

    public Integer[] getScrambled() {return scrambled;}
}
