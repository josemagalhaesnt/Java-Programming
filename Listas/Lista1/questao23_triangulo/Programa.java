package questao23_triangulo;
public class Programa {
    
    public static void main (String args[]){
        
        Triangulo t1 = new Triangulo(3.5, 3.5, 3.5);
        Triangulo t2 = new Triangulo(3.5, 3, 3.5);
        Triangulo t3 = new Triangulo(3.5, 2.5, 1.5);
        Triangulo t4 = new Triangulo(3, 1.5, 1.4);
        
        t1.tipoTriangulo();
        t2.tipoTriangulo();
        t3.tipoTriangulo();
        t4.tipoTriangulo();
        
        if (t1.validaTriangulo() == true)
            System.out.println("Perimetro T1 = " + t1.calculaPerimetro());
        if (t2.validaTriangulo() == true)
            System.out.println("Perimetro T2 = " + t2.calculaPerimetro());
        if (t3.validaTriangulo() == true)
            System.out.println("Perimetro T3 = " + t3.calculaPerimetro());
        if (t4.validaTriangulo() == true)
            System.out.println("Perimetro T4 = " + t4.calculaPerimetro());
    }   
}
