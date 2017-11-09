package br.com.seniorsolution.decorator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class EmissorDecoratorCompress extends EmissorDecorator{

	public EmissorDecoratorCompress(Emissor emissor) {
		super(emissor);
	}

	@Override
	public void enviar(String mensagem) {
		
		System.out.println("Enviando mensagem compactada....");
		String novaMensagem;
		
		try {
			novaMensagem = compactar(mensagem);
		} catch (Exception e) {
			novaMensagem = mensagem;
		}
		this.getEmissor().enviar(novaMensagem);
	}
	
	private String compactar(String mensagem) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		DeflaterOutputStream dout = new DeflaterOutputStream(out, new Deflater());
		
		dout.write(mensagem.getBytes());
		dout.close();
		return new String(out.toByteArray());
	}
}
