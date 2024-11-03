public class ClienteTeste
{
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Fernanda", "123.345.678-50");
        Produto p1 = new Produto("Computador", 1900.00);
        Produto p2 = new Produto("Churrasqueira", 200.00);

        //Instancia de item;
        Compra compra1 = new Compra();

        compra1.adicionarItem(p1, 3);
        compra1.adicionarItem(p2, 2);

        c1.compras.add(compra1);

        System.out.println(c1.obterValorToal());
    }
}
