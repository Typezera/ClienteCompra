import java.util.ArrayList;
import java.util.List;

public class Cliente
{
    public String nome;
    public String cpf;
    final List<Compra> compras = new ArrayList<>();;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public double obterValorToal(){
        double total = 0;
        for(Compra compra : compras){
           total += compra.obterValorTotal();
        }
        return total;
    }

}
