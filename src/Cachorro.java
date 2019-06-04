
public class Cachorro extends Mamifero {
    private  boolean lateAlto;
    
    //criando construtor
    public Cachorro(String n, int p, boolean i){
        super(n,p);
        setLateAlto(i);
    }
    public boolean getLateAlto(){
        return this.lateAlto;
    }
    public void setLateAlto(boolean i){
        this.lateAlto = i;
    }
    public void talk (){
        System.out.println("au-au");
    }
   
}
