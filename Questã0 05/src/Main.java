
public class Main {

	public static void main(String[] args) {
        
        String texto = "Gustavo";
        
        char[] caracteres = texto.toCharArray();
        
        int fim = caracteres.length - 1;
       
        for(int i = 0; i <= fim; i++) {
          
            char temp = caracteres[i];
            caracteres[i] = caracteres[fim];
            caracteres[fim] = temp;
            
            fim--;
        }
        
        System.out.println("String invertida: " + new String(caracteres));
        
    }

}
