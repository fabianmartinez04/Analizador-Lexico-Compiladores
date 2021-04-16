/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;
import Estructuras.TablaSimbolos;
import Estructuras.Token;
import java.io.File;

/**
 *
 * @author Fabian Martinez
 */
public class Principal {
    public static void main(String[] args) {
        String ruta = "C/Users/liset/OneDrive/Documentos/Ingeniería en Computación/Computación V Semestre/Compiladores e intérpretes/Proyectos/Scanner/AnalizadorLexico/src/codigo/Lexer.flex";
        generarLexer(ruta);
  
       
    }
    
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
