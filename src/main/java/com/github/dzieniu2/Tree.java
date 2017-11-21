package com.github.dzieniu2;

public abstract class Tree implements TreeSeed{

    private char symbol;
    private int height,width,center;

    public Tree(char symbol, int height) {

        this.symbol = symbol;
        this.height = height;
        this.width = (height*2)-1;
        this.center = (width-1)/2;
    }

    @Override
    public abstract void drawTree();

    public abstract Character[][] toArray();

    @Override
    public abstract Direction getDirection();

    @Override
    public char getSymbol() {

        return this.symbol;
    }

    @Override
    public int getHeight() {

        return this.height;
    }

    public int getWidth() {

        return this.width;
    }

    public int getCenter() {

        return this.center;
    }

    @Override
    public void setSymbol(char symbol) {

        this.symbol = symbol;
    }

    @Override
    public void setHeight(int height) {

        this.height = height;
        this.width = (height*2)-1;
        this.center = (width-1)/2;
    }
}

