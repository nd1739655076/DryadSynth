// Generated from SygusV1.g4 by ANTLR 4.5.3
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SygusV1Parser}.
 */
public interface SygusV1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SygusV1Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SygusV1Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SygusV1Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SygusV1Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(SygusV1Parser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(SygusV1Parser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#setLogicCmd}.
	 * @param ctx the parse tree
	 */
	void enterSetLogicCmd(SygusV1Parser.SetLogicCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#setLogicCmd}.
	 * @param ctx the parse tree
	 */
	void exitSetLogicCmd(SygusV1Parser.SetLogicCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#cmdPlus}.
	 * @param ctx the parse tree
	 */
	void enterCmdPlus(SygusV1Parser.CmdPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#cmdPlus}.
	 * @param ctx the parse tree
	 */
	void exitCmdPlus(SygusV1Parser.CmdPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#cmdPlusTail}.
	 * @param ctx the parse tree
	 */
	void enterCmdPlusTail(SygusV1Parser.CmdPlusTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#cmdPlusTail}.
	 * @param ctx the parse tree
	 */
	void exitCmdPlusTail(SygusV1Parser.CmdPlusTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(SygusV1Parser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(SygusV1Parser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#varDeclCmd}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclCmd(SygusV1Parser.VarDeclCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#varDeclCmd}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclCmd(SygusV1Parser.VarDeclCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#sortDefCmd}.
	 * @param ctx the parse tree
	 */
	void enterSortDefCmd(SygusV1Parser.SortDefCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#sortDefCmd}.
	 * @param ctx the parse tree
	 */
	void exitSortDefCmd(SygusV1Parser.SortDefCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#sortExpr}.
	 * @param ctx the parse tree
	 */
	void enterSortExpr(SygusV1Parser.SortExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#sortExpr}.
	 * @param ctx the parse tree
	 */
	void exitSortExpr(SygusV1Parser.SortExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#intConst}.
	 * @param ctx the parse tree
	 */
	void enterIntConst(SygusV1Parser.IntConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#intConst}.
	 * @param ctx the parse tree
	 */
	void exitIntConst(SygusV1Parser.IntConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#boolConst}.
	 * @param ctx the parse tree
	 */
	void enterBoolConst(SygusV1Parser.BoolConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#boolConst}.
	 * @param ctx the parse tree
	 */
	void exitBoolConst(SygusV1Parser.BoolConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#bVConst}.
	 * @param ctx the parse tree
	 */
	void enterBVConst(SygusV1Parser.BVConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#bVConst}.
	 * @param ctx the parse tree
	 */
	void exitBVConst(SygusV1Parser.BVConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#enumConst}.
	 * @param ctx the parse tree
	 */
	void enterEnumConst(SygusV1Parser.EnumConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#enumConst}.
	 * @param ctx the parse tree
	 */
	void exitEnumConst(SygusV1Parser.EnumConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#realConst}.
	 * @param ctx the parse tree
	 */
	void enterRealConst(SygusV1Parser.RealConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#realConst}.
	 * @param ctx the parse tree
	 */
	void exitRealConst(SygusV1Parser.RealConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#eCList}.
	 * @param ctx the parse tree
	 */
	void enterECList(SygusV1Parser.ECListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#eCList}.
	 * @param ctx the parse tree
	 */
	void exitECList(SygusV1Parser.ECListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#symbolPlus}.
	 * @param ctx the parse tree
	 */
	void enterSymbolPlus(SygusV1Parser.SymbolPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#symbolPlus}.
	 * @param ctx the parse tree
	 */
	void exitSymbolPlus(SygusV1Parser.SymbolPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#symbolPlusTail}.
	 * @param ctx the parse tree
	 */
	void enterSymbolPlusTail(SygusV1Parser.SymbolPlusTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#symbolPlusTail}.
	 * @param ctx the parse tree
	 */
	void exitSymbolPlusTail(SygusV1Parser.SymbolPlusTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#setOptsCmd}.
	 * @param ctx the parse tree
	 */
	void enterSetOptsCmd(SygusV1Parser.SetOptsCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#setOptsCmd}.
	 * @param ctx the parse tree
	 */
	void exitSetOptsCmd(SygusV1Parser.SetOptsCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#optList}.
	 * @param ctx the parse tree
	 */
	void enterOptList(SygusV1Parser.OptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#optList}.
	 * @param ctx the parse tree
	 */
	void exitOptList(SygusV1Parser.OptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#symbolPairPlus}.
	 * @param ctx the parse tree
	 */
	void enterSymbolPairPlus(SygusV1Parser.SymbolPairPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#symbolPairPlus}.
	 * @param ctx the parse tree
	 */
	void exitSymbolPairPlus(SygusV1Parser.SymbolPairPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#symbolPairPlusTail}.
	 * @param ctx the parse tree
	 */
	void enterSymbolPairPlusTail(SygusV1Parser.SymbolPairPlusTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#symbolPairPlusTail}.
	 * @param ctx the parse tree
	 */
	void exitSymbolPairPlusTail(SygusV1Parser.SymbolPairPlusTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#symbolPair}.
	 * @param ctx the parse tree
	 */
	void enterSymbolPair(SygusV1Parser.SymbolPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#symbolPair}.
	 * @param ctx the parse tree
	 */
	void exitSymbolPair(SygusV1Parser.SymbolPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#funDefCmd}.
	 * @param ctx the parse tree
	 */
	void enterFunDefCmd(SygusV1Parser.FunDefCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#funDefCmd}.
	 * @param ctx the parse tree
	 */
	void exitFunDefCmd(SygusV1Parser.FunDefCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#funDeclCmd}.
	 * @param ctx the parse tree
	 */
	void enterFunDeclCmd(SygusV1Parser.FunDeclCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#funDeclCmd}.
	 * @param ctx the parse tree
	 */
	void exitFunDeclCmd(SygusV1Parser.FunDeclCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#sortStar}.
	 * @param ctx the parse tree
	 */
	void enterSortStar(SygusV1Parser.SortStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#sortStar}.
	 * @param ctx the parse tree
	 */
	void exitSortStar(SygusV1Parser.SortStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(SygusV1Parser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(SygusV1Parser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#symbolSortPairStar}.
	 * @param ctx the parse tree
	 */
	void enterSymbolSortPairStar(SygusV1Parser.SymbolSortPairStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#symbolSortPairStar}.
	 * @param ctx the parse tree
	 */
	void exitSymbolSortPairStar(SygusV1Parser.SymbolSortPairStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#symbolSortPair}.
	 * @param ctx the parse tree
	 */
	void enterSymbolSortPair(SygusV1Parser.SymbolSortPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#symbolSortPair}.
	 * @param ctx the parse tree
	 */
	void exitSymbolSortPair(SygusV1Parser.SymbolSortPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SygusV1Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SygusV1Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#letTerm}.
	 * @param ctx the parse tree
	 */
	void enterLetTerm(SygusV1Parser.LetTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#letTerm}.
	 * @param ctx the parse tree
	 */
	void exitLetTerm(SygusV1Parser.LetTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#letBindingTermPlus}.
	 * @param ctx the parse tree
	 */
	void enterLetBindingTermPlus(SygusV1Parser.LetBindingTermPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#letBindingTermPlus}.
	 * @param ctx the parse tree
	 */
	void exitLetBindingTermPlus(SygusV1Parser.LetBindingTermPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#letBindingTermPlusTail}.
	 * @param ctx the parse tree
	 */
	void enterLetBindingTermPlusTail(SygusV1Parser.LetBindingTermPlusTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#letBindingTermPlusTail}.
	 * @param ctx the parse tree
	 */
	void exitLetBindingTermPlusTail(SygusV1Parser.LetBindingTermPlusTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#letBindingTerm}.
	 * @param ctx the parse tree
	 */
	void enterLetBindingTerm(SygusV1Parser.LetBindingTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#letBindingTerm}.
	 * @param ctx the parse tree
	 */
	void exitLetBindingTerm(SygusV1Parser.LetBindingTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#termStar}.
	 * @param ctx the parse tree
	 */
	void enterTermStar(SygusV1Parser.TermStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#termStar}.
	 * @param ctx the parse tree
	 */
	void exitTermStar(SygusV1Parser.TermStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SygusV1Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SygusV1Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#nTDefPlus}.
	 * @param ctx the parse tree
	 */
	void enterNTDefPlus(SygusV1Parser.NTDefPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#nTDefPlus}.
	 * @param ctx the parse tree
	 */
	void exitNTDefPlus(SygusV1Parser.NTDefPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#nTDefPlusTail}.
	 * @param ctx the parse tree
	 */
	void enterNTDefPlusTail(SygusV1Parser.NTDefPlusTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#nTDefPlusTail}.
	 * @param ctx the parse tree
	 */
	void exitNTDefPlusTail(SygusV1Parser.NTDefPlusTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#nTDef}.
	 * @param ctx the parse tree
	 */
	void enterNTDef(SygusV1Parser.NTDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#nTDef}.
	 * @param ctx the parse tree
	 */
	void exitNTDef(SygusV1Parser.NTDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#gTermPlus}.
	 * @param ctx the parse tree
	 */
	void enterGTermPlus(SygusV1Parser.GTermPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#gTermPlus}.
	 * @param ctx the parse tree
	 */
	void exitGTermPlus(SygusV1Parser.GTermPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#gTermPlusTail}.
	 * @param ctx the parse tree
	 */
	void enterGTermPlusTail(SygusV1Parser.GTermPlusTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#gTermPlusTail}.
	 * @param ctx the parse tree
	 */
	void exitGTermPlusTail(SygusV1Parser.GTermPlusTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#checkSynthCmd}.
	 * @param ctx the parse tree
	 */
	void enterCheckSynthCmd(SygusV1Parser.CheckSynthCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#checkSynthCmd}.
	 * @param ctx the parse tree
	 */
	void exitCheckSynthCmd(SygusV1Parser.CheckSynthCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#constraintCmd}.
	 * @param ctx the parse tree
	 */
	void enterConstraintCmd(SygusV1Parser.ConstraintCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#constraintCmd}.
	 * @param ctx the parse tree
	 */
	void exitConstraintCmd(SygusV1Parser.ConstraintCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#synthFunCmd}.
	 * @param ctx the parse tree
	 */
	void enterSynthFunCmd(SygusV1Parser.SynthFunCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#synthFunCmd}.
	 * @param ctx the parse tree
	 */
	void exitSynthFunCmd(SygusV1Parser.SynthFunCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#gTerm}.
	 * @param ctx the parse tree
	 */
	void enterGTerm(SygusV1Parser.GTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#gTerm}.
	 * @param ctx the parse tree
	 */
	void exitGTerm(SygusV1Parser.GTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#letGTerm}.
	 * @param ctx the parse tree
	 */
	void enterLetGTerm(SygusV1Parser.LetGTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#letGTerm}.
	 * @param ctx the parse tree
	 */
	void exitLetGTerm(SygusV1Parser.LetGTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#letBindingGTermPlus}.
	 * @param ctx the parse tree
	 */
	void enterLetBindingGTermPlus(SygusV1Parser.LetBindingGTermPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#letBindingGTermPlus}.
	 * @param ctx the parse tree
	 */
	void exitLetBindingGTermPlus(SygusV1Parser.LetBindingGTermPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#letBindingGTermPlusTail}.
	 * @param ctx the parse tree
	 */
	void enterLetBindingGTermPlusTail(SygusV1Parser.LetBindingGTermPlusTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#letBindingGTermPlusTail}.
	 * @param ctx the parse tree
	 */
	void exitLetBindingGTermPlusTail(SygusV1Parser.LetBindingGTermPlusTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#letBindingGTerm}.
	 * @param ctx the parse tree
	 */
	void enterLetBindingGTerm(SygusV1Parser.LetBindingGTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#letBindingGTerm}.
	 * @param ctx the parse tree
	 */
	void exitLetBindingGTerm(SygusV1Parser.LetBindingGTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#gTermStar}.
	 * @param ctx the parse tree
	 */
	void enterGTermStar(SygusV1Parser.GTermStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#gTermStar}.
	 * @param ctx the parse tree
	 */
	void exitGTermStar(SygusV1Parser.GTermStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#synthInvCmd}.
	 * @param ctx the parse tree
	 */
	void enterSynthInvCmd(SygusV1Parser.SynthInvCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#synthInvCmd}.
	 * @param ctx the parse tree
	 */
	void exitSynthInvCmd(SygusV1Parser.SynthInvCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#declarePrimedVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclarePrimedVar(SygusV1Parser.DeclarePrimedVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#declarePrimedVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclarePrimedVar(SygusV1Parser.DeclarePrimedVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#invConstraintCmd}.
	 * @param ctx the parse tree
	 */
	void enterInvConstraintCmd(SygusV1Parser.InvConstraintCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#invConstraintCmd}.
	 * @param ctx the parse tree
	 */
	void exitInvConstraintCmd(SygusV1Parser.InvConstraintCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusV1Parser#cliaGrammarCmd}.
	 * @param ctx the parse tree
	 */
	void enterCliaGrammarCmd(SygusV1Parser.CliaGrammarCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusV1Parser#cliaGrammarCmd}.
	 * @param ctx the parse tree
	 */
	void exitCliaGrammarCmd(SygusV1Parser.CliaGrammarCmdContext ctx);
}