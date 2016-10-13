package com.zagar;

import com.pegast.pegasys.api.*;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by naayadaa on 13.10.16.
 */
public class PegasPackageSearchClient {

    private PackageSearchService service;

    private IPackageSearchService port;

    public PegasPackageSearchClient(String apiUserKey, String languageCode) {
        service = new PackageSearchService();
        port = service.getBasicHttpBindingIPackageSearchService();
        setHeadersToRequestContext(apiUserKey, languageCode);
    }

    private void setHeadersToRequestContext(String apiUserKey, String languageCode) {
        Map<String, Object> requestContext = ((BindingProvider)port).getRequestContext();

        try {
            List<Header> headers = new ArrayList<>();
            Header apiUserKeyHeader = new Header(
                    new QName("http://pegast.com/pegasys/api", "ApiUserKey"), apiUserKey, new JAXBDataBinding(String.class));
            Header languageCodeHeader = new Header(
                    new QName("http://pegast.com/pegasys/api", "PreferredLanguageCode"), languageCode, new JAXBDataBinding(String.class));

            headers.add(apiUserKeyHeader);
            headers.add(languageCodeHeader);
            requestContext.put(Header.HEADER_LIST, headers);
        }catch (JAXBException e){
            System.err.println("Headers for Pegas PackageSearchService are not added");
        }
    }

    public PackageSearchOptionsResponse getOptions(PackageSearchOptionsParameters parameters){
        PackageSearchOptionsRequest request = new PackageSearchOptionsRequest();
        request.setParameters(parameters);
        return port.getOptions(request);
    }

    public GetDetailedSearchResultItemResponse getDetailedSearchResultItem(GetDetailedSearchResultItemParameters parameters){
        GetDetailedSearchResultItemRequest request = new GetDetailedSearchResultItemRequest();
        request.setParameters(parameters);
        return port.getDetailedSearchResultItem(request);
    }
    public PackagePriceDynamicResponse getPriceDynamic(PackagePriceDynamicParameters parameters){
        PackagePriceDynamicRequest request = new PackagePriceDynamicRequest();
        request.setParameters(parameters);
        return port.getPriceDynamic(request);
    }

    public PackageSearchResponse search(PackageSearchParameters parameters){
        PackageSearchRequest request = new PackageSearchRequest();
        request.setParameters(parameters);
        return port.search(request);
    }


}
