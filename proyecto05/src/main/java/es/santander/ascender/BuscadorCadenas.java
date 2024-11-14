package es.santander.ascender;

public class BuscadorCadenas {

    /**
     * Aquí cuento mi vida ...
     * 
     * @param primeraLista La primera lista de la que voy a comprobar repeticiones
     * @param segundaLista La segunda lista de la que voy a comprobar repeticiones
     * @return Un array en el que están las repeticiones
     * @throws Exception Si alguna de las dos listas es nula
     */
    public String[] localizarComunes(String[] primeraLista,
            String[] segundaLista) throws Exception {

        if (primeraLista == null) {
            throw new Exception("La primera lista no puede ser nula");
        }

        if (segundaLista == null) {
            throw new Exception("La segunda lista no puede ser nula");
        }

        int numeroDeCoincidenciasTotales = 0;
        for (int i = 0; i < primeraLista.length; i++) {
            for (int j = 0; j < segundaLista.length; j++) {
                if (primeraLista[i].equals(segundaLista[j])) {
                    numeroDeCoincidenciasTotales++;
                }
            }
        }

        String[] resultado = new String[numeroDeCoincidenciasTotales];

        int cuantosTienePorAhoraResultado = 0;
        for (int i = 0; i < primeraLista.length; i++) {
            for (int j = 0; j < segundaLista.length; j++) {
                if (primeraLista[i].equals(segundaLista[j])) {
                    // Verificar si el elemento ya está en el array resultado
                    boolean yaExiste = false;
                    for (int k = 0; k < cuantosTienePorAhoraResultado; k++) {
                        if (resultado[k].equals(primeraLista[i])) {
                            yaExiste = true;
                            break;
                        }
                    }

                    // Si no existe, agregar al array
                    if (!yaExiste) {
                        resultado[cuantosTienePorAhoraResultado] = primeraLista[i];
                        cuantosTienePorAhoraResultado++;
                    }
                }
            }
        }

        // Redimensionar el array para ajustarse al número de elementos únicos
        // encontrados
        String[] resultadoFinal;

        if (cuantosTienePorAhoraResultado == resultado.length) {
            resultadoFinal = resultado;
             
        } else {
            
          resultadoFinal = new String[cuantosTienePorAhoraResultado];
            System.arraycopy(resultado, 0, resultadoFinal, 0, cuantosTienePorAhoraResultado);

          
        }

        return resultadoFinal;
    }
}