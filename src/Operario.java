




public class Operario extends Empregado{
    
    private double ValorProducao;
    private double Comissão;
    
    public double getValorProducao(){
        return this.ValorProducao;
    }
    
    public double getComissão(){
        return this.Comissão;
    }
    
    public void setValorProducao(double p){
        this.ValorProducao = p;
    }
    
    public void setComissão(double o){
        this.Comissão = o;
    }
    
    public Operario(String n, String e, String t, String c, double b, double i, double p, double o){
        super(n, e, t, c, b, i);
        this.setValorProducao(p);
        this.setComissão(o);
    }
    
    public double CalcularSalario(double s, double p){
        
        p = ((this.getValorProducao()/100)*this.getComissão());
        
        s = this.getSalarioBase()+p-(((p+this.getSalarioBase())/100)*this.getImposto());
        return s;
    }
}
