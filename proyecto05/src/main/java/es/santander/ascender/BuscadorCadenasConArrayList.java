package es.santander.ascender;

import java.util.ArrayList;

public class BuscadorCadenasConArrayList {

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

        ArrayList resultados = new ArrayList();
        
        //por cada ciclo carga un objeto en la lista
        for(String objetosDeLaPrimeraLista: primeraLista){
            for(String objetosDeLaSegundaLista: segundaLista){
                if(objetosDeLaPrimeraLista.equals(objetosDeLaSegundaLista)){
                    
                    //Solo copio si aún no está en los resultados
                    if(!resultados.contains(objetosDeLaSegundaLista)){
                    resultados.add(objetosDeLaPrimeraLista);

                }
                }
            }

        }

        String[] resultadosArray = new String[resultados.size()];
        int i = 0;
        for (Object cadena :resultados){
            resultadosArray [i] = (String) cadena;
            i++;
        }
        return resultadosArray;
    }
}
