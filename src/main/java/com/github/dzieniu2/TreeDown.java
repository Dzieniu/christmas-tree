package com.github.dzieniu2;

public class TreeDown extends Tree{

    private Direction direction;

    public TreeDown(char symbol, int height) {

        super(symbol, height);
        this.direction = Direction.DOWN;
    }

    @Override
    public void drawTree() {

        String line;
        int j = this.getWidth();
        for(int i=1;i<=this.getHeight();i++) {

            line = "";
            for(int k=1;k<=(this.getWidth()-j)/2;k++) {
                line = line.concat(" ");
            }
            for(int k=1;k<=j;k++) {
                line = line + this.getSymbol();
            }
            for(int k=1;k<=(this.getWidth()-j)/2;k++) {
                line = line.concat(" ");
            }
            System.out.println(line);
            j=j-2;
        }
    }

    @Override
    public Direction getDirection() {

        return this.direction;
    }

    @Override
    public Character[][] toArray() {

        Character array[][] = new Character[this.getHeight()][this.getWidth()];

        for(int i=0;i<this.getHeight();i++) {
            for(int j=0;j<this.getWidth();j++) {
                array[i][j] = ' ';
            }
        }

        for(int i=0;i<this.getHeight();i++) {
            for(int j=0;j<=getHeight()-i-1;j++) {
                if(j==0) {
                    array[i][this.getCenter()] = this.getSymbol();
                }else {
                    array[i][this.getCenter()-j] = this.getSymbol();
                    array[i][this.getCenter()+j] = this.getSymbol();
                }
            }
        }
        return array;
    }
}


