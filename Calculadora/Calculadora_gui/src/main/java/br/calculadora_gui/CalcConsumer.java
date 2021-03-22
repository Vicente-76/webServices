/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calculadora_gui;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:CalculadoraRest
 * [calculadora/{v1}/{v2}]<br>
 * USAGE:
 * <pre>
 *        CalcConsumer client = new CalcConsumer();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Vicente Moraes
 */
public class CalcConsumer {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://desktop-t7792ea:8080/CalculadoraRest/resources/";

    public CalcConsumer(String v1, String v2) {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        String resourcePath = java.text.MessageFormat.format("calculadora/{0}/{1}", new Object[]{v1, v2});
        webTarget = client.target(BASE_URI).path(resourcePath);
    }

    public void setResourcePath(String v1, String v2) {
        String resourcePath = java.text.MessageFormat.format("calculadora/{0}/{1}", new Object[]{v1, v2});
        webTarget = client.target(BASE_URI).path(resourcePath);
    }

    /**
     * @param responseType Class representing the response
     * @return response object (instance of responseType class)
     */
    public <T> T getJson(Class<T> responseType) throws ClientErrorException {
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void close() {
        client.close();
    }
    
}
