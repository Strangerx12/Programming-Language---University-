//Programa que valida una contraseña según los siguientes criterios:
//1. Debe tener al menos 8 caracteres.
//2. Debe contener al menos una letra mayúscula.
//3. Debe contener al menos un dígito.
//4. Debe contener al menos un carácter especial (!@#$%^&*).

import java.util.Scanner; 
public class Ejercicio2{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese contrtaseña para validar: ");
            String contrasena = scanner.nextLine();

            int cumpleLongitud = 0;
            int cumpleMayuscula = 0;
            int cumpleDigito = 0; 
            int cumpleCaracterEspecial = 0;

            if (contrasena.length() >= 8) {
                cumpleLongitud = 1;
            }

            for (int i = 0; i < contrasena.length(); i++) {
                char caracter = contrasena.charAt(i);

                if (caracter >= 'A' && caracter <= 'Z') {
                    cumpleMayuscula = 1;
                } else if (caracter >= '0' && caracter <= '9') {
                    cumpleDigito = 1;
                } else if (caracter == '!' || caracter == '@' || caracter == '#' || caracter == '$' || 
                caracter == '%' || caracter == '^' || caracter == '&' || caracter == '*') {
                    cumpleCaracterEspecial = 1;
                }
            }
scanner.close();

System.out.println("\n------Resultado de la validación de la contraseña------");
if (cumpleLongitud == 1) {
    System.out.println("Cumple con la presencia de al menos 8 caracteres.");
} else {
    System.out.println("No cumple con la presencia de al menos 8 caracteres.");
}
if (cumpleMayuscula == 1) {
    System.out.println("Cumple con la presencia de al menos una letra mayúscula.");
} else {
    System.out.println("No cumple con la presencia de una letra mayúscula.");
}
if (cumpleDigito == 1) {
    System.out.println("Cumple con la presencia de al menos un dígito.");
} else {
    System.out.println("No cumple con la presencia de un dígito.");
}
if (cumpleCaracterEspecial == 1) {
    System.out.println("Cumple con la presencia de al menos un carácter especial(!@#$%^&*).");
} else {
    System.out.println("No cumple con la presencia de un carácter especial(!@#$%^&*).");
}
        }
    }
}




        
