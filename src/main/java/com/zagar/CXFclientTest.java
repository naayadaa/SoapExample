package com.zagar;

import com.pegast.pegasys.api.*;

import java.net.URL;

/**
 * Created by naayadaa on 12.10.16.
 */
public class CXFclientTest {
    private static  final String apiUserKey = "26445187";
    private static  final String languageCode = "RU";


    public static void main(String[] args){

        PackageSearchService service = new PackageSearchService();
        IPackageSearchService port = service.getBasicHttpBindingIPackageSearchService();

        PackageSearchOptionsParameters parameters = new PackageSearchOptionsParameters();

        PackageSearchOptionsRequest request = new PackageSearchOptionsRequest();
       // request.setParameters();
       // PackageSearchOptionsResponse _getOptions__return = port.getOptions(_getOptions_parameters);
    }
}
