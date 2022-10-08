package primerexamenparcial;
import java.util.Scanner;
public class depreciacion {
static  Scanner  Sc=new Scanner(System.in);
	public static void main(String[] args) {
			
		Scanner lector = new Scanner(System.in);
		double Metodo1,Activo,VR,vidaUtil;
		
				System.out.println("calculador de depreciacion");
			
		
	
	System.out.println("-------- Metodo de linea recta --------");
	System.out.print("Ingrese el costo del activo: ");
	Activo=lector.nextInt();
	
	System.out.print("Ingrese los años de vida util: ");
    vidaUtil=lector.nextInt();
    
    System.out.print(" Ingrese el valor residual estimado: ");
    VR=lector.nextInt();
    
    
    Metodo1=(Activo-VR)/vidaUtil;
    
    System.out.println("La depreciacion anual es de: " +Metodo1);
    
		
		lector.close();
	}

}
