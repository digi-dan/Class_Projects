/**
 * Description: This program takes in 3 inputs: p, q, and e and outputs the smallest possible d > 0
 * using the extended Euclidean algorithm. It uses BigInteger as a data type in for large values
 * and also to use the java math API in order to use the mod inverse function to get d.
 * Author name: Danny Garcia
 * Author email: danny.garcia@sjsu.edu
 * Creation Date: 03/24/2023
 * Last modified date: 03/25/2023
 */
import java.math.*;
import java.util.Scanner;

public class RSA {

    /**
     * Description: Given p, q, and e, using the extended Euclidean algorithm, return d which can be used as the private key
     * phi is calculated as (p - 1)(q - 1)
     * d is calculated as e^-1 mod (phi)
     * If d is negative then add d with phi
     * @param p BigInteger
     * @param q BigInteger
     * @param e BigInteger
     * @return key
     */
    public static BigInteger calculateKey(BigInteger p, BigInteger q, BigInteger e) {
        // phi = (p - 1)(q - 1)
        BigInteger phi = (p.subtract(BigInteger.valueOf(1))).multiply(q.subtract(BigInteger.valueOf(1)));
        // d = e^-1 mod (phi)
        BigInteger d = e.modInverse(phi);

        // Check if d is positive
        if (d.signum() == 1) {
            return d;
        } else {
            // d is negative, add phi to make it positive
            return d.add(phi);
        }
    }

    public static void main(String[] args) {
        // Scanner object for input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input for p, q, and e in this format below: p q e \n ");

        BigInteger p = BigInteger.valueOf(Integer.parseInt(scanner.next()));
        BigInteger q = BigInteger.valueOf(Integer.parseInt(scanner.next()));
        BigInteger e = BigInteger.valueOf(Integer.parseInt(scanner.next()));
        BigInteger d = calculateKey(p, q, e);
        System.out.println("Key: " + d);

    }
}
