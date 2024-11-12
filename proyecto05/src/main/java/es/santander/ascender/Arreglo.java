package es.santander.ascender;

import java.util.Random;

public class Arreglo {

  // Creo un objeto de la clase random
  private Random aleatorio = new Random();

  public int buscarMayor(int[] arregloNuevo) {
    int mayor = arregloNuevo[0];

    for (int i = 1; i < arregloNuevo.length; i++) {
      if (arregloNuevo[i] > mayor) {
        mayor = arregloNuevo[i];
      }
    }
    return mayor;
  }

  public int buscarMenor(int[] arregloNuevo) {
    int menor = arregloNuevo[0];

    for (int i = 1; i < arregloNuevo.length; i++) {
      if (arregloNuevo[i] < menor) {
        menor = arregloNuevo[i];
      }
    }
    return menor;
  }

  public int[] obtenerNumerosRandom(int valor) {
    int[] arrAleatorio = new int[valor];

    for (int i = 0; i < valor; i++) {
      arrAleatorio[i] = aleatorio.nextInt();
    }

    return arrAleatorio;
  }
}
