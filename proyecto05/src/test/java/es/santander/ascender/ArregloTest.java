package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ArregloTest {

    private static final int TAMANNO = 5;

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

    @Test 
    public void testObtenerNumeroRandom(){
        Arreglo al = new Arreglo();

        int[] lista = al.obtenerNumerosRandom(TAMANNO);

        assertNotNull(lista, "Espera que la lista de aleatorios no fuera nula");
        assertEquals(TAMANNO, lista.length, 
            String.format("La lista debía tener tamaño %d y ninguno de los valores %f", TAMANNO, 37.4));
        // "La lista debía tener tamaño " + TAMANO + " y ninguno de los valores " + 37.4
        for( int elemento : lista){
            System.out.println(elemento + "");
        }     
    }

    @Test
    public void testEliminarNumero() {
        Arreglo arreglo = new Arreglo();
        int[] origen = new int[] {5, 6, 12, -5};
        int valorABuscar = 6;

        int[] destino = arreglo.eliminarNumero(origen, valorABuscar);

        assertArrayEquals(new int[]{5, 12, -5}, destino);
    }


    @Test
    public void imprimirArrayBidimensionalYJuegoConCodigos() {
        int[][] b = new int[10][];
        char[][] a = new char[10][10];    
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                a[i][j] = '-';
            }
        }

        // Use nested loops to iterate over each row and column of the array.
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                // Print each element of the array, ensuring a minimum width of 2 characters.
                System.out.printf(" %c ", a[i][j]);
            }
            // Move to the next line to represent a new row in the output.
            System.out.println();
        }
        int[] valores = new int[] {5, 6, 12, -5};

        int valorABuscar = 6;

        boolean encontrado = false;
        for (int i = 0 ; i < valores.length; i++) {
            if (valorABuscar == valores[i]) {
                encontrado = true;
                break;
            }
        }

    }
} 
