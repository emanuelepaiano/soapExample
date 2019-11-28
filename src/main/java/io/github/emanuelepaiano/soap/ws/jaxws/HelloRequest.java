package io.github.emanuelepaiano.soap.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getHelloAsString", namespace = "https://emanuelepaiano.github.io/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHelloAsString", namespace = "https://emanuelepaiano.github.io/")
public class HelloRequest {
	 	@XmlElement(name = "name", namespace = "")
	    private String name;

	    /**
	     * 
	     * @return
	     *     returns String
	     */
	    public String getName() {
	        return this.name;
	    }

	    /**
	     * 
	     * @param arg0
	     *     the value for the arg0 property
	     */
	    public void setName(String name) {
	        this.name = name;
	    }
}
