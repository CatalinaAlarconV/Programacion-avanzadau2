package cachipun;
import java.util.*;
import javax.swing.*;

import javax.swing.JOptionPane;

public class persona {

	public static void main(String[] args) {
		System.out.println("____________________________________________________________________________________________________________");
		System.out.println("__________________________________BIENVENIDOS AL JUEGO :CACHIPUN-DOBLE:_____________________________________");
		System.out.println("____________________________________________________________________________________________________________");
		System.out.println();
		//PIDO NOMBRES DE LOS JUGADORES 
		String perso1=JOptionPane.showInputDialog("introduce nombre jugador1");
		String perso2=JOptionPane.showInputDialog("introduce nombre jugador2");
		
		System.out.println("¿Qué modo desea jugar?, ingrese el numero en la consola de su respuesta...");
		System.out.println("MODO (1) = Cachipun con una sola mano \nMODO (2) = Cachipun con las dos manos");
		//PIDO EL NUMERO DE SELECCION
		Scanner modo=new Scanner(System.in);
		int modo_seleccionado=modo.nextInt();
		//EVALUO EL MODO SELECCIONADO
		if (modo_seleccionado!=0-2) {
			System.out.println("EL NUMERO DE TIRO QUE INGRESASTE ES INVALIDO!, VUELVE A INTENTARLO");
			
		}
		
		if (modo_seleccionado==1) {
		System.out.println("¡PERFECTO!");
			
		mano figura=new mano();
		
		System.out.println("LAS OPCIONES DE TIRO SON: "+ "PIEDRA = " + figura.piedra+ "PAPEL = "+ figura.papel + "TIJERA = "+ figura.tijera);
		System.out.println("Seleccione una de las opciones de tiro:");
		System.out.println("---Los resultados del juego se mostraran al final de los 3 tiros por persona.---");
		
		System.out.println("ES EL TURNO DE "+ perso1);
		Scanner tiro_1=new Scanner(System.in);
		String tiro1=tiro_1.nextLine();
		System.out.println("ES EL TURNO DE "+ perso2);
		Scanner tiro_2=new Scanner(System.in);
		String tiro2=tiro_2.nextLine();
		System.out.println("ES EL TURNO DE "+ perso1);
		Scanner tiro_3=new Scanner(System.in);
		String tiro3=tiro_3.nextLine();
		System.out.println("ES EL TURNO DE "+ perso2);
		Scanner tiro_4=new Scanner(System.in);
		String tiro4=tiro_4.nextLine();
		System.out.println("ES EL TURNO DE "+ perso1);
		Scanner tiro_5=new Scanner(System.in);
		String tiro5=tiro_5.nextLine();
		System.out.println("ES EL TURNO DE "+ perso2);
		Scanner tiro_6=new Scanner(System.in);
		String tiro6=tiro_6.nextLine();
		}


}		
}
		
		//if (tiro1==tiro2) {
			//System.out.println("empate");
		//}
		//if (tiro3==tiro4) {
			//System.out.println("empate");
		//}
		//if (tiro5==tiro6) {
		//	System.out.println("empate");
		//}
		
		//}
		//if (tiro1==2&&tiro2==1) {
		//	System.out.println("Gana jugador 1");			
		//}
		//else {
			//System.out.println("Gana jugador 2");
		//}
		
		//if (tiro1==1&&tiro2==0){
			//System.out.println("Gana jugador 1");
		//}
		//else {
			//System.out.println("Gana jugador 2");
			
		//}
		
		//if (tiro1==0&&tiro2==2) {
			//System.out.println("Gana jugador 1");
		//}
		//else
			//System.out.println("Gana jugador 2");
		//}
		
		
		//if (tiro3==2&&tiro4==1) {
			
			//System.out.println("Gana jugador 1 ");		
			
		//}
		//else {
		
		//	System.out.println("Gana jugador 2");
		
		//}
		
		
		//final
		

			
				
	
