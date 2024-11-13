package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class SegundoElementoMasPequenoTest {

    private SegundoElementoMasPequeno cut = new SegundoElementoMasPequeno();

    @Test
    public void testEncontrarSegundoMasPequeno() throws Exception {

        // prueba con enteros positivos y negativos
        int[] arreglo = { 8, 2, 6, 4, 10, 3, 7, 255, 217, 315, -1002 };

        assertEquals(2, cut.encontrarSegundoMasPequeno(arreglo));

        // prueba con arreglo nulo
        int[] arregloNulo = null;

        assertThrows(Exception.class, () -> cut.encontrarSegundoMasPequeno(arregloNulo));

        //prueba con todos los elementos iguales
        int[] arregloIguales = {7, 7, 7, 7};

        assertThrows(Exception.class, () -> cut.encontrarSegundoMasPequeno(arregloIguales));

        //Prueba con un solo elemento
        int[] arregloUnElemento = {8};
        assertThrows(Exception.class, () ->  
            cut.encontrarSegundoMasPequeno(arregloUnElemento));

    }

}
