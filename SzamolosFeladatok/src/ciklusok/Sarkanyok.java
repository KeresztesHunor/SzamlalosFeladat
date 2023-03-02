package ciklusok;

public class Sarkanyok
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 20; i++)
        {
            for (int j = 0; j < 13; j++)
            {
                if (7 * i + 11 * j == 145)
                {
                    System.out.println("7 fejű: " + i);
                    System.out.println("11 fejű: " + j);
                    System.out.println("=============");
                }
            }
        }
    }
}
