import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author VICTOR_CETRE
 */
public class Ejercicios_11_20 {
    
    public static void Ejercicio11 (){          
        System.out.println("Ejericio 11\nEscribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón. "
            + "El usuario debe ingresar las longitudes de los tres lados.\n");
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del primer lado:");
        double a = scanner.nextDouble();

        System.out.println("Ingrese la longitud del segundo lado:");
        double b = scanner.nextDouble();

        System.out.println("Ingrese la longitud del tercer lado:");
        double c = scanner.nextDouble();

        double s = (a + b + c) / 2; // Semiperímetro
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("El área del triángulo es: " + area);
        scanner.close();
    }
    
    public static void Ejercicio12 (){          
        System.out.println("Ejericio 12\nRealiza un programa que pida al usuario un número entero "
            + "y determine si es un número primo o no\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int num = scanner.nextInt();

        if (esPrimo(num)) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " no es un número primo.");
        }

        scanner.close();
    }
    
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void Ejercicio13 (){           
        System.out.println("Ejericio 13\nPide al usuario un número decimal "
            + "y muestra su valor redondeado a un número específico de decimales\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        double num = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de decimales para redondear: ");
        int numDecimales = scanner.nextInt();

        DecimalFormat decimalFormat = new DecimalFormat("0." + "0".repeat(numDecimales));
        String numeroRedondeado = decimalFormat.format(num);

        System.out.println("El número redondeado a " + numDecimales + " decimales es: " + numeroRedondeado);

        scanner.close();
    }
    
    public static void Ejercicio14 (){           
        System.out.println("Ejericio 14\nEscribe un programa que solicite al usuario un número entero positivo "
            + "y verifique si es un número perfecto.\nUn número perfecto es aquel cuya suma "
            + "de sus divisores propios (excluyendo al propio número) es igual al número.\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int num = scanner.nextInt();

        if (esPerfecto(num)) {
            System.out.println(num + " es un número perfecto.");
        } else {
            System.out.println(num + " no es un número perfecto.");
        }

        scanner.close();
    }

    public static boolean esPerfecto(int num) {
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
    
    public static void Ejercicio15 (){           
        System.out.println("Ejericio 15\nCrea un programa que pida al usuario un número entero "
            + "y determine si es un número capicúa. Un número capicúa es aquel que se lee igual "
            + "de izquierda a derecha que de derecha a izquierda.\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (esCapicua(numero)) {
            System.out.println(numero + " es un número capicúa.");
        } else {
            System.out.println(numero + " no es un número capicúa.");
        }
        scanner.close();
    }

    public static boolean esCapicua(int numero) {        
        String numeroStr = Integer.toString(numero);
        int izquierda = 0;
        int derecha = numeroStr.length() - 1;

        while (izquierda < derecha) {
            if (numeroStr.charAt(izquierda) != numeroStr.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
    
    public static void Ejercicio16 (){           
        System.out.println("Ejericio 16\nRealiza un programa que calcule e imprima la serie de Fibonacci "
            + "hasta un número dado ingresado por el usuario.\n");
        
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para límite de la serie de Fibonacci: ");
        int limite = scanner.nextInt();

        int num1 = 0, num2 = 1;
        for (int i = num1; num1 <= limite; i = num1) {
            System.out.print(num1 + " ");
            num1 = num2;
            num2 = i + num2;
        }        
        System.out.println("Serie de Fibonacci hasta " + limite + ":");
        scanner.close();
    }
    
    public static void Ejercicio17 (){           
        System.out.println("Ejericio 17\nPide al usuario dos números enteros y muestra todos "
            + "los números primos que se encuentran en ese rango.\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int numInicio = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numFinal = scanner.nextInt();   

        for (int num = numInicio; num <= numFinal; num++) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
            }
        }
        
        System.out.println("Números primos en el rango [" + numInicio + ", " + numFinal + "]:");
        scanner.close();
    } 
    
    public static void Ejercicio18 (){           
        System.out.println("Ejericio 18\nCrea un programa que genere una contraseña aleatoria de 8 "
            + "caracteres que contenga letras mayúsculas, letras minúsculas y dígitos. "
            + "Puedes utilizar la clase Math para generar números aleatorios "
            + "y la clase String para manipular la contraseña.\n");
        
        String contrasena = generarContrasenaAleatoria(8);
        System.out.println("Contraseña generada: " + contrasena);
    }

    public static String generarContrasenaAleatoria(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder contrasena = new StringBuilder();

        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < longitud; i++) {
            int indice = secureRandom.nextInt(caracteres.length());
            contrasena.append(caracteres.charAt(indice));
        }
        return contrasena.toString();
    }
    
    public static void Ejercicio19 (){           
        System.out.println("Ejericio 19\nEscribe un programa que solicite al usuario su nombre "
            + "y luego lo imprima en mayúsculas y minúsculas\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        String nombreMayusculas = nombre.toUpperCase();
        String nombreMinusculas = nombre.toLowerCase();

        System.out.println("Nombre en mayúsculas: " + nombreMayusculas);
        System.out.println("Nombre en minúsculas: " + nombreMinusculas);
        scanner.close();
    }
    
    public static void Ejercicio20 (){           
        System.out.println("Ejericio 20\nRealiza un programa que solicite al usuario una cadena "
            + "y luego invierta su orden\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        StringBuilder cadenaInvertida = new StringBuilder(cadena);
        cadenaInvertida.reverse();

        System.out.println("Cadena invertida: " + cadenaInvertida);

        scanner.close();
    }
}
