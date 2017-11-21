package com.github.dzieniu2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {

    private Scanner scanner;

    public InputManager(){

        scanner = new Scanner(System.in);
    }

    public String getString() {

        return scanner.next();
    }

    public char getChar() {

        String line;
        while(true) {
            line = scanner.next();
            if(line.length()==1) {
                return line.charAt(0);
            }else {
                System.out.println("Input has to be a single character!");
            }
        }
    }

    public int getInt(){

        int value;
        while(true) {
            try {
                scanner = new Scanner(System.in);
                value = scanner.nextInt();
                return value;
            }catch(InputMismatchException e) {
                System.out.println("You have to type a number!");
            }
        }
    }

    public int getInt(Integer greaterThan, Integer lowerThan){

        int value;
        while(true) {
            try {
                scanner = new Scanner(System.in);
                value = scanner.nextInt();
                if(greaterThan!=null && value<=greaterThan) {
                    System.out.println("The number you enter has to be greater than: "+greaterThan);
                }else if(lowerThan!=null && value>=lowerThan) {
                    System.out.println("The number you enter has to be lower than: "+lowerThan);
                }else {
                    return value;
                }
            }catch(InputMismatchException e) {
                System.out.println("You have to type a number!");
            }
        }
    }

    public Direction getDirection() {

        String line;
        while(true) {

            line = scanner.next();
            try {
                return Direction.valueOf(line.toUpperCase());
            }catch(IllegalArgumentException e) {
                System.out.println("Incorrect input! Enter one of the following directions: 'left','right',"
                        + "'up','down'");
            }
        }
    }

    public void close() {

        scanner.close();
    }
}

