
public class Vaca extends Mamifero{
    private boolean temLeite;
    
    //criando construtor
    public Vaca(String n, int p, boolean t){
       super(n,p);
       setTemLeite(t);
       
    }
    
    public boolean getTemLeite(){
        return this.temLeite;
    }
    public void setTemLeite(boolean v){
        this.temLeite = v;
    }
    
    @Override
    public void talk(){
        System.out.println("muuuu");
    }
}
