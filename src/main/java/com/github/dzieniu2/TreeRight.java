package com.github.dzieniu2;

public class TreeRight extends Tree{

    private Direction direction;

    public TreeRight(char symbol, int height) {

        super(symbol, height);
        this.direction = Direction.RIGHT;
    }

    @Override
    public void drawTree() {

        String line;
        for(int j=1;j<=this.getHeight();j++) {
            line = "";
            for(int k=0;k<j;k++) {
                line = line + this.getSymbol();
            }
            System.out.println(line);
        }
        for(int j=this.getHeight()-1;j>=1;j--) {
            line = "";
            for(int k=0;k<j;k++) {
                line = line + this.getSymbol();
            }
            System.out.println(line);
        }
    }

    @Override
    public Direction getDirection() {

        return this.direction;
    }

    @Override
    public Character[][] toArray() {

        Character array[][] = new Character[this.getWidth()][this.getHeight()];

        for(int i=0;i<this.getWidth();i++) {
            for(int j=0;j<this.getHeight();j++) {
                array[i][j] = ' ';
            }
        }

        for(int i=0;i<this.getHeight();i++) {
            for(int j=0;j<=this.getHeight()-i-1;j++) {
                if(j==0) {
                    array[this.getCenter()][i] = this.getSymbol();
                }else {
                    array[this.getCenter()+j][i] = this.getSymbol();
                    array[this.getCenter()-j][i] = this.getSymbol();
                }
            }
        }
        return array;
    }
}

