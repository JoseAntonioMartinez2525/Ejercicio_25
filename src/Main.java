import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
        Tiempo time = new Tiempo();
        String d;
        //time.ponerEnHora(24,24,59,59);
        //System.out.println(time.verHora());
        System.out.println("Desea cambiar el reloj? ");
        d=teclado.nextLine();
        registrar();

    }
	static Tiempo registrar() {
		Scanner teclado = new Scanner(System.in);		
        Tiempo time = new Tiempo();	
        int h,m,s,d;

        System.out.println("Ingrese el dia: 1.Lunes, 2.martes, 3.miercoles, 4.jueves, 5.viernes, 6.sabado, 7.domingo");       
		d=teclado.nextInt();
        String a;
        
        System.out.print("hora: ");
		h=teclado.nextInt();
		
        System.out.print("minutos: ");
		m=teclado.nextInt();
		
        System.out.print("segundos: ");
		s=teclado.nextInt();
		
		if(h==24) {
			switch (d) {
			case 1: System.out.println("El dia es: martes");break;
			case 2: System.out.println("El dia es: miercoles");break;
			case 3: System.out.println("El dia es: jueves");break;
			case 4: System.out.println("El dia es: viernes");break;
			case 5: System.out.println("El dia es: sabado");break;
			case 6: System.out.println("El dia es: domingo");break;
			case 7: System.out.println("El dia es: lunes");break;
			default:
				break;
			}
		}
	       time.ponerEnHora(12,h,m,s); 
	       
	       System.out.println(time.verHora());	       
        time.incrementar();
        System.out.println(time.verHora());
        return time;
        
	}


		
	}


