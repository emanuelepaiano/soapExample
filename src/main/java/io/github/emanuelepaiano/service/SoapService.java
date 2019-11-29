package io.github.emanuelepaiano.service;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.oxm.XmlMappingException;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Service
public class SoapService  extends WebServiceGatewaySupport {
	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(SoapService.class);
	
	/** The marshaller. */
	@Autowired
	private Jaxb2Marshaller marshaller;
	
	/**
	 * Send request.
	 *
	 * @param url the url
	 * @param request the request
	 * @param soapAction the soap action
	 * @return the object
	 * @throws XmlMappingException the xml mapping exception
	 */
	public ResponseEntity<Object> sendRequest(String url, Object request, String soapAction) {
		log.info("sendRequest: calling SOAP service " + url);
		Object response = getWebServiceTemplate().marshalSendAndReceive(url, request, new SoapActionCallback(soapAction));
		log.info("sendRequest: remote SOAP service " + url + " replied without errors");
		return getRestResponse(response);
	}
	
	/**
	 * Sets the up.
	 */
	@PostConstruct
	private void setUp() {
		this.setMarshaller(this.marshaller);
        this.setUnmarshaller(this.marshaller);
	}
	
	
	/**
	 * To rest response.
	 *
	 * @param soapResponse the soap response
	 * @return the response entity
	 */
	public static ResponseEntity<Object> getRestResponse(Object payload) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		ResponseEntity<Object> restResponse = new ResponseEntity<>(payload, headers, HttpStatus.OK);
		return restResponse;
	}

}

