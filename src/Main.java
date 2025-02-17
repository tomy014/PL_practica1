import java.io.*;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();

        // Cabecera fichero HTML
        output.append("<!DOCTYPE html>\n <html> \n<head> \n<title>Twitter format</title> \n<style> \n");
        output.append(".usr {color:rgb(19,189,72);} \n.link {color:rgb(55,40,244);} \n.hashtag {color:rgb(107,103,189);} \n");
        output.append(".auth-title {color:rgb(0,0,0);font-weight:bold;} \n.auth-usr {color:rgb(147,145,147);}  \n.sobrante {color:rgb(255,0,0);} \n</style> \n</head> \n<body> \n<p>\n");

        // Texto a analizar
        try {
            CharStream input = CharStreams.fromFileName("src/texto.txt");
            GarciaGuerraLexer analex = new GarciaGuerraLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(analex);
            GarciaGuerraParser anasint = new GarciaGuerraParser(tokens);
            anasint.texto();

            int charCount = 0;

            for (Token token : tokens.getTokens()) {
                String tokenText = token.getText();
                if (charCount + tokenText.length() > 140) {
                    output.append("<span class='sobrante'>").append(tokenText);
                } else {
                    if (token.getType() == GarciaGuerraLexer.HASHTAG) {
                        output.append("<span class='hashtag'>").append(tokenText).append("</span> ");
                    } else if (token.getType() == GarciaGuerraLexer.USR) {
                        output.append("<span class='usr'>").append(tokenText).append("</span> ");
                    } else if (token.getType() == GarciaGuerraLexer.LINK) {
                        output.append("<span class='link'>").append(tokenText).append("</span> ");
                    } else {
                        output.append(tokenText).append(" ");
                    }
                    charCount += tokenText.length();
                }
                output.append("</span> ");
            }
        } catch (org.antlr.v4.runtime.RecognitionException e) {
            output.append("<p>Error de reconocimiento: " + e.getMessage() + "</p>");
        } catch (IOException e) {
            output.append("<p>Error de entrada/salida: " + e.getMessage() + "</p>");
        } catch (java.lang.RuntimeException e) {
            output.append("<p>Error en tiempo de ejecución: " + e.getMessage() + "</p>");
        }

        // Final fichero HTML
        output.append("</p>\n</body> </html>");

        // Guardar en archivo salida.html
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("salida.html"))) {
            writer.write(output.toString());
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
