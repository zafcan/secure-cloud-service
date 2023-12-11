package org.zbm.acente.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface HelloWorldWS {
	@WebMethod
	String createMessage(@WebParam(name = "createMessageRequest", mode = WebParam.Mode.IN) String name);
}