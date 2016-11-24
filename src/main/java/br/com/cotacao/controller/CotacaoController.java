package br.com.cotacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotacao.modelo.Cotacao;
import br.com.cotacao.service.CotacaoService;

@RestController
public class CotacaoController {
	
	@Autowired
	private CotacaoService cotacaoService;

	@RequestMapping(
			value = "/cotacoes",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Cotacao>> find() {
		return new ResponseEntity<>(cotacaoService.getCotacoes(), HttpStatus.OK);
	}
}
