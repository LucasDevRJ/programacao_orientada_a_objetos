package empresa;

public class Horario {
	private int hora;
	private int minuto;
	private int segundo;
	
	public int getHora() {
		return hora;
	}
	
	public void setHora(int hora) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		} else {
			System.out.println("Horário inválido!");
		}
	}
}
