package com.culqui.service;

import com.culqui.entity.Autorizacion;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.culqui.entity.Card;
import com.culqui.entity.CardToken;

public interface CardService {

	@RequestMapping(method = RequestMethod.POST, value="/valida")
	public Autorizacion generarTokenTarjeta(@RequestBody Card tarjeta, HttpHeaders headers);
}
