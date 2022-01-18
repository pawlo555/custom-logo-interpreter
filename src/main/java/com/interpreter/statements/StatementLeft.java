package com.interpreter.statements;

import com.interpreter.Executor;
import com.interpreter.math.MathStatement;
import com.interpreter.math.MathValue;
import org.antlr.v4.runtime.ParserRuleContext;

public class StatementLeft extends AbstractStatement {
    private final MathStatement mathStatement;

    public StatementLeft(ParserRuleContext ctx, MathStatement mathStatement) {
        super(ctx);
        this.mathStatement = mathStatement;
    }

    @Override
    public void customExecute(Executor executor) {
        MathValue value = mathStatement.evaluate(executor);
        executor.getEngine().left(value.getIntValue());
    }
}