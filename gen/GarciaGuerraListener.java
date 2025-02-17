// Generated from C:/Users/Alberto/OneDrive - Universidad Rey Juan Carlos/Documentos/Universidad - Sexto Curso/Segundo semestre/Procesadores de Lenguajes/Práctica1 complementaria/GarciaGuerra/src/GarciaGuerra.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GarciaGuerraParser}.
 */
public interface GarciaGuerraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GarciaGuerraParser#texto}.
	 * @param ctx the parse tree
	 */
	void enterTexto(GarciaGuerraParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GarciaGuerraParser#texto}.
	 * @param ctx the parse tree
	 */
	void exitTexto(GarciaGuerraParser.TextoContext ctx);
}