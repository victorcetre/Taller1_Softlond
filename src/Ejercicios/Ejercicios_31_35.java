import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author VICTOR_CETRE
 */
public class Ejercicios_31_35 {
    
    public static void Ejercicio31 (){          
        System.out.println("Ejericio 31\nOrdenar elementos: Implementa un algoritmo de ordenamiento "
                + "\n(por ejemplo, el algoritmo de burbuja o el de selección) para ordenar un a"
                + "rreglo de enteros de manera ascendente.\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de elementos en el arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];

        System.out.println("Ingresa los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        System.out.println("Arreglo antes de ordenar: " + Arrays.toString(arreglo));

        ordenarPorBurbuja(arreglo);

        System.out.println("Arreglo después de ordenar: " + Arrays.toString(arreglo));

        scanner.close();
    }

    public static void ordenarPorBurbuja(int[] arreglo) {
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
    
    public static void Ejercicio32 (){          
        System.out.println("Ejericio 32\nBuscar un elemento: Escribe un programa que busque "
                + "\nun número específico en un arreglo "
                + "y muestre su índice (o un mensaje si no se encuentra).\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de elementos en el arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];

        System.out.println("Ingresa los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        System.out.print("Ingresa el número que deseas buscar: ");
        int numeroBuscado = scanner.nextInt();

        int indice = -1;
        for (int i = 0; i < n; i++) {
            if (arreglo[i] == numeroBuscado) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            System.out.println("El número " + numeroBuscado + " se encuentra en el índice " + indice);
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el arreglo.");
        }
        scanner.close();
    }
    
    public static void Ejercicio33 (){          
        System.out.println("Ejericio 33\nFrecuencia de elementos: Escribe un programa que cuente "
                + "la frecuencia de cada elemento en un arreglo.\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de elementos en el arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];

        System.out.println("Ingresa los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        int maxElemento = -1;
        for (int elemento : arreglo) {
            if (elemento > maxElemento) {
                maxElemento = elemento;
            }
        }

        int[] frecuencia = new int[maxElemento + 1];

        for (int elemento : arreglo) {
            frecuencia[elemento]++;
        }

        System.out.println("Frecuencia de elementos:");
        for (int i = 0; i <= maxElemento; i++) {
            if (frecuencia[i] > 0) {
                System.out.println(i + ": " + frecuencia[i] + " veces");
            }
        }

        scanner.close();
    }
    
    public static void Ejercicio34 (){          
        System.out.println("Ejericio 34\nRotación de elementos: Implementa un programa que rote "
                + "los elementos de un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones.\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de elementos en el arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];

        System.out.println("Ingresa los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        System.out.print("Ingresa la cantidad de posiciones a rotar hacia la izquierda: ");
        int k = scanner.nextInt();

        int[] copiaTemporal = Arrays.copyOf(arreglo, n);

        for (int i = 0; i < n; i++) {
            arreglo[i] = copiaTemporal[(i + k) % n];
        }

        System.out.println("Arreglo después de la rotación hacia la izquierda: " + Arrays.toString(arreglo));

        scanner.close();
    }
    
    public static void Ejercicio35 (){          
        System.out.println("Ejericio 35\nTabla de multiplicar: Crea un programa que imprima las tablas de multiplicar del 1 al 10. "
                + "Usa para esto una matriz\n");
        
        int[][] tablas = new int[10][10];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = (i + 1) * (j + 1);
            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Tabla de multiplicar del " + (i + 1) + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println((i + 1) + " x " + (j + 1) + " = " + tablas[i][j]);
            }
            System.out.println();
        }
    }
}
