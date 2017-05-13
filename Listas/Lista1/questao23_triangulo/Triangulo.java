package questao23_triangulo;
public class Triangulo {
    
    /** Atributos **/
    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    /** Construtor **/
    public Triangulo (double a, double b, double c){
        this.setLadoA(a);
        this.setLadoB(b);
        this.setLadoC(c);
    }

    /** Getters and Setters **/
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    
    /** Métodos da Classe **/
    public boolean validaTriangulo(){
        
        double soma1 = this.getLadoA() + this.getLadoB();
        double soma2 = this.getLadoB() + this.getLadoC();
        double soma3 = this.getLadoA() + this.getLadoC();
        
        if ((soma1 > this.getLadoC()) && (soma2 > this.getLadoA()) && soma3 > this.getLadoB() && (this.getLadoA() > 0 && this.getLadoB() > 0 && this.getLadoC() > 0))
            return true;
        else
            return false;
    }
    
    public void tipoTriangulo(){
        if (this.validaTriangulo() == true) {
            if ((this.getLadoA() == this.getLadoB()) && (this.getLadoA() == this.getLadoC()))
                System.out.println("Esse triangulo eh equilatero");
            else if ((this.getLadoA() == this.getLadoB()) && (this.getLadoA() != this.getLadoC()))
                System.out.println("Esse triangulo eh isosceles");
            else if ((this.getLadoB() == this.getLadoC()) && (this.getLadoB() != this.getLadoA()))
                System.out.println("Esse triangulo eh isosceles");
            else if ((this.getLadoA() == this.getLadoC()) && (this.getLadoA() != this.getLadoB()))
                System.out.println("Esse triangulo eh isosceles");
            else
                System.out.println("Esse triangulo eh escaleno");
        }
        
        else
            System.out.println("Essa figura nao eh um triangulo");
    }
    
    public double calculaPerimetro(){
        double perimetro = this.getLadoA() + this.getLadoB() + this.getLadoC();
        return perimetro;
    }
 
}
