import java.util.Scanner;


class Atividade3 {
  
    
    static int valor;  
	  
	  public static boolean validarValor(double valor){    
		
		if(valor <= 0){
		  return false;
		}
		
		return true;
	  }
          
          
	public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);
    
    		
                int i = 0;
                int media =0;
                  
                while(i < 10){
                    
                    valor += teclado.nextInt();
                   
                    if(validarValor(valor) == false){
		System.out.print("\n valor invalido \n");
                }
                  i++;
            }
                 media = valor / 10;
                 
                System.out.printf("O valor total eh " + valor);
                System.out.printf("\n E a media  eh " + media);

}
}

