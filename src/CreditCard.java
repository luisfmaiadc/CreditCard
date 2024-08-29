import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private int saldo;
    private List<Compra> compraList;

    public CreditCard(int limite) {
        this.saldo = limite;
        this.compraList = new ArrayList<>();
    }

    public List<Compra> getCompraList() {
        return compraList;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean fazCompra(Compra compra) {
        if (this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compraList.add(compra);
            return true;
        } else {
            return false;
        }
    }
}
