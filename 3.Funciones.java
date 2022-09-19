// Enunciado del ejercicio:
// Primera parte:
// Crear una función con tres parámetros que sean números que se suman entre sí.
// Llamar a la función en el main y darle valores.
// Segunda parte:
// Crear una clase coche.
// Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
// Una función que incremente el número de puertas que tiene el coche.
// Crear un objeto miCoche en el main y añadirle una puerta.
// Mostrar el número de puertas que tiene el objeto.

// 1) Primera parte:

func suma(a, b, c) {
    return a + b + c
} 
func main() {
    suma(10, 20, 30)
}

// 2) Segunda parte:

Class Coche {
    public int puertas = 0;
    public IncrementarPuertas() {
        this.puertas++;
    }
}
public static void main(String[] args) {
Coche miCoche = new Coche();
    miCoche.this.puertas++
    return miCoche.this.puertas
}

// Solución OpenBootcamp:

package com.company;

public class Main {

    public static void main(String[] args) {
        suma(20, 40, 60);

        Coche miCoche = new Coche();

        miCoche.sumarPuertas();
        miCoche.sumarPuertas();
        System.out.println("El numero de puertas es: " + miCoche.numeroDePuertas);

    }

    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}

class Coche {
    public int numeroDePuertas = 4;

    public void sumarPuertas(){

        this.numeroDePuertas++;
    }
}