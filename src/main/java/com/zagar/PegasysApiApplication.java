package com.zagar;


import com.pegast.pegasys.api.*;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@SpringBootApplication
@ComponentScan("com.zagar")
@EnableAutoConfiguration
public class PegasysApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = SpringApplication.run(PegasysApiApplication.class, args);

		PegasPackageSearchClient client = app.getBean(PegasPackageSearchClient.class);

		/*PackageSearchParameters params = new PackageSearchParameters();
		params.setDepartureLocationId(1094);
		PackageSearchResponse resp = client.search(params);*/

		PackageSearchOptionsParameters parameters = new PackageSearchOptionsParameters();
       // EnumSet<PackageSearchOptionGroups> groups = EnumSet.of(PackageSearchOptionGroups.DIRECTIONS);

		parameters.setGroups(PackageSearchOptionGroups.DIRECTIONS);
        PackageSearchOptionsResponse response1 =  client.getOptions(parameters);
        List<PackageSearchDirectionOption> directions = response1.getResult().getSearchOptions().getDirections().getPackageSearchDirectionOption();
        PackageSearchDirectionOption directionOption = directions.get(0);

        System.out.println("Departure cities:");
        for(PackageSearchDirectionOption direction : directions){
            List<Location> locations = response1.getResult().getReferenceDescription().getLocations().getLocation();
            for (Location l : locations){
                if(l.getId().equals(direction.getDepartureLocationId())) {
                    System.out.println(l.getId() + " - " + l.getName());
                    break;
                }
            }
        }

        System.out.println("Countries:");
        for(PackageSearchDirectionOption direction : directions){
            List<Country> countries = response1.getResult().getReferenceDescription().getCountries().getCountry();
            for (Country c : countries){
                if(c.getId().equals(direction.getDestinationCountryId())) {
                    System.out.println(c.getId() + " - " + c.getName());
                    break;
                }
            }

        }

        parameters = new PackageSearchOptionsParameters();
        parameters.setDepartureLocationId(directionOption.getDepartureLocationId());
        parameters.setDestinationCountryId(directionOption.getDestinationCountryId());
        parameters.setReturnLocationId(directionOption.getReturnLocationId());
        GregorianCalendar minDepartDate = new GregorianCalendar();
        minDepartDate.setTime(new Date());

        GregorianCalendar maxDepartDate = new GregorianCalendar();
        maxDepartDate.setTime(new Date(1478728800000l));

        parameters.setMinOutgoingDate(new XMLGregorianCalendarImpl(minDepartDate));
        parameters.setMaxOutgoingDate(new XMLGregorianCalendarImpl(maxDepartDate));

        parameters.setGroups(PackageSearchOptionGroups.HOTEL_OPTIONS);


        PackageSearchOptionsResponse response = client.getOptions(parameters);
        List<Integer> packageTypeIds = response.getResult().getSearchOptions().getPackageTypeIds().getInt();

        for(Integer id : packageTypeIds){
            List<PackageType> packageTypes = response.getResult().getReferenceDescription().getPackageTypes().getPackageType();
            for (PackageType packageType : packageTypes){
                if(packageType.getId().equals(id)) {
                    System.out.println(packageType.getId() + " - " + packageType.getName());
                    break;
                }
            }

        }

        parameters = new PackageSearchOptionsParameters();
        parameters.setGroups(PackageSearchOptionGroups.PACKAGE_TYPES);
        response = client.getOptions(parameters);


        PackageSearchParameters packageSearchParameters = new PackageSearchParameters();
	}
}
