// NAME: Austin Faulkner
// NetID: a_f480
// COURSE: CS 3354.251 -- Object-Oriented Programming

// CLASS: QuadraticSolver

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

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class QuadraticSolver {
   public void QuadraticEquationSolver(double a, double b, double c,
                     Complex r1, Complex r2) throws IOException {

      PrintWriter pw = null;

      try {

         pw = new PrintWriter(new FileWriter("output_file.txt", true));

         double discriminant = b * b - 4 * a * c;
         double D = Math.sqrt(Math.abs(discriminant));     

         String rootSum = "p + q = -b/a";
         String rootProduct = "pq = c/a";

         double sumQuotient = (-b)/a;
         double productQuotient = c/a;

         // Distinct complex roots
         if (discriminant < 0) {

            //------------------------------------------------------------------
            // Console output
            //------------------------------------------------------------------

            System.out.println();
            System.out.println("------------------------------------------------"
                           + "------------------------------------------------");
            System.out.println("FOR COMPLEX ROOTS, Vieta's formulae are established "
                               + "as follows for polynomial ax^2 + bx + c = 0:  ");
            System.out.println();
            System.out.println("                        " + rootSum +
                               "    and    " + rootProduct);
            System.out.println("------------------------------------------------"
                           + "------------------------------------------------");
            System.out.println();

            System.out.println("Coefficients : a = " + a + ", b = " + b +
                               ", c = " + c);
            System.out.println();

            System.out.println("The discriminant is: " + discriminant);
            System.out.println();

            //------------------------------------------------------------------
            // File output to output_file.txt
            //------------------------------------------------------------------

            pw.println("------------------------------------------------"
                       + "------------------------------------------------");
            pw.println("FOR COMPLEX ROOTS, Vieta's formulae are established "
                               + "as follows for polynomial ax^2 + bx + c = 0:  ");
            pw.println();
            pw.println("                        " + rootSum +
                               "    and    " + rootProduct);
            pw.println("------------------------------------------------"
                       + "------------------------------------------------");
            pw.println();

            pw.println("Coefficients : a = " + a + ", b = " + b +
                               ", c = " + c);
            pw.println();

            pw.println("The discriminant is: " + discriminant);
            pw.println();

            r1.re = (-b) / (2 * a);
            r2.re = (-b) / (2 * a);
            r1.im = D / (2 * a);
            r2.im = -D / (2 * a);

            //------------------------------------------------------------------
            // Console output
            //------------------------------------------------------------------

            System.out.println("Imaginary root p: "
                               + r1.re + " + " + r1.im + "i" );
            System.out.println("Imaginary root q: "
                               + r2.re + " - " + -r2.im + "i");

            System.out.println();
            System.out.println("p + q: " + (r1.re + r2.re) + " + "
                               + (r1.im + r2.im) + "i");
            System.out.println("-b / a: " + sumQuotient);
            System.out.println();

            //------------------------------------------------------------------
            // File output to output_file.txt
            //------------------------------------------------------------------

            pw.println("Imaginary root p: "
                               + r1.re + " + " + r1.im + "i" );
            pw.println("Imaginary root q: "
                               + r2.re + " - " + -r2.im + "i");

            pw.println();
            pw.println("p + q: " + (r1.re + r2.re) + " + "
                               + (r1.im + r2.im) + "i");
            pw.println("-b / a: " + sumQuotient);
            pw.println();

            DecimalFormat formatter = new DecimalFormat("#0.0");
            double realPartPQ = r1.re * r2.re - r1.im * r2.im;

            //------------------------------------------------------------------
            // Console output
            //------------------------------------------------------------------

            System.out.format("pq: " + formatter.format(realPartPQ)
                              + " + " + (r1.re * r2.im + r1.im * r2.re) + "i");
            System.out.println();
            System.out.println("c / a: " + productQuotient);
            System.out.println();

            //------------------------------------------------------------------
            // File output to output_file.txt
            //------------------------------------------------------------------

            pw.format("pq: " + formatter.format(realPartPQ)
                              + " + " + (r1.re * r2.im + r1.im * r2.re) + "i");
            pw.println();
            pw.println("c / a: " + productQuotient);
            pw.println();
         }

         // Repeated real roots
         if (discriminant == 0) {

            //------------------------------------------------------------------
            // Console output
            //------------------------------------------------------------------

            System.out.println();
            System.out.println("------------------------------------------------"
                           + "------------------------------------------------");
            System.out.println("FOR REPEATED ROOTS, Vieta's formulae are " +
                               "established" + " as follows for polynomial " +
                               "ax^2 + bx + c = 0:  ");
            System.out.println();
            System.out.println("                        " + rootSum +
                               "    and    " + rootProduct);
            System.out.println("------------------------------------------------"
                           + "------------------------------------------------");
            System.out.println();

            System.out.println("Coefficients : a = " + a + ", b = " + b +
                               ", c = " + c);
            System.out.println();

            System.out.println("The discriminant is: " +  discriminant);

            //------------------------------------------------------------------
            // File output to output_file.txt
            //------------------------------------------------------------------

            pw.println();
            pw.println("------------------------------------------------"
                           + "------------------------------------------------");
            pw.println("FOR REPEATED ROOTS, Vieta's formulae are " +
                               "established" + " as follows for polynomial " +
                               "ax^2 + bx + c = 0:  ");
            pw.println();
            pw.println("                        " + rootSum +
                               "    and    " + rootProduct);
            pw.println("------------------------------------------------"
                           + "------------------------------------------------");
            pw.println();

            pw.println("Coefficients : a = " + a + ", b = " + b +
                               ", c = " + c);
            pw.println();

            pw.println("The discriminant is: " +  discriminant);

            double p = (-b) / (2 * a);
            double q = (-b) / (2 * a);

            double sumPQ = p + q;
            double productPQ = p * q;

            //------------------------------------------------------------------
            // Console output
            //------------------------------------------------------------------

            System.out.println();
            System.out.println("One repeated root is p: " + p);
            System.out.println("The other repeated root q is: " + q);
            System.out.println();

            System.out.println("p + q: " + sumPQ);
            System.out.println("-b/a: " + sumQuotient);
            System.out.println();

            System.out.println("pq: " + productPQ);
            System.out.println("c/a: " + productQuotient);

            //------------------------------------------------------------------
            // File output to output_file.txt
            //------------------------------------------------------------------

            pw.println();
            pw.println("One repeated root is p: " + p);
            pw.println("The other repeated root q is: " + q);
            pw.println();

            pw.println("p + q: " + sumPQ);
            pw.println("-b/a: " + sumQuotient);
            pw.println();

            pw.println("pq: " + productPQ);
            pw.println("c/a: " + productQuotient);
         }

         // Distinct real roots
         if (discriminant > 0) {

            //------------------------------------------------------------------
            // Console output
            //------------------------------------------------------------------

            System.out.println();
            System.out.println("------------------------------------------------"
                          + "-------------------------------------------------");
            System.out.println("FOR DISCTINCT ROOTS, Vieta's formulae are " +
                               "established" + " as follows for polynomial " +
                               "ax^2 + bx + c = 0:  ");
            System.out.println();
            System.out.println("                        " + rootSum +
                              "    and    " + rootProduct);
            System.out.println("------------------------------------------------"
                          + "-------------------------------------------------");
            System.out.println();

            System.out.println("Coefficients : a = " + a + ", b = " + b +
                               ", c = " + c);
            System.out.println();

            System.out.println("The discriminant is: " +  discriminant);

            //------------------------------------------------------------------
            // File output to output_file.txt
            //------------------------------------------------------------------

            pw.println();
            pw.println("------------------------------------------------"
                          + "-------------------------------------------------");
            pw.println("FOR DISCTINCT ROOTS, Vieta's formulae are " +
                               "established" + " as follows for polynomial " +
                               "ax^2 + bx + c = 0:  ");
            pw.println();
            pw.println("                        " + rootSum +
                              "    and    " + rootProduct);
            pw.println("------------------------------------------------"
                          + "-------------------------------------------------");
            pw.println();

            pw.println("Coefficients : a = " + a + ", b = " + b +
                               ", c = " + c);
            pw.println();

            pw.println("The discriminant is: " +  discriminant);


            double p = (-b + D) / (2 * a);
            double q = (-b - D) / (2 * a);

            //------------------------------------------------------------------
            // Console output
            //------------------------------------------------------------------

            System.out.println();
            System.out.println("One real root p is: " + p);
            System.out.println("The other real root q is: " + q);
            System.out.println();

            //------------------------------------------------------------------
            // File output to output_file.txt
            //------------------------------------------------------------------

            pw.println();
            pw.println("One real root p is: " + p);
            pw.println("The other real root q is: " + q);
            pw.println();

            double sumPQ = p + q;
            double productPQ = p * q;

            //------------------------------------------------------------------
            // Console output
            //------------------------------------------------------------------

            System.out.println("p + q: " + (double) sumPQ);
            System.out.println("-b/c: " + sumQuotient);
            System.out.println();

            System.out.println("pq: " + (double) productPQ);
            System.out.println("c/a: " + productQuotient);
            System.out.println();

            //------------------------------------------------------------------
            // File output to output_file.txt
            //------------------------------------------------------------------

            pw.println("p + q: " + (double) sumPQ);
            pw.println("-b/c: " + sumQuotient);
            pw.println();

            pw.println("pq: " + (double) productPQ);
            pw.println("c/a: " + productQuotient);
            pw.println();
         }
         pw.close();
      } catch (IOException exc) {
            exc.printStackTrace();
            System.out.println("File output error!");
      } finally {
         if(pw != null)
            pw.close();
      }
   }
}
