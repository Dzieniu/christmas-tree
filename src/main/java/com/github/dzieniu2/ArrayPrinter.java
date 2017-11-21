package com.github.dzieniu2;

public class ArrayPrinter<T> {

    private T[][]array;

    public ArrayPrinter(T[][] array) {

        this.array = array;
    }

    public void printArray() {

        int height = array.length;
        int width = array[0].length;

        for(int i=0;i<height;i++) {
            for(int j=0;j<width;j++) {
                System.out.print(array[i][j]);
            }
            if(i<height-1) {
                System.out.println();
            }
        }
    }
}
