package com.zagar;


import com.zagar.wsdl.PackageSearchOptionsParameters;
import com.zagar.wsdl.PackageSearchOptionsRequest;
import com.zagar.wsdl.PackageSearchOptionsResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;



/**
 * Created by naayadaa on 12.10.16.
 */
//@Service
public class PegasSpringClient extends WebServiceGatewaySupport {
   // @Value("${wsdl.url}")
    private String uri = "https://api-ext-test.pegasys.pegast.com/PackageSearch.svc";

  //  @Value("${pegas.getOptions}")
    private String getOptionsUri = "http://pegast.com/pegasys/api/IPackageSearchService/GetOptions";

    public PackageSearchOptionsResponse packageSearchOptions(){
        PackageSearchOptionsRequest req = new PackageSearchOptionsRequest();
        PackageSearchOptionsParameters params = new PackageSearchOptionsParameters();

        req.setParameters(params);

        PackageSearchOptionsResponse res = (PackageSearchOptionsResponse) getWebServiceTemplate()
                .marshalSendAndReceive(uri, req, new SoapActionHeadersCallback(getOptionsUri));

        return res;
    }
}
