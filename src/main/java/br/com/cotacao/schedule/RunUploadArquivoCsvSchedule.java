package br.com.cotacao.schedule;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;

public class RunUploadArquivoCsvSchedule {

	private static final String PROTOCOLO = "http";
	private static final String ENDERECO = "www4.bcb.gov.br";
	private static final String ARQUIVO = "/Download/fechamento/";
	private static final String EXTENSAO = ".csv";

	public void printMe() {
		this.loadCotacaoMoedas();
	}

	private void loadCotacaoMoedas() {
		final String hoje = this.montarData();

		try {
			URL url = new URL(PROTOCOLO, ENDERECO, ARQUIVO.concat(hoje).concat(EXTENSAO));
			URLConnection openConnection = url.openConnection();
			openConnection.connect();

			FileOutputStream fileOutputStream = new FileOutputStream("meuArquivo.cvs");

			int c = 0;

			do {
				c = openConnection.getInputStream().read();
				fileOutputStream.write(c);
			} while (c != -1);
			fileOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String montarData() {
		final LocalDate dataHoje = LocalDate.now();

		return new StringBuilder().append(dataHoje.getYear()).append(dataHoje.getMonthValue())
				.append(dataHoje.getDayOfMonth()).toString();
	}
}