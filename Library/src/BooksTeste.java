
public class BooksTeste {
	public static void main(String args[]) {
		Books b1, b2, b3, b4, b5;
		
		b1 = new Books("Titulo 1","Autor 1",2016,"Categoria 1",1001,false);
		b2 = new Books("Titulo 2","Autor 2",2017,"Categoria 2",1002,false);
		b3 = new Books("Titulo 3","Autor 3",2018,"Categoria 3",1003,false);
		b4 = new Books("Titulo 4","Autor 4",2019,"Categoria 4",1004,false);
		b5 = new Books("Titulo 5","Autor 5",2020,"Categoria 5",1005,false);
		
		b1.imprimir();
		b2.imprimir();
		b3.imprimir();
		b4.imprimir();
		b5.imprimir();
		
		b1.emprestar();
		b2.emprestar();
		b3.emprestar();
		
		b1.imprimir();
		b2.imprimir();
		b3.imprimir();
		b4.imprimir();
		b5.imprimir();
		
		b1.devolver();
		b2.devolver();
		b3.devolver();
	}
}
