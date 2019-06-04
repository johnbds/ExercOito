
public class TestaAnimais {
    public static void main(String[] args){
        Papagaio p = new Papagaio("José",false,"Nunca nem vi");
        p.talk();
        p.imprime();
        
        Arara a = new Arara("meg",true);
        a.talk();
        a.imprime();
        
        Cachorro c = new Cachorro("Suco",4, true);
        c.talk();
        c.imprime();
        
        Vaca v = new Vaca("Julieta",4,true);
        v.talk();
        v.imprime();
        
        
        
    }
}
