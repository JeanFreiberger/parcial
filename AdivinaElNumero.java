import java.util.Scanner;

public class AdivinaElNumero {
    private Scanner entrada = new Scanner(System.in);
    private boolean juegoActivo = true;

    public void jugar () {
        String nombreJugador = obtenermetodojugador();

        while (juegoActivo) {
            int min = 0;
            int max = 100;
            int numeroJuego = obtenernumeroaleatorio(1, 100);

            System.out.println(numeroJuego);
            System.out.printf("%s, he escogido un numero %d y %d, adivinalo\n", nombreJugador, min, max);
            int numeroJugador;

            do {
                System.out.println("escoge un numero");
                numeroJugador = entrada.nextInt();
                if (numeroJuego < numeroJugador) {
                    System.out.println("muy alto, adivina otra vez");
                } else if (numeroJuego > numeroJugador) {
                    System.out.println("muy bajo, adivina otra vez");
                }
                    intentos++;
            } while (numeroJuego != numeroJugador);

            System.out.println("has ganado, intentos %d", intentos);


                juegoActivo = false;
        }

    }
    private int  obtenernumeroaleatorio (int min, int max){
        return min + (int) (Math.random() + ((max - min) + 1));

    }
    private String obtenermetodojugador() {
        System.out.println("hola, cual es tu nombre?");
        String nombreJugador = entrada.nextLine();
        System.out.printf("bienvenido %s, vamos a comenzar\n", nombreJugador);
        return nombreJugador;
         }




    }

}

