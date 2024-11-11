package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;




public class ArregloTest {


    @Test
    public void testBuscarMayor(){

        Arreglo cp = new Arreglo();

        int[] array = {5, 9 , 1 , 6};

        int mayor = cp.buscarMayor(array);

        assertEquals(9, mayor);

    }

    @Test
    public void testBuscarMenor(){

        Arreglo ki = new Arreglo();

        int[] arr = {5, - 5 , 1 , 6};

        int menor = ki.buscarMenor(arr);

        assertEquals(-5, menor);

    }

}
