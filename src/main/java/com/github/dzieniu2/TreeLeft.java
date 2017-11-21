package com.github.dzieniu2;

public class TreeLeft extends Tree{

    private Direction direction;

    public TreeLeft(char symbol, int height) {

        super(symbol, height);
        this.direction = Direction.LEFT;
    }

    @Override
    public void drawTree() {

        String line;
        for(int j=this.getHeight();j>=1;j--) {
            line = "";
            int k;
            for(k=0;k<j;k++) {
                line = line.concat(" ");
            }
            for(int l=k;l<=this.getHeight();l++) {
                line = line + this.getSymbol();
            }
            System.out.println(line);
        }
        for(int j=2;j<=this.getHeight();j++) {
            line = "";
            int k;
            for(k=0;k<j;k++) {
                line = line.concat(" ");
            }
            for(int l=k;l<=this.getHeight();l++) {
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
            for(int j=0;j<=i;j++) {
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

