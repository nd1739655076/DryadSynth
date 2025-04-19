// Generated from SygusV1.g4 by ANTLR 4.5.3
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SygusV1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SygusV1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SygusV1Parser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SygusV1Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(SygusV1Parser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#setLogicCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetLogicCmd(SygusV1Parser.SetLogicCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#cmdPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPlus(SygusV1Parser.CmdPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#cmdPlusTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPlusTail(SygusV1Parser.CmdPlusTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(SygusV1Parser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#varDeclCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclCmd(SygusV1Parser.VarDeclCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#sortDefCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortDefCmd(SygusV1Parser.SortDefCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#sortExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortExpr(SygusV1Parser.SortExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#intConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntConst(SygusV1Parser.IntConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#boolConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolConst(SygusV1Parser.BoolConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#bVConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBVConst(SygusV1Parser.BVConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#enumConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConst(SygusV1Parser.EnumConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#realConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealConst(SygusV1Parser.RealConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#eCList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitECList(SygusV1Parser.ECListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#symbolPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolPlus(SygusV1Parser.SymbolPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#symbolPlusTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolPlusTail(SygusV1Parser.SymbolPlusTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#setOptsCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOptsCmd(SygusV1Parser.SetOptsCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#optList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptList(SygusV1Parser.OptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#symbolPairPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolPairPlus(SygusV1Parser.SymbolPairPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#symbolPairPlusTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolPairPlusTail(SygusV1Parser.SymbolPairPlusTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#symbolPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolPair(SygusV1Parser.SymbolPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#funDefCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDefCmd(SygusV1Parser.FunDefCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#funDeclCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDeclCmd(SygusV1Parser.FunDeclCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#sortStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortStar(SygusV1Parser.SortStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(SygusV1Parser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#symbolSortPairStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolSortPairStar(SygusV1Parser.SymbolSortPairStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#symbolSortPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolSortPair(SygusV1Parser.SymbolSortPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SygusV1Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#letTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetTerm(SygusV1Parser.LetTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#letBindingTermPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetBindingTermPlus(SygusV1Parser.LetBindingTermPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#letBindingTermPlusTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetBindingTermPlusTail(SygusV1Parser.LetBindingTermPlusTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#letBindingTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetBindingTerm(SygusV1Parser.LetBindingTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#termStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermStar(SygusV1Parser.TermStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SygusV1Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#nTDefPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNTDefPlus(SygusV1Parser.NTDefPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#nTDefPlusTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNTDefPlusTail(SygusV1Parser.NTDefPlusTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#nTDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNTDef(SygusV1Parser.NTDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#gTermPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGTermPlus(SygusV1Parser.GTermPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#gTermPlusTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGTermPlusTail(SygusV1Parser.GTermPlusTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#checkSynthCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckSynthCmd(SygusV1Parser.CheckSynthCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#constraintCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintCmd(SygusV1Parser.ConstraintCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#synthFunCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthFunCmd(SygusV1Parser.SynthFunCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#gTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGTerm(SygusV1Parser.GTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#letGTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetGTerm(SygusV1Parser.LetGTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#letBindingGTermPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetBindingGTermPlus(SygusV1Parser.LetBindingGTermPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#letBindingGTermPlusTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetBindingGTermPlusTail(SygusV1Parser.LetBindingGTermPlusTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#letBindingGTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetBindingGTerm(SygusV1Parser.LetBindingGTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#gTermStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGTermStar(SygusV1Parser.GTermStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#synthInvCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthInvCmd(SygusV1Parser.SynthInvCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#declarePrimedVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarePrimedVar(SygusV1Parser.DeclarePrimedVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#invConstraintCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvConstraintCmd(SygusV1Parser.InvConstraintCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusV1Parser#cliaGrammarCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCliaGrammarCmd(SygusV1Parser.CliaGrammarCmdContext ctx);
}