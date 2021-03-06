package com.interpreter.statements;

import com.interpreter.Executor;
import com.interpreter.engine.MockEngine;
import com.interpreter.math.MathStatement;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStatementLeft {

    @Test
    public void simpleLeft() {
        MockEngine engine = new MockEngine();
        Executor executor = new Executor(engine);
        LinkedList<String> mathElements = new LinkedList<>();
        mathElements.addLast("90");

        StatementLeft left = new StatementLeft(null, new MathStatement(mathElements));
        left.execute(executor);

        assertEquals(1, engine.getLeftTimes());
        assertEquals(90, engine.getLeftAmount());
    }

    @Test
    public void multipleLeft() {
        MockEngine engine = new MockEngine();
        Executor executor = new Executor(engine);
        LinkedList<String> mathElements = new LinkedList<>();
        mathElements.addLast("45");

        for (int i=0; i<4; i++) {
            StatementLeft left = new StatementLeft(null, new MathStatement(mathElements));
            left.execute(executor);
        }

        assertEquals(4, engine.getLeftTimes());
        assertEquals(180, engine.getLeftAmount());
    }
}
