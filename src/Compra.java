public class Compra implements Comparable<Compra> {

    private final String descricao;
    private final int valor;

    public Compra(String descricao, int valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "[Compra: " + descricao + ", Valor: " + valor + "]";
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Integer.compare(this.valor, outraCompra.valor);
    }
}
