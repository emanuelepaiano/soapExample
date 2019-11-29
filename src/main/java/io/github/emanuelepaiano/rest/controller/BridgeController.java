package io.github.emanuelepaiano.rest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.emanuelepaiano.service.SoapService;
import io.github.emanuelepaiano.soap.ws.jaxws.GetHelloAsString;
import io.github.emanuelepaiano.soap.ws.jaxws.ObjectFactory;

@RestController
@RequestMapping("/rest")
public class BridgeController {
	
	@Autowired
	private SoapService soapService;
	
	private ObjectFactory objectFactory = new ObjectFactory();
	
	@GetMapping("/hello/{name}")
	public ResponseEntity<Object> helloRest(HttpServletRequest request, @PathVariable("name") String name) {
		GetHelloAsString helloRequest = objectFactory.createGetHelloAsString();
		helloRequest.setArg0(name);
		return soapService.sendRequest("http://localhost:9999/ws/hello?wsdl", helloRequest, "");
	}

}
