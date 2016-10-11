package com.zagar;


/*
import com.pegast.pegasys.api.*;
import com.zagar.axis2.client.PackageSearchServiceStub;
import org.apache.axis2.AxisFault;


import java.rmi.RemoteException;
*/

/**
 * Created by naayadaa on 10.10.16.
 */
public class PegasAxisClient {
    /*private static  final String apiUserKey = "26445187";
    private static  final String languageCode = "RU";

    public static void main(String[] args) {
        String endpoint = "https://api-ext-test.pegasys.pegast.com/PackageSearch.svc";

        try {
            PackageSearchServiceStub packageSearchServiceStub = new PackageSearchServiceStub();
            PackageSearchOptionsRequestDocument req = PackageSearchOptionsRequestDocument.Factory.newInstance();
            ApiUserKeyDocument apiKey = ApiUserKeyDocument.Factory.newInstance();
            apiKey.setApiUserKey(apiUserKey);
            PackageSearchOptionsParameters parameters = PackageSearchOptionsParameters.Factory.newInstance();

            req.getPackageSearchOptionsRequest().setParameters(parameters);
            PreferredLanguageCodeDocument languageCodeDocument = PreferredLanguageCodeDocument.Factory.newInstance();
            languageCodeDocument.setPreferredLanguageCode(languageCode);
            PackageSearchOptionsResponseDocument res = packageSearchServiceStub.getOptions(req, apiKey, languageCodeDocument);

            res.getPackageSearchOptionsResponse();
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }


    }*/
}
