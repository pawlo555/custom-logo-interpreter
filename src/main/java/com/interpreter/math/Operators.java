package com.interpreter.math;

public enum Operators {
    MINUS, LOG, MULTIPLY, PLUS, LN, MINUS_SINGLE,DIVIDE,
    ABS,ARCTAN,COS,INT,RAND,ROUND,SIN,SQRT,TAN,NOT,POW,
    QUOT,REMAINDER,COMP,EXP,OR,AND,DIFFERENCE, COMPSMALLER,
    COMPSMALLEREQUALS, COMPBIGGER, COMPBIGGEREQUALS, LEFT_BRACKET, RIGHT_BRACKET;


    public int howManyArgumentsTakes() {
        return switch(this) {
            case LN, MINUS_SINGLE,ABS,ARCTAN,COS,INT,RAND,ROUND,
                    SIN,SQRT,TAN,NOT,EXP,LEFT_BRACKET, RIGHT_BRACKET -> 1;
            case MULTIPLY,PLUS,MINUS,LOG,DIVIDE,DIFFERENCE,
                    QUOT,AND,OR,COMP,REMAINDER,POW,COMPSMALLER,
                    COMPSMALLEREQUALS,COMPBIGGER, COMPBIGGEREQUALS-> 2;
        };
    }

    public boolean isRightCumulate() {
        return true;
    }

    public int getPriority() {
        return switch(this) {
            case LEFT_BRACKET, RIGHT_BRACKET -> -1;
            case COMP, COMPSMALLER, COMPSMALLEREQUALS, COMPBIGGER, COMPBIGGEREQUALS -> 0;
            case AND,OR -> 1;
            case MINUS, DIFFERENCE, NOT  -> 2;
            case  PLUS ,REMAINDER  -> 5;
            case  DIVIDE -> 6;
            case  MULTIPLY,QUOT -> 7;
            case  POW,EXP-> 8;
            case  LOG-> 9;
            case  LN, INT, ABS, COS ,RAND, ROUND, SIN , SQRT, TAN, ARCTAN -> 10;
            case MINUS_SINGLE -> 11;
        };
    }
}


