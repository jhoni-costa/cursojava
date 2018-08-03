package br.com.jhonicosta.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.jhonicosta.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendMail(SimpleMailMessage msg);
}
