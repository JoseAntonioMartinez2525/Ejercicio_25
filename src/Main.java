import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int h,m,s;
		Scanner teclado = new Scanner(System.in);
		Tiempo hora;
		
		
		System.out.print("Ingrese las horas: ");
		h = teclado.nextInt();
		
		System.out.print("Ingrese los minutos: ");
		m = teclado.nextInt();
		
		System.out.print("Ingrese los segundos: ");
		s = teclado.nextInt();
		
		hora = new Tiempo(h,m,s);
		
		System.out.println(hora.toString());
		
		System.out.println("\n\n<======Aumentando el tiempo=======>");
		hora.aumentarHoras(2);
	
		hora.aumentarMinutos(120);
		System.out.println(hora.toString());
		
		hora.aumentarSegundos(3400);
		System.out.println(hora.toString());
		
		if(h>12)System.out.println(hora.toString()+" am");
		else System.out.println(hora.toString()+" pm");
		
		System.out.println("\n\n<======Decrementando el tiempo=======>");	
		hora.disminuirHoras(22);
		System.out.println(hora.toString());
		
		hora.disminuirMinutos(120);
		System.out.println(hora.toString());
		
		hora.disminuirMinutos(3600);
		System.out.println(hora.toString());
		
		if(h<12)
		System.out.println(hora.toString()+" am");
		else
		System.out.println(hora.toString()+" pm");
	}  
	 
}

