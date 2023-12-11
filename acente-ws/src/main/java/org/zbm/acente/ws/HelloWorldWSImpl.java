package org.zbm.acente.ws;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldWSImpl implements HelloWorldWS{
    @Override
    public String createMessage(String name){
        return "Hello "+name;
    }
}