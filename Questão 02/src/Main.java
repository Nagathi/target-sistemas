import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        
        int numero = scanner.nextInt();
        
        if (verificarFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência");
        } else {
            System.out.println(numero + " não pertence à sequência");
        }
        
        scanner.close();
    }
    
 
    public static boolean verificarFibonacci(int numero) {
        int a = 0, b = 1;
        
        while (b < numero) {
            int temporario = b;
            b = a + b;
            a = temporario;
        }
        
        return b == numero;
    }

}
