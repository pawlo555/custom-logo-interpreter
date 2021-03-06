// Generated from C:/Studia/Kompilatory/LynxTranslator/src/main/java/com.grammar\Logo.g4 by ANTLR 4.9.2
package com.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LogoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(LogoParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(LogoParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#mathStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathStatement(LogoParser.MathStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleArgs}
	 * labeled alternative in {@link LogoParser#mathSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleArgs(LogoParser.SingleArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleArgs}
	 * labeled alternative in {@link LogoParser#mathSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleArgs(LogoParser.DoubleArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value}
	 * labeled alternative in {@link LogoParser#mathSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LogoParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brakets}
	 * labeled alternative in {@link LogoParser#mathSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrakets(LogoParser.BraketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#mathValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathValue(LogoParser.MathValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code abs}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbs(LogoParser.AbsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arctan}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArctan(LogoParser.ArctanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cos}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(LogoParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int1}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt1(LogoParser.Int1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ln}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLn(LogoParser.LnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusSingle}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusSingle(LogoParser.MinusSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code random}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandom(LogoParser.RandomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code round}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRound(LogoParser.RoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sin}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSin(LogoParser.SinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqrt}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrt(LogoParser.SqrtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tan}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTan(LogoParser.TanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(LogoParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code difference}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifference(LogoParser.DifferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code power}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(LogoParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotient}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotient(LogoParser.QuotientContext ctx);
	/**
	 * Visit a parse tree produced by the {@code remainder}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemainder(LogoParser.RemainderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sum}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(LogoParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(LogoParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code product}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduct(LogoParser.ProductContext ctx);
	/**
	 * Visit a parse tree produced by the {@code division}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(LogoParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonEquals}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonEquals(LogoParser.ComparisonEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonBigger}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonBigger(LogoParser.ComparisonBiggerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonSmaller}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonSmaller(LogoParser.ComparisonSmallerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonBiggerEquals}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonBiggerEquals(LogoParser.ComparisonBiggerEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonSmallerEquals}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonSmallerEquals(LogoParser.ComparisonSmallerEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(LogoParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code log}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(LogoParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(LogoParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(LogoParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(LogoParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#acction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcction(LogoParser.AcctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#stringArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArg(LogoParser.StringArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(LogoParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(LogoParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#procedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureCall(LogoParser.ProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(LogoParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#while1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile1(LogoParser.While1Context ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#back}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBack(LogoParser.BackContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#forward}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward(LogoParser.ForwardContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#left}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft(LogoParser.LeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#right}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight(LogoParser.RightContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#setcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetcolor(LogoParser.SetcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#setpensize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetpensize(LogoParser.SetpensizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#newTurtle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewTurtle(LogoParser.NewTurtleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#rename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename(LogoParser.RenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#changeTurtle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeTurtle(LogoParser.ChangeTurtleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#removeTurtle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveTurtle(LogoParser.RemoveTurtleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#ifc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfc(LogoParser.IfcContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#ifElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(LogoParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#home}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHome(LogoParser.HomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#clean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClean(LogoParser.CleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#pd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPd(LogoParser.PdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#pu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPu(LogoParser.PuContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(LogoParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LogoParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#spaceArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpaceArg(LogoParser.SpaceArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#newLineArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewLineArg(LogoParser.NewLineArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#brakeArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrakeArg(LogoParser.BrakeArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#endFileArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndFileArg(LogoParser.EndFileArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#commandsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandsList(LogoParser.CommandsListContext ctx);
}