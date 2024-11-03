import java.util.ArrayList;
import java.util.List;

public class Compra
{
    public final List<Item> itens = new ArrayList<>();;

    public void adicionarItem(Produto p, int quantidade){
        this.itens.add(new Item(p, quantidade));
    }

    double obterValorTotal(){
        double total = 0;
        for(Item item: itens){
            total += item.qts * item.produto.preco;
        }
        return total;
    }
}
