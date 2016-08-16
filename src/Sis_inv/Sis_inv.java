/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sis_inv;
import java.util.Scanner;
/**
 *
 * @author Pherdinandrew
 */
public class Sis_inv {
    
  

	public static void main(String[] args) 
        {
		int edad;
                int eleccion;
                int suma1;
                int suma2;
                String Empresa;
                String Socio;
		Scanner can = new Scanner(System.in);
                Scanner sna = new Scanner(System.in);
                Scanner ska = new Scanner(System.in);
                Scanner sla = new Scanner(System.in);
                Scanner rla = new Scanner(System.in);
		System.out.println("Contax9000");
		System.out.println("Porfavor Introduzca el Nombre de la empresa");
                Empresa = can.nextLine();
                System.out.print("Empresa:");
                System.out.println(Empresa);
                System.out.println("Porfavor Introduzca el Nombre de el Socio");
        	Socio = sna.nextLine();
                System.out.print("Cliente:");
                System.out.println(Socio);
                System.out.println("*****************************");
                System.out.println("Contax9000");
                System.out.println("*****************************");
                System.out.print("Empresa:");
                System.out.println(Empresa);
                System.out.print("Cliente:");
                System.out.println(Socio);
                System.out.println("*****************************"); 
                System.out.println("Introduzca el Primer Numero");
                suma1 = sla.nextInt();
                System.out.println("Introduzca el Segundo Numero");
                suma2 = sla.nextInt();
                System.out.println("*******************************");
                System.out.println("La suma de este numero es :");
                System.out.println(suma1 + suma2);
                System.out.println("La Resta de este numero es :");
                System.out.println(suma1 - suma2);
                System.out.println("La Multiplicacion de este numero es :");
                System.out.println(suma1 * suma2);
                System.out.println("La Division de este numero es :");
                System.out.println(suma1 / suma2); 
        }
}


