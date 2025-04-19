// Generated from Sygus.g4 by ANTLR 4.5.3
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SygusParser}.
 */
public interface SygusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SygusParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SygusParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SygusParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SygusParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SygusParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#negativeNumber}.
	 * @param ctx the parse tree
	 */
	void enterNegativeNumber(SygusParser.NegativeNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#negativeNumber}.
	 * @param ctx the parse tree
	 */
	void exitNegativeNumber(SygusParser.NegativeNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#numeral}.
	 * @param ctx the parse tree
	 */
	void enterNumeral(SygusParser.NumeralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#numeral}.
	 * @param ctx the parse tree
	 */
	void exitNumeral(SygusParser.NumeralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(SygusParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(SygusParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#boolconst}.
	 * @param ctx the parse tree
	 */
	void enterBoolconst(SygusParser.BoolconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#boolconst}.
	 * @param ctx the parse tree
	 */
	void exitBoolconst(SygusParser.BoolconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#hexconst}.
	 * @param ctx the parse tree
	 */
	void enterHexconst(SygusParser.HexconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#hexconst}.
	 * @param ctx the parse tree
	 */
	void exitHexconst(SygusParser.HexconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#binconst}.
	 * @param ctx the parse tree
	 */
	void enterBinconst(SygusParser.BinconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#binconst}.
	 * @param ctx the parse tree
	 */
	void exitBinconst(SygusParser.BinconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#stringconst}.
	 * @param ctx the parse tree
	 */
	void enterStringconst(SygusParser.StringconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#stringconst}.
	 * @param ctx the parse tree
	 */
	void exitStringconst(SygusParser.StringconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SygusParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SygusParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#identifierextra}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierextra(SygusParser.IdentifierextraContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#identifierextra}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierextra(SygusParser.IdentifierextraContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(SygusParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(SygusParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#sort}.
	 * @param ctx the parse tree
	 */
	void enterSort(SygusParser.SortContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#sort}.
	 * @param ctx the parse tree
	 */
	void exitSort(SygusParser.SortContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#sortextra}.
	 * @param ctx the parse tree
	 */
	void enterSortextra(SygusParser.SortextraContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#sortextra}.
	 * @param ctx the parse tree
	 */
	void exitSortextra(SygusParser.SortextraContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SygusParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SygusParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#iteexpr}.
	 * @param ctx the parse tree
	 */
	void enterIteexpr(SygusParser.IteexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#iteexpr}.
	 * @param ctx the parse tree
	 */
	void exitIteexpr(SygusParser.IteexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr(SygusParser.BoolexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr(SygusParser.BoolexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#andexpr}.
	 * @param ctx the parse tree
	 */
	void enterAndexpr(SygusParser.AndexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#andexpr}.
	 * @param ctx the parse tree
	 */
	void exitAndexpr(SygusParser.AndexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#orexpr}.
	 * @param ctx the parse tree
	 */
	void enterOrexpr(SygusParser.OrexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#orexpr}.
	 * @param ctx the parse tree
	 */
	void exitOrexpr(SygusParser.OrexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#notexpr}.
	 * @param ctx the parse tree
	 */
	void enterNotexpr(SygusParser.NotexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#notexpr}.
	 * @param ctx the parse tree
	 */
	void exitNotexpr(SygusParser.NotexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#eqexpr}.
	 * @param ctx the parse tree
	 */
	void enterEqexpr(SygusParser.EqexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#eqexpr}.
	 * @param ctx the parse tree
	 */
	void exitEqexpr(SygusParser.EqexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#gtexpr}.
	 * @param ctx the parse tree
	 */
	void enterGtexpr(SygusParser.GtexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#gtexpr}.
	 * @param ctx the parse tree
	 */
	void exitGtexpr(SygusParser.GtexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#geexpr}.
	 * @param ctx the parse tree
	 */
	void enterGeexpr(SygusParser.GeexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#geexpr}.
	 * @param ctx the parse tree
	 */
	void exitGeexpr(SygusParser.GeexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#ltexpr}.
	 * @param ctx the parse tree
	 */
	void enterLtexpr(SygusParser.LtexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#ltexpr}.
	 * @param ctx the parse tree
	 */
	void exitLtexpr(SygusParser.LtexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#leexpr}.
	 * @param ctx the parse tree
	 */
	void enterLeexpr(SygusParser.LeexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#leexpr}.
	 * @param ctx the parse tree
	 */
	void exitLeexpr(SygusParser.LeexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#toexpr}.
	 * @param ctx the parse tree
	 */
	void enterToexpr(SygusParser.ToexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#toexpr}.
	 * @param ctx the parse tree
	 */
	void exitToexpr(SygusParser.ToexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvuge}.
	 * @param ctx the parse tree
	 */
	void enterBvuge(SygusParser.BvugeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvuge}.
	 * @param ctx the parse tree
	 */
	void exitBvuge(SygusParser.BvugeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvugt}.
	 * @param ctx the parse tree
	 */
	void enterBvugt(SygusParser.BvugtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvugt}.
	 * @param ctx the parse tree
	 */
	void exitBvugt(SygusParser.BvugtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvule}.
	 * @param ctx the parse tree
	 */
	void enterBvule(SygusParser.BvuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvule}.
	 * @param ctx the parse tree
	 */
	void exitBvule(SygusParser.BvuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvult}.
	 * @param ctx the parse tree
	 */
	void enterBvult(SygusParser.BvultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvult}.
	 * @param ctx the parse tree
	 */
	void exitBvult(SygusParser.BvultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvslt}.
	 * @param ctx the parse tree
	 */
	void enterBvslt(SygusParser.BvsltContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvslt}.
	 * @param ctx the parse tree
	 */
	void exitBvslt(SygusParser.BvsltContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvsge}.
	 * @param ctx the parse tree
	 */
	void enterBvsge(SygusParser.BvsgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvsge}.
	 * @param ctx the parse tree
	 */
	void exitBvsge(SygusParser.BvsgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvsgt}.
	 * @param ctx the parse tree
	 */
	void enterBvsgt(SygusParser.BvsgtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvsgt}.
	 * @param ctx the parse tree
	 */
	void exitBvsgt(SygusParser.BvsgtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvsle}.
	 * @param ctx the parse tree
	 */
	void enterBvsle(SygusParser.BvsleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvsle}.
	 * @param ctx the parse tree
	 */
	void exitBvsle(SygusParser.BvsleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#xor}.
	 * @param ctx the parse tree
	 */
	void enterXor(SygusParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#xor}.
	 * @param ctx the parse tree
	 */
	void exitXor(SygusParser.XorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#intexpr}.
	 * @param ctx the parse tree
	 */
	void enterIntexpr(SygusParser.IntexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#intexpr}.
	 * @param ctx the parse tree
	 */
	void exitIntexpr(SygusParser.IntexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void enterAddexpr(SygusParser.AddexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void exitAddexpr(SygusParser.AddexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#minusexpr}.
	 * @param ctx the parse tree
	 */
	void enterMinusexpr(SygusParser.MinusexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#minusexpr}.
	 * @param ctx the parse tree
	 */
	void exitMinusexpr(SygusParser.MinusexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#negexpr}.
	 * @param ctx the parse tree
	 */
	void enterNegexpr(SygusParser.NegexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#negexpr}.
	 * @param ctx the parse tree
	 */
	void exitNegexpr(SygusParser.NegexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#mulexpr}.
	 * @param ctx the parse tree
	 */
	void enterMulexpr(SygusParser.MulexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#mulexpr}.
	 * @param ctx the parse tree
	 */
	void exitMulexpr(SygusParser.MulexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bitexpr}.
	 * @param ctx the parse tree
	 */
	void enterBitexpr(SygusParser.BitexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bitexpr}.
	 * @param ctx the parse tree
	 */
	void exitBitexpr(SygusParser.BitexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bitarith}.
	 * @param ctx the parse tree
	 */
	void enterBitarith(SygusParser.BitarithContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bitarith}.
	 * @param ctx the parse tree
	 */
	void exitBitarith(SygusParser.BitarithContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvadd}.
	 * @param ctx the parse tree
	 */
	void enterBvadd(SygusParser.BvaddContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvadd}.
	 * @param ctx the parse tree
	 */
	void exitBvadd(SygusParser.BvaddContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvsub}.
	 * @param ctx the parse tree
	 */
	void enterBvsub(SygusParser.BvsubContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvsub}.
	 * @param ctx the parse tree
	 */
	void exitBvsub(SygusParser.BvsubContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvneg}.
	 * @param ctx the parse tree
	 */
	void enterBvneg(SygusParser.BvnegContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvneg}.
	 * @param ctx the parse tree
	 */
	void exitBvneg(SygusParser.BvnegContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvmul}.
	 * @param ctx the parse tree
	 */
	void enterBvmul(SygusParser.BvmulContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvmul}.
	 * @param ctx the parse tree
	 */
	void exitBvmul(SygusParser.BvmulContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvurem}.
	 * @param ctx the parse tree
	 */
	void enterBvurem(SygusParser.BvuremContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvurem}.
	 * @param ctx the parse tree
	 */
	void exitBvurem(SygusParser.BvuremContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvudiv}.
	 * @param ctx the parse tree
	 */
	void enterBvudiv(SygusParser.BvudivContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvudiv}.
	 * @param ctx the parse tree
	 */
	void exitBvudiv(SygusParser.BvudivContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvsdiv}.
	 * @param ctx the parse tree
	 */
	void enterBvsdiv(SygusParser.BvsdivContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvsdiv}.
	 * @param ctx the parse tree
	 */
	void exitBvsdiv(SygusParser.BvsdivContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvsrem}.
	 * @param ctx the parse tree
	 */
	void enterBvsrem(SygusParser.BvsremContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvsrem}.
	 * @param ctx the parse tree
	 */
	void exitBvsrem(SygusParser.BvsremContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvsmod}.
	 * @param ctx the parse tree
	 */
	void enterBvsmod(SygusParser.BvsmodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvsmod}.
	 * @param ctx the parse tree
	 */
	void exitBvsmod(SygusParser.BvsmodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvshl}.
	 * @param ctx the parse tree
	 */
	void enterBvshl(SygusParser.BvshlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvshl}.
	 * @param ctx the parse tree
	 */
	void exitBvshl(SygusParser.BvshlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvlshr}.
	 * @param ctx the parse tree
	 */
	void enterBvlshr(SygusParser.BvlshrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvlshr}.
	 * @param ctx the parse tree
	 */
	void exitBvlshr(SygusParser.BvlshrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvashr}.
	 * @param ctx the parse tree
	 */
	void enterBvashr(SygusParser.BvashrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvashr}.
	 * @param ctx the parse tree
	 */
	void exitBvashr(SygusParser.BvashrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void enterBitwise(SygusParser.BitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void exitBitwise(SygusParser.BitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvor}.
	 * @param ctx the parse tree
	 */
	void enterBvor(SygusParser.BvorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvor}.
	 * @param ctx the parse tree
	 */
	void exitBvor(SygusParser.BvorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvand}.
	 * @param ctx the parse tree
	 */
	void enterBvand(SygusParser.BvandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvand}.
	 * @param ctx the parse tree
	 */
	void exitBvand(SygusParser.BvandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvnot}.
	 * @param ctx the parse tree
	 */
	void enterBvnot(SygusParser.BvnotContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvnot}.
	 * @param ctx the parse tree
	 */
	void exitBvnot(SygusParser.BvnotContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvnand}.
	 * @param ctx the parse tree
	 */
	void enterBvnand(SygusParser.BvnandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvnand}.
	 * @param ctx the parse tree
	 */
	void exitBvnand(SygusParser.BvnandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvxor}.
	 * @param ctx the parse tree
	 */
	void enterBvxor(SygusParser.BvxorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvxor}.
	 * @param ctx the parse tree
	 */
	void exitBvxor(SygusParser.BvxorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvnor}.
	 * @param ctx the parse tree
	 */
	void enterBvnor(SygusParser.BvnorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvnor}.
	 * @param ctx the parse tree
	 */
	void exitBvnor(SygusParser.BvnorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bvxnor}.
	 * @param ctx the parse tree
	 */
	void enterBvxnor(SygusParser.BvxnorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bvxnor}.
	 * @param ctx the parse tree
	 */
	void exitBvxnor(SygusParser.BvxnorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#exists}.
	 * @param ctx the parse tree
	 */
	void enterExists(SygusParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#exists}.
	 * @param ctx the parse tree
	 */
	void exitExists(SygusParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#forall}.
	 * @param ctx the parse tree
	 */
	void enterForall(SygusParser.ForallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#forall}.
	 * @param ctx the parse tree
	 */
	void exitForall(SygusParser.ForallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(SygusParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(SygusParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#identermplusextra}.
	 * @param ctx the parse tree
	 */
	void enterIdentermplusextra(SygusParser.IdentermplusextraContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#identermplusextra}.
	 * @param ctx the parse tree
	 */
	void exitIdentermplusextra(SygusParser.IdentermplusextraContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfterm}.
	 * @param ctx the parse tree
	 */
	void enterBfterm(SygusParser.BftermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfterm}.
	 * @param ctx the parse tree
	 */
	void exitBfterm(SygusParser.BftermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfiteexpr}.
	 * @param ctx the parse tree
	 */
	void enterBfiteexpr(SygusParser.BfiteexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfiteexpr}.
	 * @param ctx the parse tree
	 */
	void exitBfiteexpr(SygusParser.BfiteexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfboolexpr}.
	 * @param ctx the parse tree
	 */
	void enterBfboolexpr(SygusParser.BfboolexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfboolexpr}.
	 * @param ctx the parse tree
	 */
	void exitBfboolexpr(SygusParser.BfboolexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfandexpr}.
	 * @param ctx the parse tree
	 */
	void enterBfandexpr(SygusParser.BfandexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfandexpr}.
	 * @param ctx the parse tree
	 */
	void exitBfandexpr(SygusParser.BfandexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bforexpr}.
	 * @param ctx the parse tree
	 */
	void enterBforexpr(SygusParser.BforexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bforexpr}.
	 * @param ctx the parse tree
	 */
	void exitBforexpr(SygusParser.BforexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfnotexpr}.
	 * @param ctx the parse tree
	 */
	void enterBfnotexpr(SygusParser.BfnotexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfnotexpr}.
	 * @param ctx the parse tree
	 */
	void exitBfnotexpr(SygusParser.BfnotexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfeqexpr}.
	 * @param ctx the parse tree
	 */
	void enterBfeqexpr(SygusParser.BfeqexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfeqexpr}.
	 * @param ctx the parse tree
	 */
	void exitBfeqexpr(SygusParser.BfeqexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfgtexpr}.
	 * @param ctx the parse tree
	 */
	void enterBfgtexpr(SygusParser.BfgtexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfgtexpr}.
	 * @param ctx the parse tree
	 */
	void exitBfgtexpr(SygusParser.BfgtexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfgeexpr}.
	 * @param ctx the parse tree
	 */
	void enterBfgeexpr(SygusParser.BfgeexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfgeexpr}.
	 * @param ctx the parse tree
	 */
	void exitBfgeexpr(SygusParser.BfgeexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfltexpr}.
	 * @param ctx the parse tree
	 */
	void enterBfltexpr(SygusParser.BfltexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfltexpr}.
	 * @param ctx the parse tree
	 */
	void exitBfltexpr(SygusParser.BfltexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfleexpr}.
	 * @param ctx the parse tree
	 */
	void enterBfleexpr(SygusParser.BfleexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfleexpr}.
	 * @param ctx the parse tree
	 */
	void exitBfleexpr(SygusParser.BfleexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bftoexpr}.
	 * @param ctx the parse tree
	 */
	void enterBftoexpr(SygusParser.BftoexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bftoexpr}.
	 * @param ctx the parse tree
	 */
	void exitBftoexpr(SygusParser.BftoexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvuge}.
	 * @param ctx the parse tree
	 */
	void enterBfbvuge(SygusParser.BfbvugeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvuge}.
	 * @param ctx the parse tree
	 */
	void exitBfbvuge(SygusParser.BfbvugeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvugt}.
	 * @param ctx the parse tree
	 */
	void enterBfbvugt(SygusParser.BfbvugtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvugt}.
	 * @param ctx the parse tree
	 */
	void exitBfbvugt(SygusParser.BfbvugtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvule}.
	 * @param ctx the parse tree
	 */
	void enterBfbvule(SygusParser.BfbvuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvule}.
	 * @param ctx the parse tree
	 */
	void exitBfbvule(SygusParser.BfbvuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvult}.
	 * @param ctx the parse tree
	 */
	void enterBfbvult(SygusParser.BfbvultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvult}.
	 * @param ctx the parse tree
	 */
	void exitBfbvult(SygusParser.BfbvultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvslt}.
	 * @param ctx the parse tree
	 */
	void enterBfbvslt(SygusParser.BfbvsltContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvslt}.
	 * @param ctx the parse tree
	 */
	void exitBfbvslt(SygusParser.BfbvsltContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvsge}.
	 * @param ctx the parse tree
	 */
	void enterBfbvsge(SygusParser.BfbvsgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvsge}.
	 * @param ctx the parse tree
	 */
	void exitBfbvsge(SygusParser.BfbvsgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvsgt}.
	 * @param ctx the parse tree
	 */
	void enterBfbvsgt(SygusParser.BfbvsgtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvsgt}.
	 * @param ctx the parse tree
	 */
	void exitBfbvsgt(SygusParser.BfbvsgtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvsle}.
	 * @param ctx the parse tree
	 */
	void enterBfbvsle(SygusParser.BfbvsleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvsle}.
	 * @param ctx the parse tree
	 */
	void exitBfbvsle(SygusParser.BfbvsleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfxor}.
	 * @param ctx the parse tree
	 */
	void enterBfxor(SygusParser.BfxorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfxor}.
	 * @param ctx the parse tree
	 */
	void exitBfxor(SygusParser.BfxorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfintexpr}.
	 * @param ctx the parse tree
	 */
	void enterBfintexpr(SygusParser.BfintexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfintexpr}.
	 * @param ctx the parse tree
	 */
	void exitBfintexpr(SygusParser.BfintexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfaddexpr}.
	 * @param ctx the parse tree
	 */
	void enterBfaddexpr(SygusParser.BfaddexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfaddexpr}.
	 * @param ctx the parse tree
	 */
	void exitBfaddexpr(SygusParser.BfaddexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfminusexpr}.
	 * @param ctx the parse tree
	 */
	void enterBfminusexpr(SygusParser.BfminusexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfminusexpr}.
	 * @param ctx the parse tree
	 */
	void exitBfminusexpr(SygusParser.BfminusexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfnegexpr}.
	 * @param ctx the parse tree
	 */
	void enterBfnegexpr(SygusParser.BfnegexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfnegexpr}.
	 * @param ctx the parse tree
	 */
	void exitBfnegexpr(SygusParser.BfnegexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfmulexpr}.
	 * @param ctx the parse tree
	 */
	void enterBfmulexpr(SygusParser.BfmulexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfmulexpr}.
	 * @param ctx the parse tree
	 */
	void exitBfmulexpr(SygusParser.BfmulexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbitexpr}.
	 * @param ctx the parse tree
	 */
	void enterBfbitexpr(SygusParser.BfbitexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbitexpr}.
	 * @param ctx the parse tree
	 */
	void exitBfbitexpr(SygusParser.BfbitexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbitarith}.
	 * @param ctx the parse tree
	 */
	void enterBfbitarith(SygusParser.BfbitarithContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbitarith}.
	 * @param ctx the parse tree
	 */
	void exitBfbitarith(SygusParser.BfbitarithContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvadd}.
	 * @param ctx the parse tree
	 */
	void enterBfbvadd(SygusParser.BfbvaddContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvadd}.
	 * @param ctx the parse tree
	 */
	void exitBfbvadd(SygusParser.BfbvaddContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvsub}.
	 * @param ctx the parse tree
	 */
	void enterBfbvsub(SygusParser.BfbvsubContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvsub}.
	 * @param ctx the parse tree
	 */
	void exitBfbvsub(SygusParser.BfbvsubContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvneg}.
	 * @param ctx the parse tree
	 */
	void enterBfbvneg(SygusParser.BfbvnegContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvneg}.
	 * @param ctx the parse tree
	 */
	void exitBfbvneg(SygusParser.BfbvnegContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvmul}.
	 * @param ctx the parse tree
	 */
	void enterBfbvmul(SygusParser.BfbvmulContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvmul}.
	 * @param ctx the parse tree
	 */
	void exitBfbvmul(SygusParser.BfbvmulContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvurem}.
	 * @param ctx the parse tree
	 */
	void enterBfbvurem(SygusParser.BfbvuremContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvurem}.
	 * @param ctx the parse tree
	 */
	void exitBfbvurem(SygusParser.BfbvuremContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvudiv}.
	 * @param ctx the parse tree
	 */
	void enterBfbvudiv(SygusParser.BfbvudivContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvudiv}.
	 * @param ctx the parse tree
	 */
	void exitBfbvudiv(SygusParser.BfbvudivContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvsdiv}.
	 * @param ctx the parse tree
	 */
	void enterBfbvsdiv(SygusParser.BfbvsdivContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvsdiv}.
	 * @param ctx the parse tree
	 */
	void exitBfbvsdiv(SygusParser.BfbvsdivContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvsrem}.
	 * @param ctx the parse tree
	 */
	void enterBfbvsrem(SygusParser.BfbvsremContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvsrem}.
	 * @param ctx the parse tree
	 */
	void exitBfbvsrem(SygusParser.BfbvsremContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvsmod}.
	 * @param ctx the parse tree
	 */
	void enterBfbvsmod(SygusParser.BfbvsmodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvsmod}.
	 * @param ctx the parse tree
	 */
	void exitBfbvsmod(SygusParser.BfbvsmodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvshl}.
	 * @param ctx the parse tree
	 */
	void enterBfbvshl(SygusParser.BfbvshlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvshl}.
	 * @param ctx the parse tree
	 */
	void exitBfbvshl(SygusParser.BfbvshlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvlshr}.
	 * @param ctx the parse tree
	 */
	void enterBfbvlshr(SygusParser.BfbvlshrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvlshr}.
	 * @param ctx the parse tree
	 */
	void exitBfbvlshr(SygusParser.BfbvlshrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvashr}.
	 * @param ctx the parse tree
	 */
	void enterBfbvashr(SygusParser.BfbvashrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvashr}.
	 * @param ctx the parse tree
	 */
	void exitBfbvashr(SygusParser.BfbvashrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbitwise}.
	 * @param ctx the parse tree
	 */
	void enterBfbitwise(SygusParser.BfbitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbitwise}.
	 * @param ctx the parse tree
	 */
	void exitBfbitwise(SygusParser.BfbitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvor}.
	 * @param ctx the parse tree
	 */
	void enterBfbvor(SygusParser.BfbvorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvor}.
	 * @param ctx the parse tree
	 */
	void exitBfbvor(SygusParser.BfbvorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvand}.
	 * @param ctx the parse tree
	 */
	void enterBfbvand(SygusParser.BfbvandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvand}.
	 * @param ctx the parse tree
	 */
	void exitBfbvand(SygusParser.BfbvandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvnot}.
	 * @param ctx the parse tree
	 */
	void enterBfbvnot(SygusParser.BfbvnotContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvnot}.
	 * @param ctx the parse tree
	 */
	void exitBfbvnot(SygusParser.BfbvnotContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvnand}.
	 * @param ctx the parse tree
	 */
	void enterBfbvnand(SygusParser.BfbvnandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvnand}.
	 * @param ctx the parse tree
	 */
	void exitBfbvnand(SygusParser.BfbvnandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvxor}.
	 * @param ctx the parse tree
	 */
	void enterBfbvxor(SygusParser.BfbvxorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvxor}.
	 * @param ctx the parse tree
	 */
	void exitBfbvxor(SygusParser.BfbvxorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvnor}.
	 * @param ctx the parse tree
	 */
	void enterBfbvnor(SygusParser.BfbvnorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvnor}.
	 * @param ctx the parse tree
	 */
	void exitBfbvnor(SygusParser.BfbvnorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bfbvxnor}.
	 * @param ctx the parse tree
	 */
	void enterBfbvxnor(SygusParser.BfbvxnorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bfbvxnor}.
	 * @param ctx the parse tree
	 */
	void exitBfbvxnor(SygusParser.BfbvxnorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#idenbftermplus}.
	 * @param ctx the parse tree
	 */
	void enterIdenbftermplus(SygusParser.IdenbftermplusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#idenbftermplus}.
	 * @param ctx the parse tree
	 */
	void exitIdenbftermplus(SygusParser.IdenbftermplusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#idenbftermplusextra}.
	 * @param ctx the parse tree
	 */
	void enterIdenbftermplusextra(SygusParser.IdenbftermplusextraContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#idenbftermplusextra}.
	 * @param ctx the parse tree
	 */
	void exitIdenbftermplusextra(SygusParser.IdenbftermplusextraContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#identermplus}.
	 * @param ctx the parse tree
	 */
	void enterIdentermplus(SygusParser.IdentermplusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#identermplus}.
	 * @param ctx the parse tree
	 */
	void exitIdentermplus(SygusParser.IdentermplusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#sortedvar}.
	 * @param ctx the parse tree
	 */
	void enterSortedvar(SygusParser.SortedvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#sortedvar}.
	 * @param ctx the parse tree
	 */
	void exitSortedvar(SygusParser.SortedvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#varbinding}.
	 * @param ctx the parse tree
	 */
	void enterVarbinding(SygusParser.VarbindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#varbinding}.
	 * @param ctx the parse tree
	 */
	void exitVarbinding(SygusParser.VarbindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeature(SygusParser.FeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeature(SygusParser.FeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(SygusParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(SygusParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#checksynth}.
	 * @param ctx the parse tree
	 */
	void enterChecksynth(SygusParser.ChecksynthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#checksynth}.
	 * @param ctx the parse tree
	 */
	void exitChecksynth(SygusParser.ChecksynthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(SygusParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(SygusParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#declarevar}.
	 * @param ctx the parse tree
	 */
	void enterDeclarevar(SygusParser.DeclarevarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#declarevar}.
	 * @param ctx the parse tree
	 */
	void exitDeclarevar(SygusParser.DeclarevarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#invconstraint}.
	 * @param ctx the parse tree
	 */
	void enterInvconstraint(SygusParser.InvconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#invconstraint}.
	 * @param ctx the parse tree
	 */
	void exitInvconstraint(SygusParser.InvconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#setfeature}.
	 * @param ctx the parse tree
	 */
	void enterSetfeature(SygusParser.SetfeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#setfeature}.
	 * @param ctx the parse tree
	 */
	void exitSetfeature(SygusParser.SetfeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#synthfun}.
	 * @param ctx the parse tree
	 */
	void enterSynthfun(SygusParser.SynthfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#synthfun}.
	 * @param ctx the parse tree
	 */
	void exitSynthfun(SygusParser.SynthfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#synthinv}.
	 * @param ctx the parse tree
	 */
	void enterSynthinv(SygusParser.SynthinvContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#synthinv}.
	 * @param ctx the parse tree
	 */
	void exitSynthinv(SygusParser.SynthinvContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#smtcmd}.
	 * @param ctx the parse tree
	 */
	void enterSmtcmd(SygusParser.SmtcmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#smtcmd}.
	 * @param ctx the parse tree
	 */
	void exitSmtcmd(SygusParser.SmtcmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#declaredatatype}.
	 * @param ctx the parse tree
	 */
	void enterDeclaredatatype(SygusParser.DeclaredatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#declaredatatype}.
	 * @param ctx the parse tree
	 */
	void exitDeclaredatatype(SygusParser.DeclaredatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#declaredatatypes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaredatatypes(SygusParser.DeclaredatatypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#declaredatatypes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaredatatypes(SygusParser.DeclaredatatypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#declaresort}.
	 * @param ctx the parse tree
	 */
	void enterDeclaresort(SygusParser.DeclaresortContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#declaresort}.
	 * @param ctx the parse tree
	 */
	void exitDeclaresort(SygusParser.DeclaresortContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#definefun}.
	 * @param ctx the parse tree
	 */
	void enterDefinefun(SygusParser.DefinefunContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#definefun}.
	 * @param ctx the parse tree
	 */
	void exitDefinefun(SygusParser.DefinefunContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#definesort}.
	 * @param ctx the parse tree
	 */
	void enterDefinesort(SygusParser.DefinesortContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#definesort}.
	 * @param ctx the parse tree
	 */
	void exitDefinesort(SygusParser.DefinesortContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#setinfo}.
	 * @param ctx the parse tree
	 */
	void enterSetinfo(SygusParser.SetinfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#setinfo}.
	 * @param ctx the parse tree
	 */
	void exitSetinfo(SygusParser.SetinfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#setlogic}.
	 * @param ctx the parse tree
	 */
	void enterSetlogic(SygusParser.SetlogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#setlogic}.
	 * @param ctx the parse tree
	 */
	void exitSetlogic(SygusParser.SetlogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#logicsymbol}.
	 * @param ctx the parse tree
	 */
	void enterLogicsymbol(SygusParser.LogicsymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#logicsymbol}.
	 * @param ctx the parse tree
	 */
	void exitLogicsymbol(SygusParser.LogicsymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#setoption}.
	 * @param ctx the parse tree
	 */
	void enterSetoption(SygusParser.SetoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#setoption}.
	 * @param ctx the parse tree
	 */
	void exitSetoption(SygusParser.SetoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#sortdecl}.
	 * @param ctx the parse tree
	 */
	void enterSortdecl(SygusParser.SortdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#sortdecl}.
	 * @param ctx the parse tree
	 */
	void exitSortdecl(SygusParser.SortdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#dtdec}.
	 * @param ctx the parse tree
	 */
	void enterDtdec(SygusParser.DtdecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#dtdec}.
	 * @param ctx the parse tree
	 */
	void exitDtdec(SygusParser.DtdecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#dtconsdec}.
	 * @param ctx the parse tree
	 */
	void enterDtconsdec(SygusParser.DtconsdecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#dtconsdec}.
	 * @param ctx the parse tree
	 */
	void exitDtconsdec(SygusParser.DtconsdecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#grammardef}.
	 * @param ctx the parse tree
	 */
	void enterGrammardef(SygusParser.GrammardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#grammardef}.
	 * @param ctx the parse tree
	 */
	void exitGrammardef(SygusParser.GrammardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#groupedrulelist}.
	 * @param ctx the parse tree
	 */
	void enterGroupedrulelist(SygusParser.GroupedrulelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#groupedrulelist}.
	 * @param ctx the parse tree
	 */
	void exitGroupedrulelist(SygusParser.GroupedrulelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#gterm}.
	 * @param ctx the parse tree
	 */
	void enterGterm(SygusParser.GtermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#gterm}.
	 * @param ctx the parse tree
	 */
	void exitGterm(SygusParser.GtermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(SygusParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(SygusParser.SymbolContext ctx);
}