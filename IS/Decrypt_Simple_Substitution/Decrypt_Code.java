/**
 *  Description: This Java program will take a ciphertext as input and compute
 *  and display the frequency of each letter. The program is given an arraylist
 *  of each individual English character, sorted from most common to least common.
 *  It then suggests to the user the correct key based on the most frequent letter and
 *  lets the user guess the key. Once guessed key is inputted, the program will
 *  display the results of the corresponding "decryption" with the putative key.
 *  The program will allow the user to try this step as many times as needed until
 *  getting the correct plaintext. Finally, the program will output the correct key
 *  in all uppercase.
 *  Author name: Danny Garcia
 *  Author email: danny.garcia@sjsu.edu
 *  Creation Date: 03/22/2023
 *  Last modified date: 03/24/2023
 */

import java.util.*;

public class Decrypt_Code {
    /**
     * Function name: countFreq
     * Counts the frequency of CAPITAL letters in a given string, sorts the letters
     * from most frequent to the least frequent and returns the result in an ArrayList
     * of Hashmap
     * @param message
     * @return ArrayList<Map.Entry<Character, Integer>>
     */
    public static ArrayList<Map.Entry<Character, Integer>> countFreq(String message){
        Map<Character, Integer> freqMap = new HashMap<>();

        // Count frequency for each letter
        for(int i = 0; i < message.length(); i++){
            char c = message.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }
        }

        // Add missing letters with a frequency of 0
        for(char c = 'A'; c <= 'Z'; c++){
            if(!freqMap.containsKey(c)){
                freqMap.put(c, 0);
            }
        }

