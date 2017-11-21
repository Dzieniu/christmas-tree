package com.github.dzieniu2;

public class Main {

    public static void main(String[] args) {

        int height;
        char symbol;
        Direction direction;
        InputManager manager = new InputManager();

        // Receiving the symbol
        System.out.println("I will draw a christmas tree built of a symbol of your choice,"
                + "what symbol should I use?");
        symbol = manager.getChar();

        // Receiving the height
        System.out.println("How high should it be?");
        height = manager.getInt();

        // Receiving the direction
        System.out.println("Now choose the direction its top will be facing,"
                + "left,right,up or down?");
        direction = manager.getDirection();
        manager.close();

        // There are two ways of printing the tree
        // Directly with the Tree.drawTree method...
        direction.getTree(symbol, height).drawTree();

        // or by receiving the array representing the tree from the tree object,
        // and printing using ArrayPrinter class
//		Character [][]array = direction.getTree(symbol, height).toArray();
//		ArrayPrinter<Character> arrayPrinter = new ArrayPrinter<Character>(array);
//		arrayPrinter.printArray();
    }
}
