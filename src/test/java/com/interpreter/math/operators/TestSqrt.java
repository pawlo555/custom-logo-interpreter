package com.interpreter.math.operators;

import com.interpreter.math.MathStatement;
import com.interpreter.math.MathValue;
import com.interpreter.math.Operators;
import com.interpreter.math.operations.MathException;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestSqrt {

    @Test
    public void testSqrt1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast(Operators.SQRT.name());
        linkedList.addLast("4");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(2, value.getDoubleValue());
    }

    @Test
    public void negativeRadicand() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast(Operators.SQRT.name());
        linkedList.addLast("-4");
        MathStatement statement = new MathStatement(linkedList);
        MathException thrown = assertThrows(MathException.class, () -> statement.evaluate(null));
        assertEquals(MathException.PREFIX+MathException.NEGATIVE_SQRT + "-4", thrown.getMessage());
    }
}
