package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class BuscadorCadenasTest {

    @Test
    public void testLocalizarComunes() throws Exception {
        BuscadorCadenas cutBuscadorCadenas = new BuscadorCadenas();
        String[] primeraLista = new String[] {
            "Hola", "Adios", "Mitad"
        };

        String[] segundaLista = new String[] {
            "Adios", "Otra", "Hola"
        };


        String[] duplicados = cutBuscadorCadenas.localizarComunes(primeraLista, segundaLista);

        assertArrayEquals(new String[]{"Hola", "Adios"}, duplicados);
    }


    @Test
    public void testLocalizarComunes_ConCadenaVacia() throws Exception {
        BuscadorCadenas cutBuscadorCadenas = new BuscadorCadenas();
        String[] primeraLista = new String[] {
            "Hola", "Adios", "Mitad"
        };

        String[] segundaLista = new String[] {
           
        };


        String[] duplicados = cutBuscadorCadenas.localizarComunes(primeraLista, segundaLista);

        assertArrayEquals(new String[0], duplicados);
    }    

    @Test
    public void testLocalizarComunes_ConCadenaNulo() {
        BuscadorCadenas cutBuscadorCadenas = new BuscadorCadenas();
        String[] primeraLista = new String[] {
            "Hola", "Adios", "Mitad"
        };

        String[] segundaLista = null;

        assertThrows(Exception.class, 
            () -> cutBuscadorCadenas.localizarComunes(primeraLista, segundaLista));
    }    

    @Test
    public void testLocalizarComunes_ListasTamanosDiferentes() throws Exception {
        BuscadorCadenas cutBuscadorCadenas = new BuscadorCadenas();
        String[] primeraLista = new String[] {
            "Hola", "Adios", "Mitad"
        };

        String[] segundaLista = new String[] {
            "Adios", "Otra", "Hola", "Otro"
        };

        String[] duplicados = cutBuscadorCadenas.localizarComunes(primeraLista, segundaLista);

        assertArrayEquals(new String[]{"Hola", "Adios"}, duplicados);
    }

    //@Disabled
    @Test
    public void testLocalizarComunes_ListasConValoresRepetidosEnUnaLista() throws Exception {
        BuscadorCadenas cutBuscadorCadenas = new BuscadorCadenas();
        String[] primeraLista = new String[] {
            "Hola", "Adios", "Mitad"
        };

        String[] segundaLista = new String[] {
            "Adios", "Otra", "Hola", "Hola"
        };

        String[] duplicados = cutBuscadorCadenas.localizarComunes(primeraLista, segundaLista);

        assertArrayEquals(new String[]{"Hola",  "Adios"}, duplicados);
    }

}
