package org.zbm.acente.ws;

import javax.xml.namespace.QName;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.zbm.acente.ws.HelloWorldWS;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class HelloWorldWSIT {
 
    private HelloWorldWS testClient;
 
    @BeforeEach
    public void init(){
        JaxWsProxyFactoryBean jaxWsProxyFactory = new JaxWsProxyFactoryBean();
        jaxWsProxyFactory.setServiceClass(HelloWorldWS.class);
        jaxWsProxyFactory.setServiceName(new QName(
                "http://ws.soapcxfconsumer.cfxconsumer.com/",
                "HelloWorldWSImplService"
        ));
        jaxWsProxyFactory.setAddress("http://localhost:8080/ws/helloWorldWS");
        testClient = jaxWsProxyFactory.create(HelloWorldWS.class);
    }
 
    @Test
    void name() {
        System.out.println("soap response: "+ testClient.createMessage("General Kenobi"));
    }
}