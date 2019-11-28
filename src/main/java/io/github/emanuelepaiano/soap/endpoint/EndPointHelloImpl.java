package io.github.emanuelepaiano.soap.endpoint;

import javax.jws.WebService;

@WebService(endpointInterface = "io.github.emanuelepaiano.soap.endpoint.EndPointHello")
public class EndPointHelloImpl implements EndPointHello {

	@Override
	public String getHelloAsString(String name) {
		return "Hello - " + name;
	}
}
