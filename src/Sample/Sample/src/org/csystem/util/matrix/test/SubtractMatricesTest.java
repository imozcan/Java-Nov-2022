package org.csystem.util.matrix.test;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.matrix.MatrixUtil;

import java.util.Random;
import java.util.Scanner;

public class SubtractMatricesTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Üretilecek matris sayısını giriniz:");
        int count = kb.nextInt();

        while (count-- > 0) {
            System.out.println("---------------------------------");
            int m = random.nextInt(2, 10);
            int n = random.nextInt(2, 10);
            int[][] a = MatrixUtil.getRandomMatrix(random, m, n, 0, 100);
            int[][] b = MatrixUtil.getRandomMatrix(random, m, n, 0, 100);

            ArrayUtil.print(2, a);
            System.out.println("-");
            ArrayUtil.print(2, b);
            System.out.println("=");
            ArrayUtil.print(2, MatrixUtil.subtractMatrices(a, b));
            System.out.println("---------------------------------");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
