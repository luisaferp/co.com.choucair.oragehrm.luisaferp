package co.com.choucair.orangehrm.luisaferp.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MetodosUtilitarios {

    public static String rutaArchivo() {
        String nombreArchivo = "PruebaChoucair.txt";
        String directorioActual = System.getProperty("user.dir");
        Path rutaRelativa = Paths.get(directorioActual, nombreArchivo);
        String rutaCompleta = rutaRelativa.toString();
        return rutaCompleta;
    }
}
