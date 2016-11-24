package br.com.cotacao.modelo;
import java.math.BigDecimal;

public class Cotacao {

	private Integer codigoMoeda;
	private char tipo;
	private String moeda;
	private BigDecimal taxaCompra;
	private BigDecimal taxaVenda;
	private BigDecimal paridadeCompra;
	private BigDecimal paridadeVenda;

	public Cotacao() {
	}

	public Cotacao(Integer codigoMoeda, char tipo, String moeda, BigDecimal taxaCompra, BigDecimal taxaVenda,
			BigDecimal paridadeCompra, BigDecimal paridadeVenda) {
		super();
		this.codigoMoeda = codigoMoeda;
		this.tipo = tipo;
		this.moeda = moeda;
		this.taxaCompra = taxaCompra;
		this.taxaVenda = taxaVenda;
		this.paridadeCompra = paridadeCompra;
		this.paridadeVenda = paridadeVenda;
	}

	public Integer getCodigoMoeda() {
		return codigoMoeda;
	}

	public void setCodigoMoeda(Integer codigoMoeda) {
		this.codigoMoeda = codigoMoeda;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public String getMoeda() {
		return moeda;
	}

	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}

	public BigDecimal getTaxaCompra() {
		return taxaCompra;
	}

	public void setTaxaCompra(BigDecimal taxaCompra) {
		this.taxaCompra = taxaCompra;
	}

	public BigDecimal getTaxaVenda() {
		return taxaVenda;
	}

	public void setTaxaVenda(BigDecimal taxaVenda) {
		this.taxaVenda = taxaVenda;
	}

	public BigDecimal getParidadeCompra() {
		return paridadeCompra;
	}

	public void setParidadeCompra(BigDecimal paridadeCompra) {
		this.paridadeCompra = paridadeCompra;
	}

	public BigDecimal getParidadeVenda() {
		return paridadeVenda;
	}

	public void setParidadeVenda(BigDecimal paridadeVenda) {
		this.paridadeVenda = paridadeVenda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoMoeda == null) ? 0 : codigoMoeda.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cotacao other = (Cotacao) obj;
		if (codigoMoeda == null) {
			if (other.codigoMoeda != null)
				return false;
		} else if (!codigoMoeda.equals(other.codigoMoeda))
			return false;
		return true;
	}

}
