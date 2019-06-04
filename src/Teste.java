


public class Teste {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Carla", "Rua A, 137, Centro", "38 3743-5190");
        
        Fornecedor f1 = new Fornecedor("Rafael", "Rua B,200,  Centro", "38 3740-0000", 1000.00, 800.00);
        f1.obterSaldo(0);
        
        Empregado e1 = new Empregado("Petronio", "Rua B, 123, Centro", "37 4536-0000", "C12", 1000.00, 10.00);
        e1.CalcularSalario(0);
        
        Administrador a1 = new Administrador("Pedro", "Rua c, 440, Centro", "38 756-0000", "A12", 10000.00, 10.00, 200.00);
        a1.CalcularSalario(0);
        
        Operario o1 = new Operario("Jose", "Rua d, 200, Centro", "38 756-0000", "O10", 1000.00, 10.00, 2000.00, 10.00);
        o1.CalcularSalario(0, 0);
    }
    
}
