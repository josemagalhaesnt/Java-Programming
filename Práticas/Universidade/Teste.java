package universidade;
public class Teste {
    //Método Principal
	public static void main (String args[]){
		Pessoa p1 = new Pessoa ("Pedro Castro", "(85) *9999-9999", "201720162015", "123.456.789-10",'M');
		Pessoa p2 = new Pessoa ("Lucas Silva", "(83) 00000-9999", "201620152014", "123.456.789-20",'m');
		Pessoa p3 = new Pessoa ("Jose Neto", "(58) 55555-5555", "201520142013", "123.456.789-30",'T');
		Pessoa p4 = new Pessoa ("Maria Magalhaes", "(11) 66666-6666", "201420132012", "123.456.789-40",'F');
		Pessoa p5 = new Pessoa ("Carla Fernandes", "(77) 77777-7777", "201320122011", "123.456.789-50",'f');
		Pessoa p6 = new Pessoa ("Fernanda Rocha", "(31) 88888-8888", "201220112010", "123.456.789-60",'F');
		
		Funcionario f1 = new Funcionario (p2, 12345,"Professor",2500.90,80);
		Funcionario f2 = new Funcionario (p4, 43210,"Professora",2500.90,80);
		Funcionario f3 = new Funcionario (p3, 12345,"Professor/Coordenador",5000,120);
		Funcionario f4 = new Funcionario (p5, 43210,"Professora/Coordenadora",5000,120);
		Funcionario f5 = new Funcionario (p1, 741254,"Seguranca",1800,80);
		
		Departamento d1 = new Departamento ("Departamento de Telematica","Computacao", "DTEL");
		Departamento d2 = new Departamento ("Departamento de Matematica","Matematica", "DMEL");

		Professor prof1 = new Professor (f1, "Computacao", d1, 80);
		Professor prof2 = new Professor (f2, "Matematica", d1, 80);
		Professor prof3 = new Professor (f3, "Computacao", d1, 40);
		Professor prof4 = new Professor (f4, "Matematica", d1, 40);
		
		d1.setCoordenador(prof3);
		d2.setCoordenador(prof4);
		
		Seguranca s1 = new Seguranca (f5, "12544");
		
		d1.mostrarInfo();
		d2.mostrarInfo();
    }
}
