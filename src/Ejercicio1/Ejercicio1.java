/*
 * Crea una clase en Java donde declares una variable de tipo array de Strings que
 * contenga los doce meses del año, en minúsculas. A continuación, declara una variable
 * mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
 * mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
 * Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
 * adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
 * Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
 * No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
 * ¡Ha acertado!
 */
package Ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int numMesSecreto = elegirMesSecreto();
        String mesSecreto = meses[numMesSecreto];

//        System.out.println(mesSecreto);

        System.out.println("Ingrese el mes que cree que es el mes Secreto:");
        boolean adivinado = false;
        do {
            String mesUsuario = leer.nextLine();
            if (mesUsuario.equalsIgnoreCase(meses[numMesSecreto])) {
                System.out.println("¡Ha acertado!");
                adivinado = true;
            }else{
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            }


        } while (adivinado == false);

    }
    public static int elegirMesSecreto() {
        Random random = new Random();
        int mes = random.nextInt(11) + 1;
        return mes;
    }
}
