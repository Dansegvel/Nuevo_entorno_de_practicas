package calculadora_mejorada;
import javax.swing.JOptionPane;
/**
 * Nos permitirá realizar la suma, resta, multiplicacion y división de los dos números que introduciremos
 * 
 * @author danie
 * @version 2.0
 * @since 24-3-2022
 */
public class Calculadora_mejorada {
    //Metodos
    /**
     * Proceso para mostrar la suma de a+b en una ventana de texto
     * 
     * @param a
     * Valor double numérico
     * @param b 
     * Valor double numérico
     */
    public static void Suma (double a,double b) {
        JOptionPane.showMessageDialog(null, "La suma es "+(a+b) ) ;
    }
    /**
     * Proceso para mostrar la resta de a-b en una ventana de texto
     * 
     * @param a
     * Valor double numérico
     * @param b 
     * Valor double numérico
     */
    public static void Resta (double a,double b) {
        JOptionPane.showMessageDialog(null, "La resta es "+(a-b) ) ;
    }
    /**
     * Proceso para mostrar la multiplicación de a*b en una ventana de texto
     * 
     * @param a
     * Valor double numérico
     * @param b 
     * Valor double numérico
     */
    public static void Multiplicacion (double a,double b) {
        JOptionPane.showMessageDialog(null, "La multiplicación es "+(a*b) ) ;
    }
    /**
     * Proceso para mostrar la división de a/b y su resto en una ventana de texto
     * 
     * @param a
     * Valor double numérico
     * @param b 
     * Valor double numérico
     */
    public static void Division (double a,double b) {
        JOptionPane.showMessageDialog(null, "El división es "+(a/b)+" y el resto "+(a%b) ) ;
    }
    /**
     * Proceso para leer un número double
     * 
     * @param a
     * Valor double numérico
     * @return Valor introducido
     */
    public static double LeerNumero (double a) {
       String b=JOptionPane.showInputDialog(null, "Introduce un numero decimal:" ) ;
       a = Double.parseDouble(b);
       return a;
    }
    /**
     * Proceso para leer un número entero (int)
     * 
     * @param a
     * Valor interger numérico
     * @return Valor introducido
     */
    public static int LeerEntero (int a) {
       String b=JOptionPane.showInputDialog(null, "Introduce un numero entero:" ) ;
       a = Integer.parseInt(b);
       return a;
    }
    /**
     * Proceso para confirmar o no el seguir ejecutando operaciones
     * 
     * @param a
     * Tres valores interger numérico: Yes (0), No (1), Cancelar (2)
     * @return 0,1 o 2
     */
    public static int Confirmar (int a) {
        a=JOptionPane.showConfirmDialog(null, "¿Quiere continuar haciendo operaciones?" ) ;
        return a;
    }
    /**
     * Proceso para elegir que opciones de operación queremos
     * 
     * @param a
     * Valor cadena
     * @return Cadena introducida
     */
    public static String Opcion (String a) {
       a=JOptionPane.showInputDialog(null, "Que operación desea hacer: A.Sumar B.Restar C.Multiplicar D.Dividir" ) ;
       return a;
    }
    //Programa
    /**
     * Llamamos a la clase Leer Numero
     * /Llamamos a la clase Leer Entero
     * /Llamamos a la clase Opcion, en el que introduciremos un caracter; y cualquier cosa no listada en la lista pasará a una ventana alternativa
     * /Asociamos letras de la A a la D tanto sus mayus como minus a una operación matemática descrita en Operación
     * A-Suma / B-Resta / C-Multiplicación / D-División
     * /Como no podemos dividir entre cero, una parte se encarga de cambiar el num2 por uno distinto de 0
     * /Si le damos al botón Yes, nos dará un valor 0, por lo que el programa seguirá repitiéndose desde el punto de elegir Opción
     * /Fin del programa
     * 
     * @param args 
     * num1=Primer valor de la operación, double
     * / num2=Segundo valor de la operación, int
     * / operacion=Valor al que le asignaremos el tipo de operación
     * / seguir= Interruptor que nos hara continuar o no las operaciones
     */
    public static void main(String[] args) {
        double num1=0;
        int num2=0;
        int seguir=0;
        String operacion="";
        while (seguir == 0) {
            num1=LeerNumero(num1);
            num2=LeerEntero(num2);
            operacion=Opcion(operacion);
            switch (operacion)    {
            case "a","A"://Si introducimos A, llamaremos a la Suma
                Suma(num1,num2);
                break;
            case "b","B"://Si introducimos B, llamaremos a la Resta
                Resta(num1,num2);
                break;
            case "c","C"://Si introducimos C, llamaremos a la Multiplicacion
                Multiplicacion(num1,num2);
                break;
            case "d","D"://Si introducimos D, llamaremos a la División
                while (num2 == 0){
                    System.out.println("No puedes dividir entre 0, introduce otro número:");
                    num2=LeerEntero(num2);
                }
                Division(num1,num2);
                break;
            default:
                System.out.println("Opción no encontrada.");
            }
            seguir = Confirmar(seguir);
        }
        JOptionPane.showMessageDialog(null, "Chao" ) ;//Fin del programa
    }
}