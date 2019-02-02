package com.culqui.service;

import java.util.Date;

import com.culqui.entity.Autorizacion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RestController;

import com.culqui.client.RestCardClient;
import com.culqui.entity.Card;
import com.culqui.entity.CardBinlist;
import com.culqui.entity.CardToken;
import com.culqui.util.PropertiesCulquiTest;
import com.culqui.util.UtilCulqui;

@RestController()
public class BasicCardService implements CardService{
	
	private static final Logger log = LoggerFactory.getLogger(BasicCardService.class);
	
	@Autowired
	Autorizacion autorizacion;

	@Autowired
	PropertiesCulquiTest propertiesCulquiTest;
	
	CardBinlist cardBinlist;
	CardToken cardToken;
	Date fechaHora;
	private String FORMATO_FECHA;
	
	public Autorizacion generarTokenTarjeta(Card card, HttpHeaders headers) {
		String clave = "";
		clave = headers.get("clave").get(0);

		if(clave.equals("abc")){
			autorizacion.setValor(true);
		}else{
			autorizacion.setValor(false);
		}

		return autorizacion;
	}

}
