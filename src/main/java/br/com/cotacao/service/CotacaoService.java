package br.com.cotacao.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import br.com.cotacao.modelo.Cotacao;

@Service
public class CotacaoService {

	private List<Cotacao> cotacoes = new ArrayList<>();
	private AtomicInteger atomicInteger = new AtomicInteger(1);

	@PostConstruct
	private void init() {
		this.createCotacoes();
	}

	public List<Cotacao> getCotacoes() {
		return this.cotacoes;
	}

	private void createCotacoes() {
		cotacoes.add(new Cotacao(5, 'A', "AFN", new BigDecimal("0.05076"), new BigDecimal("0.05093"),
				new BigDecimal("0.05093"), new BigDecimal("0.05093")));
		cotacoes.add(new Cotacao(5, 'A', "AFN", new BigDecimal("0.05076"), new BigDecimal("0.05093"),
				new BigDecimal("0.05093"), new BigDecimal("0.05093")));
	}

	public void createCotacao() {
		cotacoes.add(new Cotacao(atomicInteger.getAndIncrement(), 'A', "AFN", new BigDecimal("0.05076"),
				new BigDecimal("0.05093"), new BigDecimal("0.05093"), new BigDecimal("0.05093")));
	}
}
