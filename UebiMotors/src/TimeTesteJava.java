public class TimeTesteJava {
	public static void main(String[] args) {
		
		TimeJava t1;
		t1 = new TimeJava();
		t1.setTime(15,22,59);
		
		System.out.println("HORA UNIVERSAL: " + t1.exibirHoraUniversal());
		System.out.println("HORA PADRAO: " + t1.exibirHoraPadrao());
		
		
	}
}
