package ciklusok;

import java.util.Scanner;

public class Szamok
{
    static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        szamKiirasosFeladat();
    }
    
    static void szamKiirasosFeladat()
    {
        System.out.print("Ismétlődhetnek-e benne a számok? (i/n): ");
        boolean ismetleses = sc.nextLine().equals("i");
        if (ismetleses)
        {
            szamKiirasIsmetlessel();
        }
        else
        {
            szamKiirasIsmetlesNelkul();
        }
    }
    
    static void szamKiirasIsmetlessel()
    {
        int db = 0;
        for (int k = 2; k <= 4; k++)
        {
            for (int j = 2; j <= 4; j++)
            {
                for (int i = 2; i <= 4; i++)
                {
                    db++;
                    System.out.println("" + k + j + i);
                }
            }
        }
        System.out.printf("%d db szám lett kiírva.\n", db);
    }
    
    static void szamKiirasIsmetlesNelkul()
    {
        
    }
}
