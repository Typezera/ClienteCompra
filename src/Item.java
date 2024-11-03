import java.util.ArrayList;
import java.util.List;

public class Item
{
    public final int qts;
    final Produto produto;

    public Item(Produto prod, int quantidade){
        produto = prod;
        this.qts = quantidade;
    }
}
