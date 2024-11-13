package es.santander.ascender;

public class BuscadorCadenas {


    /**
     * Aquí cuento mi vida ...
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
                if ( primeraLista[i].equals(segundaLista[j]) ) {
                    numeroDeCoincidenciasTotales++;
                }
            }
        }

        String[] resultado = new String[numeroDeCoincidenciasTotales];

        int cuentosRepetidosPorAhora = 0;
        for (int i = 0; i < primeraLista.length; i++) {
            for (int j = 0; j < segundaLista.length; j++) {
                if ( primeraLista[i].equals(segundaLista[j]) ) {
                    resultado[cuentosRepetidosPorAhora] = primeraLista[i];
                    cuentosRepetidosPorAhora++;
                }
            }
        }
        return resultado;
    }
}
