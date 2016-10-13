package com.zagar;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.SoapMessage;

import javax.xml.namespace.QName;
import java.io.IOException;

/**
 * Created by naayadaa on 13.10.16.
 */
public class SoapActionHeadersCallback  implements WebServiceMessageCallback {
    private final String soapAction;

    public SoapActionHeadersCallback(String soapAction) {
        if(!StringUtils.hasText(soapAction)) {
            soapAction = "\"\"";
        }

        this.soapAction = soapAction;
    }

    public void doWithMessage(WebServiceMessage message) throws IOException {
        Assert.isInstanceOf(SoapMessage.class, message);
        SoapMessage soapMessage = (SoapMessage)message;
        soapMessage.setSoapAction(this.soapAction);

        SoapHeaderElement headerElement =
                soapMessage.getSoapHeader().addHeaderElement(new QName("http://pegast.com/pegasys/api", "ApiUserKey"));
        headerElement.setText("Adjd1hvTXFp7ADS9GDRbRg==");

    }
}