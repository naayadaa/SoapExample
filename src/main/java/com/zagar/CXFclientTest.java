package com.zagar;

import com.pegast.pegasys.api.*;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by naayadaa on 12.10.16.
 */
public class CXFclientTest {
    private static  final String API_USER_KEY = "Adjd1hvTXFp7ADS9GDRbRg==";
    private static  final String LANGUAGE_CODE = "RU";


    public static void main(String[] args) throws JAXBException {

        PackageSearchService service = new PackageSearchService();
        IPackageSearchService port = service.getBasicHttpBindingIPackageSearchService();

        Map<String, Object> requestContext = ((BindingProvider)port).getRequestContext();
      /*  Map<String, Object> headers = new HashMap();
        List<String> apiUserKey = new ArrayList<>();
        apiUserKey.add(API_USER_KEY);
        List<String> languageCode = new ArrayList<>();
        languageCode.add(LANGUAGE_CODE);
        headers.put("ApiUserKey", apiUserKey);
        headers.put("PreferredLanguageCode", languageCode);
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS,headers);*/

        List<Header> headers = new ArrayList<>();
        Header apiUserKey = new Header(new QName("http://pegast.com/pegasys/api", "ApiUserKey"), API_USER_KEY, new JAXBDataBinding(String.class));
        Header languageCode = new Header(new QName("http://pegast.com/pegasys/api", "PreferredLanguageCode"), LANGUAGE_CODE, new JAXBDataBinding(String.class));

        headers.add(apiUserKey);
        headers.add(languageCode);
        requestContext.put(Header.HEADER_LIST, headers);


        PackageSearchOptionsParameters parameters = new PackageSearchOptionsParameters();
        //parameters.setDepartureLocationId();
        PackageSearchOptionsRequest request = new PackageSearchOptionsRequest();
        request.setParameters(parameters);
        PackageSearchOptionsResponse response = port.getOptions(request);
        response.toString();
    }
}