        // Sort by descending order and return the result
        ArrayList<Map.Entry<Character, Integer>> freqList = new ArrayList<>(freqMap.entrySet());
        freqList.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
        return freqList;
    }

    public static void main(String[] args) {
        int i = 0;
        boolean encrypted = true;

        //Scanner object for input stream
        Scanner input = new Scanner(System.in);

        // Set the data structure for key
        Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Map<Character, Character> key = new HashMap<Character, Character>();
        for(Character ch: alphabet){
            key.put(ch, null);
        }
        // List of common english letters from most frequent to the least frequent
        Character[] commonChar = {'e', 'a', 'r', 'i', 'o', 't', 'n', 's', 'l', 'c', 'u', 'd', 'p', 'm', 'h', 'g', 'b', 'f', 'y', 'w', 'k', 'v', 'x', 'z', 'j', 'q'};
        LinkedList<Character> commonList = new LinkedList<Character>(Arrays.asList(commonChar));

        System.out.print("Enter ciphertext below:\n");
        String cipherText = input.nextLine();

        // Set all encoded characters to all capital letters if not already set
        cipherText = cipherText.toUpperCase();
        System.out.print("Cipher Text:\n" + cipherText + "\n");

        // Counts the frequency of each letter in the input string
        ArrayList<Map.Entry<Character, Integer>> freqList = countFreq(cipherText);


        // Formatting the table of the output
        System.out.print("Frequency table (high to low)\n");
        System.out.print("plain:  ");
        for(Character character : commonList) {
            System.out.print(character + "   ");
        }
        System.out.print("\nCIPHER: ");
        for(Map.Entry<Character, Integer> entry : freqList){
            System.out.print(entry.getKey() + "   ");
        }
        System.out.print("\nCount:  ");
        for(Map.Entry<Character, Integer> entry : freqList){
            if(entry.getValue() >= 10){
                System.out.print(entry.getValue() + "  ");
            }
            else {
                System.out.print(entry.getValue() + "   ");
            }
        }

        while(encrypted){
            System.out.print("\n--------------------------------------------------------------------------------------------------------------");
            Iterator<Map.Entry<Character, Integer>> iter = freqList.iterator();
            Map.Entry<Character, Integer> entry = iter.next();

            // Give suggestion based on the most frequent letter in ciphertext and the english language
            System.out.print("\nSuggested key for '" + entry.getKey() + "': " + commonList.get(i) + " or " + commonList.get(i+1));
            System.out.println("\nEnter in your guess for the key of only one letter, in the format: (Encrypted Character) (Guessed key):");

            // CipherText character to be replaced will be automatically capitalized
            char cipherChar = input.next().charAt(0);
            cipherChar = Character.toUpperCase(cipherChar);

            // Replacement character will be automatically set to lower case
            char replacement = input.next().charAt(0);
            replacement = Character.toLowerCase(replacement);

            // If no replacement character is given
            while (replacement == '\0'){
                System.out.print("Please enter a second letter to be replaced with");
                replacement = input.next().charAt(0);
            }
            while(!commonList.contains(replacement) && !freqList.contains(cipherChar)){
                System.out.print("Character not found in the list or already inputted, please enter again");
                cipherChar = input.next().charAt(0);
                cipherChar = Character.toUpperCase(cipherChar);

                replacement = input.next().charAt(0);
                replacement = Character.toLowerCase(replacement);

            }

            System.out.print("You entered " + cipherChar + " to be replaced by " + replacement);
            cipherText = cipherText.replace(cipherChar, replacement);
            freqList = countFreq(cipherText);
            int index = commonList.indexOf(replacement);
            commonList.remove(index);

            System.out.print("\nAfter replacement:\n" + cipherText);
            // Formatting the table of the output
            System.out.print("\nplain:  ");
            for(Character character : commonList) {
                System.out.print(character + "   ");
            }
            System.out.print("\nCIPHER: ");
            for(Map.Entry<Character, Integer> entry1 : freqList){
                System.out.print(entry1.getKey() + "   ");
            }
            System.out.print("\nCount:  ");
            for(Map.Entry<Character, Integer> entry2 : freqList){
                if(entry2.getValue() >= 10){
                    System.out.print(entry2.getValue() + "  ");
                }
                else {
                    System.out.print(entry2.getValue() + "   ");
                }
            }

            /**
             *  Allow user to make multiple changes on the same character
             *  *Note*: Once changes have been accepted for a character, it cannot be changed back.
             */
            System.out.print("\nDo you want to keep changes? Y/N: ");
            String change = input.next();
            change = change.toUpperCase();

            // If unrecognizable command is inputted. Advise user and revert changes back
            if(change.charAt(0) != 'N' && change.charAt(0) != 'Y'){
                System.out.print("Please input a correct command");
                change = "N" + change.substring(1);
                System.out.print(change);
            }
            if(change.charAt(0) == 'N'){
                // Revert changes
                commonList.add(index, replacement); // Add replacement character back to the list
                cipherText = cipherText.replace(replacement, cipherChar);   // Replace plaintext character back to ciphertext
                freqList = countFreq(cipherText);   // Update the frequency list with the ciphertext char added back
                System.out.print("\n" + cipherText);
                System.out.print("\nplain:  ");
                for(Character character : commonList) {
                    System.out.print(character + "   ");
                }
                System.out.print("\nCIPHER: ");
                for(Map.Entry<Character, Integer> entry1 : freqList){
                    System.out.print(entry1.getKey() + "   ");
                }
                System.out.print("\nCount:  ");
                for(Map.Entry<Character, Integer> entry2 : freqList){
                    if(entry2.getValue() >= 10){
                        System.out.print(entry2.getValue() + "  ");
                    }
                    else {
                        System.out.print(entry2.getValue() + "   ");
                    }
                }
            }
            else if(change.charAt(0) == 'Y'){
                // Add decrypted text to key hashmap
                key.put(replacement, cipherChar);

                // If there are no more characters to decrypt after accepting changes
                if(iter.next().getValue().equals(0) || !iter.hasNext()){
                    encrypted = false;
                    System.out.print("Key:\n");
                    // Print out key with corresponding letter under it
                    for(Character k : key.keySet()){
                        Character value = key.get(k);
                        if(value != null && Character.isUpperCase(value)){
                            System.out.print(value);
                        }
                    }
                    System.out.print("\n");
                    for (Map.Entry<Character, Character> m : key.entrySet()){
                        Character k = m.getKey();
                        Character v = m.getValue();
                        if(v != null && Character.isUpperCase(v)){
                            System.out.print(k);
                        }
                    }
                }
            }
        }

    }
}
