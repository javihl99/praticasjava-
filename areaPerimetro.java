/**programa que calcule y escriba el perimetro y el area de un rectangulo cuya base y altura se leen desde teclado 
 *  
 */
package basicos;
import java.util.*;
public class areaPerimetro {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int base;
		System.out.print("introduce base");
		base= sc.nextInt();
		
		
		int altura;
		System.out.print("introduce altura");
		altura=sc.nextInt();
		sc.close();
		
		int perimetro;
		int area;
		
		perimetro= base + base + altura + altura;
		
		area= base * altura;
		
		System.out.println("El perimetro del rectangulo es " + perimetro + " .El area es " + area);
		

		
	}

}
