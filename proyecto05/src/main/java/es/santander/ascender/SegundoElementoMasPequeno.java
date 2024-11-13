package es.santander.ascender;

public class SegundoElementoMasPequeno {

    public int encontrarSegundoMasPequeno(int[] arreglo) throws Exception {
        if (arreglo == null) {
            throw new Exception("El arreglo no puede estar vacío");
        }

        if (arreglo.length < 2) {
            throw new Exception("El arreglo debe tener al menos dos elementos");
        }

        int menor = Integer.MAX_VALUE;
        int segundoMenor = Integer.MAX_VALUE;
      //  boolean todosIguales = true; // para ver si son todos los elementos iguales

        for (int i = 0; i < arreglo.length ; i++) {
            if (arreglo[i] < menor) {
                segundoMenor = menor;
                menor = arreglo[i];
               // todosIguales = false;
            } else if (arreglo[i] != menor && arreglo[i] < segundoMenor) {
                segundoMenor = arreglo[i];
               // todosIguales = false;
            }
        }
       /*   if (todosIguales) {
            throw new Exception("No existe un segundo elemento más pequeño. Son Todos iguales");
        }*/
        if (segundoMenor == Integer.MAX_VALUE) {
            throw new Exception("No existe un segundo elemento más pequeño. Son todos iguales");
        }

        return segundoMenor;
    }

}
