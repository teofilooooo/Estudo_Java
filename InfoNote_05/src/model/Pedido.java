package model;

public class Pedido {

	public int numero;
	public String dataEmissao;
	public String formaDePagamento;
	public double valorTotal;
	public String situacao;

	@SuppressWarnings("unused")
	private Endereco enderecoEntrega;
	private ItemDePedido itens[] = new ItemDePedido[10];

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public ItemDePedido[] getItens() {
		return itens;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Pedido() {
		super();
	}

	public Pedido(int numero, String dataEmissao, String formaDePagamento, double valorTotal, String situacao) {
		this.numero = numero;
		this.dataEmissao = dataEmissao;
		this.formaDePagamento = formaDePagamento;
		this.valorTotal = valorTotal;
		this.situacao = situacao;
	}

	public boolean inserirItem(ItemDePedido item) {
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] == null) {
				itens[i] = item;
				return true;
			}
		}
		return false;
	}

	public void mostrar() {

		System.out.println("\nPedido \n");
		System.out.println("N� Pedido: " + this.numero);
		System.out.println("Data de Emiss�o: " + this.dataEmissao);
		System.out.println("Forma de Pagamento: " + this.formaDePagamento);
		System.out.println("Valor Total R$: " + this.valorTotal);
		System.out.println("Situa��o: " + this.situacao);
		System.out.println("\nItens do Pedido\n");
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] != null) {
				itens[i].mostrar();
			}
		}
	}
}
