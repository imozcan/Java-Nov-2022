package org.csystem.math.test;

import org.csystem.math.Fraction;
import org.csystem.math.test.factory.FractionFactory;
import org.csystem.util.console.Console;

public class FractionAddTest {
    private static void run()
    {
        FractionFactory factory = new FractionFactory();

        int count = Console.readInt("Bir sayı giriniz: ");

        while (count-- > 0) {
            try {
                Fraction f1 = factory.createRandomFraction(-10, 10);
                Fraction f2 = factory.createRandomFraction(-10, 10);
                System.out.println("--------------------------------------------------------------");
                Console.writeLine("f1 = %s, f2 = %s ", f1, f2);
                Console.writeLine("f1 + f2 = %s", f1.add(f2));
                System.out.println("--------------------------------------------------------------");
            }
            catch (NumberFormatException ignore)
            {
                Console.writeLine("Invalid Fraction Value");
            }
        }
    }
    public static void main(String[] args)
    {
        run();
    }
}


