package org.zbm.acente.config;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.zbm.acente.ws.HelloWorldWS;

import jakarta.xml.ws.Endpoint;
import lombok.RequiredArgsConstructor;
 
@Configuration
@ImportResource({ "classpath:META-INF/cxf/cxf.xml" })
@RequiredArgsConstructor
public class CxfWebServiceConfig {

	private final Bus cxfBus;
 
    @Bean
    public ServletRegistrationBean cxfServlet() {
        org.apache.cxf.transport.servlet.CXFServlet cxfServlet = new org.apache.cxf.transport.servlet.CXFServlet();
        ServletRegistrationBean servletDef = new ServletRegistrationBean<>(cxfServlet, "/ws/*");
        servletDef.setLoadOnStartup(1);
        return servletDef;
    }
 
    @Bean
    public Endpoint helloWorldWebService(HelloWorldWS helloWorldWS) {
        EndpointImpl endpoint = new EndpointImpl(cxfBus, helloWorldWS);
        endpoint.setAddress("/helloWorldWS");
        endpoint.publish();
        return endpoint;
    }
}