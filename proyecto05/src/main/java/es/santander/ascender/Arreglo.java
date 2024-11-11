package es.santander.ascender;

public class Arreglo {


 

    public int buscarMayor(int [] arregloNuevo){

       int mayor = arregloNuevo[0];

      for(int i = 1; i < arregloNuevo.length; i ++){
        
        
        if(arregloNuevo[i] > mayor){

            mayor = arregloNuevo[i];
        }
      }
        
      return mayor; 
      
       }



      public int buscarMenor( int [] arregloNuevo){

      int menor = arregloNuevo[0];

        for(int i = 1; i < arregloNuevo.length; i ++){

            if(arregloNuevo[i] < menor){

                menor  = arregloNuevo[i];
            }
          }
          return menor;

      }

      

      }





