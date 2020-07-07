

public class Tiempo {
	
	private int horas;
	private int minutos;
	private int segundos;
	
	public Tiempo() {
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
	}
	
	public Tiempo(int h, int m, int s) {
		this.horas = h;
		this.minutos = m;
		this.segundos = s;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	public void aumentarHoras(int h) {
		
		this.horas = this.horas + h; 
		if(this.horas >= 24) {
			this.horas -= 24;
		}
	}
	
	public void aumentarMinutos(int m) {
		this.minutos = this.minutos + m;
		if(this.minutos>=60) {
			while(this.minutos>=60) {
				this.aumentarHoras(1); 
				this.minutos -= 60;
			} 
		}
	}
	
	public void aumentarSegundos(int s) {
		this.segundos = this.segundos + s;
		if(this.segundos>=60) {
			while(this.segundos>=60) {
				this.aumentarMinutos(1); 
				this.segundos -= 60;
			} 
		}
	}
	
	public void disminuirHoras(int h) {
		
		this.horas = this.horas - h; 
		if(this.horas < 0) {
			this.horas += 24;
		}
	}
	
	public void disminuirMinutos(int m) {
		this.minutos = this.minutos - m;
		if(this.minutos<0) {
			while(this.minutos<0) {
				this.disminuirHoras(1); 
				this.minutos += 60;
			} 
		}
	}
	
	public void disminuirSegundos(int m) {
		this.segundos = this.segundos - m;
		if(this.segundos<0) {
			while(this.segundos<0) {
				this.disminuirMinutos(1); 
				this.segundos += 60;
			} 
		}
	} 
	
	
	public String toString() {
		
		return ((this.horas<10)?"0":"")+this.horas +":"+this.minutos+":"+this.segundos;
	} 
	
}
