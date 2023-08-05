import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author VICTOR_CETRE
 */
public class Ejercicios_1_10 {    
    
    public static void Ejercicio1 (){
        System.out.println("Ejericio 1\nRealiza un programa que solicite al usuario dos números enteros "
                + "y muestre su suma, resta, multiplicación y división");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número entero:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número entero:");
        int num2 = scanner.nextInt();
        
        int suma = num1 + num2;
        System.out.println("\nSuma: " + suma);
        
        int resta = num1 - num2;
        System.out.println("Resta: " + resta);
        
        int multiplicacion = num1 * num2;
        System.out.println("Multiplicación: " + multiplicacion);
        
        if (num2 != 0) {
            double division = (double) num1 / num2;
            System.out.println("División: " + division);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
        scanner.close();
    }
    
    public static void Ejercicio2 (){   
    System.out.println("Ejericio 2\nEscribe un programa que pida al usuario un número entero "
            + "y determine si es par o impar\n");    
    System.out.println("Ingrese un número entero:");
    
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        scanner.close();
    }
    
    public static void Ejercicio3(){
        System.out.println("Ejericio 3\nCrea un programa que calcule y muestre el área y el perímetro de un círculo\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;
        
        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimetro);
        scanner.close();
    }
    
    public static void Ejercicio4() {
        System.out.println("Ejercicio 4\nPide al usuario su edad y muestra un "
                + "mensaje indicando si es mayor de edad o menor de edad");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
        scanner.close();
    }
    
    public static void Ejercicio5(){
        System.out.println("Ejercicio 5\nRealiza un programa que solicite al usuario dos números enteros "
                + "y determine cuál es el mayor de ellos");
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número entero:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número entero:");
        int num2 = scanner.nextInt();

        int mayor = Math.max(num1, num2);
        
        if (num1 == num2) {
            System.out.println("Los numeros son iguales: " + "\nNúmero entero 1: " + num1 + "\nNúmero entero 2: " + num2);
        } else {
            System.out.println("El número mayor es: " + mayor);
        }
        scanner.close();
    }
    
    public static void Ejercicio6() {
        System.out.println("Ejercicio 6\nEscribe un programa que pida al usuario un número "
                + "y verifique si es positivo, negativo o cero");
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        scanner.close();
    }
    
    public static void Ejercicio7(){
        System.out.println("Ejercicio 7\nCrea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10");
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo:");
        int numero = scanner.nextInt();
        System.out.println("La tabla del " + numero + " es:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();            
    }
    
    public static void Ejercicio8(){
        System.out.println("Ejercicio 8\nRealiza un programa que simule un juego de adivinar un número " 
                + "El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo. "
                + "El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar.");
        
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int numeroAdivinar = rand.nextInt(100) + 1;
        int intentos = 0;
        int numeroUsuario;

        do {
            System.out.println("Ingrese un número entre 1 y 100 (o ingrese 0 para terminar el juego):");
            numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario == 0) {
                System.out.println("Juego terminado. El número secreto era: " + numeroAdivinar);
                break;
            } else if (numeroUsuario < numeroAdivinar) {
                System.out.println("El número ingresado es menor que el número a adivinar.");
            } else if (numeroUsuario > numeroAdivinar) {
                System.out.println("El número ingresado es mayor que el número a adivinar.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                break;
            }
        } while (true);

        scanner.close();
    }
    public static void Ejercicio9(){
        System.out.println("Ejercicio 9\nEscribe un programa que solicite al usuario un número entero positivo "
                + "y calcule su factorial.");
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo:");
        int numero = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
        scanner.close();
    }
    
    public static void Ejercicio10(){
        System.out.println("Ejercicio 10\nCrea un programa que muestre los primeros 20 números de la serie Fibonacci. "
                + "\nLa serie Fibonacci se forma sumando los dos números anteriores para obtener "
                + "el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …");
         
        int n = 20;
        int[] serieFibonacci = new int[n];
        serieFibonacci[0] = 0;
        serieFibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            serieFibonacci[i] = serieFibonacci[i - 1] + serieFibonacci[i - 2];
        }

        System.out.println("\nLos primeros " + n + " números de la serie Fibonacci son:");
        for (int num : serieFibonacci) {
            System.out.print(num + ", ");
        }
    }
}
