
public class TimeJava {
	
	private int hora;
	private int minuto;
	private int segundos;
	
	
	public void setTime(int hora, int minuto, int segundos) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundos = segundos;
	}
	
	public String exibirHoraUniversal() {
		return hora + ":" + minuto + ":" + segundos;
	}
	
	public String exibirHoraPadrao() {
		if(hora > 12) {
			hora = hora - 12;
			return hora + ":" + minuto + ":" + segundos + " PM";
		}
		else {
			return hora + ":" + minuto + ":" + segundos + " AM";
		}
	}
}
