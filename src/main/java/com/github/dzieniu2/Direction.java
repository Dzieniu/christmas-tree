package com.github.dzieniu2;

public enum Direction {

    UP{
        public TreeUp getTree(char symbol, int height) {

            return new TreeUp(symbol,height);
        }
    },
    DOWN{
        public TreeDown getTree(char symbol, int height) {

            return new TreeDown(symbol,height);
        }
    },
    LEFT{
        public TreeLeft getTree(char symbol, int height) {

            return new TreeLeft(symbol,height);
        }
    },
    RIGHT{
        public TreeRight getTree(char symbol, int height) {

            return new TreeRight(symbol,height);
        }
    };

    public abstract Tree getTree(char symbol, int height);

}

