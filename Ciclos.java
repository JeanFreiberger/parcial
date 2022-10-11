import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("cuantos numeros quieres procesar?");
        int cantidad = entrada.nextInt();

        System.out.printf("ingresa %d datos\n", cantidad);
        for (int i = 1; i <= cantidad; i++) {
            System.out.printf("Dato %d: ", i);
            int num = entrada.nextInt();
            int resultado = num * 2;
            System.out.printf("Dato %d procesados: %d\n" , i, resultado);


            int c = 1;
            while (c <= cantidad){
                System.out.printf("Dato %d: ", c);
                num = entrada.nextInt();
                resultado = num * 2;
                System.out.printf("Dato %d procesados: %d\n" , c, resultado);
                c++;

            }


        }

    }
}
