/**
 *  Description: This program implements the A5/1 algorithm. It takes in the values of
 *  registers (X, Y, Z) as input in that format. X = 19 bits, Y = 22 bits and Z = 23 bits
 *  It will then generate and output a keystream, once give the keystream length
 *  After key has been printed. It will show the results of all 3 registers after the
 *  final step
 *  Author name: Danny Garcia
 *  Author email: danny.garcia@sjsu.edu
 *  Creation Date: 03/24/2023
 *  Last modified Date: 03/24/2023
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A51 {
    /**
     * function name: generateKeyStream
     * This function takes in 3 Integer arrays: x, y, and z, and the desired key length
     * Implementing the A5/1 algorithm and using bitwise operations, the program will shift
     * the values of the appropriate registers and add the generated keystream bit to the
     * keystream Integer array. It will then return the keystream once desired length has been reached
     * @param X - Integer array of register x
     * @param Y - Integer array of register y
     * @param Z - Integer array of register z
     * @param keyLength - Desired length of key
     * @return Integer[] array of the final key
     */
    public static Integer[] generateKeyStream(Integer[] X, Integer[] Y, Integer[] Z, int keyLength){
        // Data structure for keystream
        Integer[] keyStream = new Integer[keyLength];

        for(int i = 0; i < keyLength; i++){
            // Calculate majority bit
            int majority = (X[8] & Y[10]) ^ (X[8] & Z[10]) ^ (Y[10] & Z[10]);

            // X steps if x[8] == majority
            if(X[8] == majority){
                int newX = (X[13] ^ X[16] ^ X[17] ^ X[18]);
                Collections.rotate(Arrays.asList(X), 1);
                X[0] = newX;
            }
            // Y steps if Y[10] == majority
            if(Y[10] == majority){
                int newY = (Y[20] ^ Y[21]);
                Collections.rotate(Arrays.asList(Y), 1);
                Y[0] = newY;
            }
            // Z steps if Z[10] == majority
            if(Z[10] == majority){
                int newZ = (Z[7] ^ Z[20] ^ Z[21] ^ Z[22]);
                Collections.rotate(Arrays.asList(Z), 1);
                Z[0] = newZ;
            }
            // Calculate keystream bit and add to array
            keyStream[i] = X[18] ^ Y[21] ^ Z[22];
        }
        return keyStream;
    }

    public static void main(String[] args) {
        // Scanner object for input
        Scanner scanner = new Scanner(System.in);
        // Registers for x, y, and z
        Integer[] x = new Integer[19];
        Integer[] y = new Integer[22];
        Integer[] z = new Integer[23];

        System.out.print("Enter the values for each register in this format: (X, Y, Z):\n");
        System.out.print("X = 19 bits; Y = 22 bits; Z = 23 bits\n");
        String input = scanner.nextLine();

        // Replace everything in the input except 1's and 0's
        input = input.replaceAll("[^0-1]", "");

        // Add input to the appropriate registers
        for(int i = 0; i < 19; i++){
            char c = input.charAt(i);
            if(Character.isDigit(c)){
                int digit = Character.getNumericValue(c);
                x[i] = digit;
            }
        }
        for(int i = 0; i < 22; i++){
            char c = input.charAt(i + 19);
            if(Character.isDigit(c)){
                int digit = Character.getNumericValue(c);
                y[i] = digit;
            }
        }
        for (int i = 0; i < 23; i++){
            char c = input.charAt(i + 41);
            if(Character.isDigit(c)){
                int digit = Character.getNumericValue(c);
                z[i] = digit;
            }
        }



        System.out.print("Enter the desired keystream length below:\n");
        int keyLen = scanner.nextInt();

        // Generate keystream with desired length and print the results
        Integer[] key = generateKeyStream(x, y, z, keyLen);
        System.out.print("Key:\n");
        for (Integer value : key) {
            System.out.print(value);
        }

        // Print the contents of each register after keystream is generated
        System.out.print("\nAfter steps\nX: ");
        for (Integer integer : x) {
            System.out.print(integer);
        }
        System.out.print("\nY: ");
        for (Integer integer : y) {
            System.out.print(integer);
        }
        System.out.print("\nZ: ");
        for (Integer integer : z) {
            System.out.print(integer);
        }
    }
}
