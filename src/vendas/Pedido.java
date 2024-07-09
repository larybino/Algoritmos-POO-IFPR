package vendas;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;
    private Date dataPedido;
    private double total;

    public Pedido(Cliente cliente, List<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.dataPedido = new Date();
        this.total = calcularTotal();
    }

    private double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public double getTotal() {
        return total;
    }
}
