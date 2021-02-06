/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author ghandour
 */
public class Compiler {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //  Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        // check
        if(Pattern.matches("(?:\\ba\\b|\\baaa+\\b|\\bba+\\b)", myString)) {
          System.out.println("Match accepted");
        } else {
          System.out.println("Match rejected");
        }
        
    }
    
}
