



public class Fornecedor extends Pessoa{
    
    private double ValorCredito;
    private double ValorDivida;
    
    public double getValorCredito(){
        return this.ValorCredito;
    }
    
    public double getValorDivida(){
        return this.ValorDivida;
    }
    
    public void setValorCredito(double c){
        this.ValorCredito = c;
    }
    
    public void setValorDivida(double d){
        this.ValorDivida = d;
    }
    
    public double obterSaldo(double s){
        s = this.ValorCredito - this.ValorDivida;
        return s;
    }
    
    public Fornecedor(String n, String e, String t, double c, double d){
        super(n, e, t);
        this.setValorCredito(c);
        this.setValorDivida(d);
    }
}
