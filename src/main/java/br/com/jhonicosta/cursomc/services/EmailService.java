package br.com.jhonicosta.cursomc.services;


import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import br.com.jhonicosta.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendMail(SimpleMailMessage msg);
	
	void sendOrderConfirmationHtmlEmail(Pedido obj);
	
	void sendHtmlEmail(MimeMessage msg);
}
