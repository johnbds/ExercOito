
public class Ave extends Animal {
    private boolean voa;
    
    public Ave(String n, boolean v){
        super(n);
        setVoa(v);
    }
    public boolean getVoa(){
        return this.voa;
    }
    public void setVoa(boolean r){
        this.voa = r;
    }
    public void talk(){
        System.out.println("piu-piu");
        
    }
    
}
