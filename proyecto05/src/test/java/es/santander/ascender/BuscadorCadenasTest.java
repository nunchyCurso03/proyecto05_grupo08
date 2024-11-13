package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class BuscadorCadenasTest {

    @Test
    public void testLocalizarComunes() {
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
}
