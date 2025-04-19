// Generated from Sygus.g4 by ANTLR 4.5.3
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SygusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SygusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SygusParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SygusParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SygusParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#negativeNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeNumber(SygusParser.NegativeNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#numeral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeral(SygusParser.NumeralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(SygusParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#boolconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolconst(SygusParser.BoolconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#hexconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexconst(SygusParser.HexconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#binconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinconst(SygusParser.BinconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#stringconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringconst(SygusParser.StringconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SygusParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#identifierextra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierextra(SygusParser.IdentifierextraContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(SygusParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#sort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort(SygusParser.SortContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#sortextra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortextra(SygusParser.SortextraContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SygusParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#iteexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteexpr(SygusParser.IteexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr(SygusParser.BoolexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#andexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndexpr(SygusParser.AndexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#orexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrexpr(SygusParser.OrexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#notexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotexpr(SygusParser.NotexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#eqexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqexpr(SygusParser.EqexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#gtexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtexpr(SygusParser.GtexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#geexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeexpr(SygusParser.GeexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#ltexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtexpr(SygusParser.LtexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#leexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeexpr(SygusParser.LeexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#toexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToexpr(SygusParser.ToexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvuge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvuge(SygusParser.BvugeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvugt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvugt(SygusParser.BvugtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvule(SygusParser.BvuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvult(SygusParser.BvultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvslt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvslt(SygusParser.BvsltContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvsge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvsge(SygusParser.BvsgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvsgt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvsgt(SygusParser.BvsgtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvsle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvsle(SygusParser.BvsleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#xor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor(SygusParser.XorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#intexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntexpr(SygusParser.IntexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#addexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddexpr(SygusParser.AddexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#minusexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusexpr(SygusParser.MinusexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#negexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegexpr(SygusParser.NegexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#mulexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulexpr(SygusParser.MulexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bitexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitexpr(SygusParser.BitexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bitarith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitarith(SygusParser.BitarithContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvadd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvadd(SygusParser.BvaddContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvsub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvsub(SygusParser.BvsubContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvneg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvneg(SygusParser.BvnegContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvmul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvmul(SygusParser.BvmulContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvurem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvurem(SygusParser.BvuremContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvudiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvudiv(SygusParser.BvudivContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvsdiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvsdiv(SygusParser.BvsdivContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvsrem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvsrem(SygusParser.BvsremContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvsmod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvsmod(SygusParser.BvsmodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvshl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvshl(SygusParser.BvshlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvlshr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvlshr(SygusParser.BvlshrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvashr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvashr(SygusParser.BvashrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwise(SygusParser.BitwiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvor(SygusParser.BvorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvand(SygusParser.BvandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvnot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvnot(SygusParser.BvnotContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvnand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvnand(SygusParser.BvnandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvxor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvxor(SygusParser.BvxorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvnor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvnor(SygusParser.BvnorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bvxnor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBvxnor(SygusParser.BvxnorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#exists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(SygusParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#forall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForall(SygusParser.ForallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(SygusParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#identermplusextra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentermplusextra(SygusParser.IdentermplusextraContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfterm(SygusParser.BftermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfiteexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfiteexpr(SygusParser.BfiteexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfboolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfboolexpr(SygusParser.BfboolexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfandexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfandexpr(SygusParser.BfandexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bforexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBforexpr(SygusParser.BforexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfnotexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfnotexpr(SygusParser.BfnotexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfeqexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfeqexpr(SygusParser.BfeqexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfgtexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfgtexpr(SygusParser.BfgtexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfgeexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfgeexpr(SygusParser.BfgeexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfltexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfltexpr(SygusParser.BfltexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfleexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfleexpr(SygusParser.BfleexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bftoexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBftoexpr(SygusParser.BftoexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvuge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvuge(SygusParser.BfbvugeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvugt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvugt(SygusParser.BfbvugtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvule(SygusParser.BfbvuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvult(SygusParser.BfbvultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvslt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvslt(SygusParser.BfbvsltContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvsge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvsge(SygusParser.BfbvsgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvsgt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvsgt(SygusParser.BfbvsgtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvsle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvsle(SygusParser.BfbvsleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfxor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfxor(SygusParser.BfxorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfintexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfintexpr(SygusParser.BfintexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfaddexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfaddexpr(SygusParser.BfaddexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfminusexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfminusexpr(SygusParser.BfminusexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfnegexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfnegexpr(SygusParser.BfnegexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfmulexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfmulexpr(SygusParser.BfmulexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbitexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbitexpr(SygusParser.BfbitexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbitarith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbitarith(SygusParser.BfbitarithContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvadd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvadd(SygusParser.BfbvaddContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvsub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvsub(SygusParser.BfbvsubContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvneg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvneg(SygusParser.BfbvnegContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvmul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvmul(SygusParser.BfbvmulContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvurem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvurem(SygusParser.BfbvuremContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvudiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvudiv(SygusParser.BfbvudivContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvsdiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvsdiv(SygusParser.BfbvsdivContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvsrem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvsrem(SygusParser.BfbvsremContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvsmod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvsmod(SygusParser.BfbvsmodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvshl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvshl(SygusParser.BfbvshlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvlshr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvlshr(SygusParser.BfbvlshrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvashr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvashr(SygusParser.BfbvashrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbitwise(SygusParser.BfbitwiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvor(SygusParser.BfbvorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvand(SygusParser.BfbvandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvnot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvnot(SygusParser.BfbvnotContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvnand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvnand(SygusParser.BfbvnandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvxor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvxor(SygusParser.BfbvxorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvnor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvnor(SygusParser.BfbvnorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bfbvxnor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfbvxnor(SygusParser.BfbvxnorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#idenbftermplus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdenbftermplus(SygusParser.IdenbftermplusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#idenbftermplusextra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdenbftermplusextra(SygusParser.IdenbftermplusextraContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#identermplus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentermplus(SygusParser.IdentermplusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#sortedvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortedvar(SygusParser.SortedvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#varbinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarbinding(SygusParser.VarbindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature(SygusParser.FeatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(SygusParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#checksynth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecksynth(SygusParser.ChecksynthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(SygusParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#declarevar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarevar(SygusParser.DeclarevarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#invconstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvconstraint(SygusParser.InvconstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#setfeature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetfeature(SygusParser.SetfeatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#synthfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthfun(SygusParser.SynthfunContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#synthinv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthinv(SygusParser.SynthinvContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#smtcmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmtcmd(SygusParser.SmtcmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#declaredatatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaredatatype(SygusParser.DeclaredatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#declaredatatypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaredatatypes(SygusParser.DeclaredatatypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#declaresort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaresort(SygusParser.DeclaresortContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#definefun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinefun(SygusParser.DefinefunContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#definesort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinesort(SygusParser.DefinesortContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#setinfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetinfo(SygusParser.SetinfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#setlogic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetlogic(SygusParser.SetlogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#logicsymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicsymbol(SygusParser.LogicsymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#setoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetoption(SygusParser.SetoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#sortdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortdecl(SygusParser.SortdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#dtdec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtdec(SygusParser.DtdecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#dtconsdec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtconsdec(SygusParser.DtconsdecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#grammardef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammardef(SygusParser.GrammardefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#groupedrulelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupedrulelist(SygusParser.GroupedrulelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#gterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGterm(SygusParser.GtermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(SygusParser.SymbolContext ctx);
}