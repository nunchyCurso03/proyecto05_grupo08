package es.santander.ascender;

public class BuscadorCadenas {
    public String[] localizarComunes(String[] primeraLista, 
    String[] segundaLista) {
        
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
