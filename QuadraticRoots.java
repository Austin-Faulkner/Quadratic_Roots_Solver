// NAME: Austin Faulkner
// NetID: a_f480
// COURSE: CS 3354.251 -- Object-Oriented Programming

// CLASS: QuadraticRoots (The test driver .java file)

// DATE: February 25, 2020
// DATE MODIFIED: February 27, 2020

/*
OBJECTIVE 1: Design and write a Java code that solves a quadratic equation
             ax^2 + bx + c = 0. Please use class and object defintions and do
             not use procedural style.

             Let the roots of ax^2 + bx + c = 0 br p and q. We wish to show the
             following:
                                    p + q = -b / a
             and
                                     pq = c / a

             for non-trivial values a, b, c. Make sure you addres the complex
             numbers as objects.
*/

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.Math;

// Test Driver
public class QuadraticRoots {
   public static void main(String [] args) throws IOException {

      BufferedReader br = new BufferedReader(new FileReader("input_file.txt"));

      int [] coefficients = new int[45];
      String [] polynomialCoefficients = new String[90];

      try {
         for (int i = 0; i < polynomialCoefficients.length; i += 2) {
               String str = br.readLine();
               String [] values = str.split("=");
               polynomialCoefficients[i] = values[0];
               polynomialCoefficients[i + 1] = values[1];
         }

         for (int j = 0; j < polynomialCoefficients.length; ++j) {
            if ((j % 2) == 1) {
               coefficients[j/2] = Integer.parseInt(polynomialCoefficients[j]);
            }
         }

         // 5 sets of coefficients leading to a negative discriminant
         int a1 = coefficients[0];
         int b1 = coefficients[1];
         int c1 = coefficients[2];
         int a2 = coefficients[3];
         int b2 = coefficients[4];
         int c2 = coefficients[5];
         int a3 = coefficients[6];
         int b3 = coefficients[7];
         int c3 = coefficients[8];
         int a4 = coefficients[9];
         int b4 = coefficients[10];
         int c4 = coefficients[11];
         int a5 = coefficients[12];
         int b5 = coefficients[13];
         int c5 = coefficients[14];

         // 5 sets of coefficients leading to discriminant == 0
         int a6 = coefficients[15];
         int b6 = coefficients[16];
         int c6 = coefficients[17];
         int a7 = coefficients[18];
         int b7 = coefficients[19];
         int c7 = coefficients[20];
         int a8 = coefficients[21];
         int b8 = coefficients[22];
         int c8 = coefficients[23];
         int a9 = coefficients[24];
         int b9 = coefficients[25];
         int c9 = coefficients[26];
         int a10 = coefficients[27];
         int b10 = coefficients[28];
         int c10 = coefficients[29];

         // 5 sets of coefficients leading to a positive discriminant
         int a11 = coefficients[30];
         int b11 = coefficients[31];
         int c11 = coefficients[32];
         int a12 = coefficients[33];
         int b12 = coefficients[34];
         int c12 = coefficients[35];
         int a13 = coefficients[36];
         int b13 = coefficients[37];
         int c13 = coefficients[38];
         int a14 = coefficients[39];
         int b14 = coefficients[40];
         int c14 = coefficients[41];
         int a15 = coefficients[42];
         int b15 = coefficients[43];
         int c15 = coefficients[44];

         Complex cr1 = new Complex();
         Complex cr2 = new Complex();

         QuadraticSolver qs = new QuadraticSolver();

         // Distinct complex roots
         qs.QuadraticEquationSolver(a1, b1, c1, cr1, cr2);
         qs.QuadraticEquationSolver(a2, b2, c2, cr1, cr2);
         qs.QuadraticEquationSolver(a3, b3, c3, cr1, cr2);
         qs.QuadraticEquationSolver(a4, b4, c4, cr1, cr2);
         qs.QuadraticEquationSolver(a5, b5, c5, cr1, cr2);

         // Repeated real roots
         qs.QuadraticEquationSolver(a6, b6, c6, cr1, cr2);
         qs.QuadraticEquationSolver(a7, b7, c7, cr1, cr2);
         qs.QuadraticEquationSolver(a8, b8, c8, cr1, cr2);
         qs.QuadraticEquationSolver(a9, b9, c9, cr1, cr2);
         qs.QuadraticEquationSolver(a10, b10, c10, cr1, cr2);

         // Distinct real roots
         qs.QuadraticEquationSolver(a11, b11, c11, cr1, cr2);
         qs.QuadraticEquationSolver(a12, b12, c12, cr1, cr2);
         qs.QuadraticEquationSolver(a13, b13, c13, cr1, cr2);
         qs.QuadraticEquationSolver(a14, b14, c14, cr1, cr2);
         qs.QuadraticEquationSolver(a15, b15, c15, cr1, cr2);


         br.close();

      } catch (IOException exc) {
          exc.printStackTrace();
          System.out.println("File I/O error!");
      } finally {
         if (br != null) {
            br.close();
         }
      }
   }
}
