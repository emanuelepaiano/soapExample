package io.github.emanuelepaiano.demo;



import javax.xml.ws.Endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.emanuelepaiano.soap.endpoint.EndPointHelloImpl;

@SpringBootApplication
public class RestSoapExampleApplication {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/hello", new EndPointHelloImpl());
		SpringApplication.run(RestSoapExampleApplication.class, args);
	}

}
