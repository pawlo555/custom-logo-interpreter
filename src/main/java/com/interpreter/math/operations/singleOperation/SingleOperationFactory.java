package com.interpreter.math.operations.singleOperation;

import com.interpreter.math.MathValue;
import com.interpreter.math.Operators;

public class SingleOperationFactory {

    public static SingleOperatorOperation factorOperation(Operators operator, MathValue value) {
        return switch(operator) {
            case LN -> new LnOperation(value);
            case MINUS_SINGLE -> new MinusSingleOperation(value);
            case NOT -> new NotOperation(value);
            case EXP -> new ExpOperation(value);
            case INT -> new IntOperation(value);
            case ABS -> new AbsOperation(value);
            case COS -> new CosOperation(value);
            case RAND -> new RandOperation(value);
            case SIN -> new SinOperation(value);
            case SQRT -> new SqrtOperation(value);
            case TAN -> new TanOperation(value);
            case ARCTAN -> new ArctanOperation(value);
            case ROUND -> new RoundOperation(value);
            default -> throw new IllegalStateException("Unsupported operator");
        };
    }
}
