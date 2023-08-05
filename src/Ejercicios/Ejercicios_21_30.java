import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author VICTOR_CETRE
 */
public class Ejercicios_21_30 {
    
    public static void Ejercicio21 (){          
        System.out.println("Ejericio 21\nPide al usuario una cadena y muestra cuántas veces aparece una letra específica en ella\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        System.out.print("Ingrese la letra que desea contar: ");
        char letra = scanner.next().charAt(0);

        int contador = contarLetra(cadena, letra);

        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la cadena.");
        scanner.close();
    }

    public static int contarLetra(String cadena, char letra) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }
    
    public static void Ejercicio22 (){          
        System.out.println("Ejericio 22\nEscribe un programa que solicite al usuario una frase "
                + "y verifique si es un palíndromo\n(se lee igual de izquierda a "
                + "derecha que de derecha a izquierda).\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        if (esPalindromo(frase)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }

        scanner.close();
    }

    public static boolean esPalindromo(String frase) {
        String fraseSinEspacios = frase.replaceAll("\\s+", "").toLowerCase();
        int longitud = fraseSinEspacios.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (fraseSinEspacios.charAt(i) != fraseSinEspacios.charAt(longitud - 1 - i)) {
                return false;
            }
        }

        return true;
    }
    
    public static void Ejercicio23 (){          
        System.out.println("Ejericio 23\nCrea un programa que pida al usuario una oración "
                + "y muestre cuántas palabras contiene\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una oración: ");
        String oracion = scanner.nextLine();

        int contadorPalabras = 0;
        boolean palabra = false;

        for (int i = 0; i < oracion.length(); i++) {
            char caracter = oracion.charAt(i);
            if (Character.isLetterOrDigit(caracter)) {
                palabra = true;
            } else if (palabra) {
                contadorPalabras++;
                palabra = false;
            }
        }

        if (palabra) {
            contadorPalabras++;
        }
        System.out.println("La oración contiene " + contadorPalabras + " palabras.");
        scanner.close();
    }
    
    public static void Ejercicio24 (){          
        System.out.println("Ejericio 24\nRealiza un programa que solicite al usuario una cadena "
                + "y reemplace todas las apariciones de una letra específica por otra\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        System.out.print("Ingrese la letra a reemplazar: ");
        char letraAntigua = scanner.next().charAt(0);

        System.out.print("Ingrese la nueva letra: ");
        char letraNueva = scanner.next().charAt(0);

        String cadenaModificada = cadena.replace( letraAntigua, letraNueva);
        
        System.out.println("Cadena modificada: " + cadenaModificada);
        scanner.close();
    }
    
    public static void Ejercicio25 (){          
        System.out.println("Ejericio 25\nPide al usuario una frase y muestra cada palabra por separado\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        String[] palabras = frase.split(" ");

        System.out.println("Palabras en la frase:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        scanner.close();
    }
    
    public static void Ejercicio26 (){          
        System.out.println("Ejericio 26\nEscribe un programa que pida al usuario una cadena "
                + "y muestre cuántos caracteres tiene sin contar los espacios en blanco\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                contador++;
            }
        }

        System.out.println("La cadena tiene " + contador + " caracteres sin contar los espacios.");
        scanner.close();
    }
    
    public static void Ejercicio27 (){          
        System.out.println("Ejericio 27\nCrea un programa que solicite al usuario una frase "
                + "y luego muestre las palabras ordenadas alfabéticamente\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        String[] palabrasArray = frase.split(" ");
        
        List<String> palabrasLista = new ArrayList<>(Arrays.asList(palabrasArray));
        
        Collections.sort(palabrasLista);

        System.out.println("Palabras ordenadas alfabéticamente:");
        for (String palabra : palabrasLista) {
            System.out.println(palabra);
        }
        scanner.close();
    }
    
    public static void Ejercicio28 (){          
        System.out.println("Ejericio 28\nSuma de elementos: Escribe un programa que calcule "
                + "la suma de todos los elementos en un arreglo de enteros.\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de elementos en el arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];
        
        System.out.println("Ingresa los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }
        
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += arreglo[i];
        }

        System.out.println("La suma de los elementos en el arreglo es: " + suma);
        scanner.close();
    }
    
    public static void Ejercicio29 (){          
        System.out.println("Ejericio 29\nEncontrar el número más grande: Crea un programa que encuentre "
                + "el número más grande en un arreglo de enteros.\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de elementos en el arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];
        
        System.out.println("Ingresa los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }
        
        int maximo = Arrays.stream(arreglo).max().getAsInt();

        System.out.println("El número más grande en el arreglo es: " + maximo);
        scanner.close();
    }
    
    public static void Ejercicio30 (){          
        System.out.println("Ejericio 30\nEliminar duplicados: Diseña un programa que elimine los elementos duplicados de un arreglo.\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de elementos en el arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];
        
        System.out.println("Ingresa los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }
        
        HashSet<Integer> conjuntoSinDuplicados = new HashSet<>();
        for (int elemento : arreglo) {
            conjuntoSinDuplicados.add(elemento);
        }
        ArrayList<Integer> arregloSinDuplicados = new ArrayList<>(conjuntoSinDuplicados);

        System.out.println("Arreglo sin elementos duplicados: " + arregloSinDuplicados);
        scanner.close();
    }
}
