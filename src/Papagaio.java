
public class Papagaio extends Ave {
    private String frase;
    //criando construtor
    public Papagaio(String n,boolean v,String f){
        super(n,v);
        setFrase(f);
    }
    public String getFrase(){
       return this.frase;
    }
    public void setFrase(String f){
        this.frase = f;
    }
    public void talk(){
        System.out.println(getFrase());
    }
}
