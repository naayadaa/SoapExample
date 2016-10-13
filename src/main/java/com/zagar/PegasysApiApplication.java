package com.zagar;


import com.pegast.pegasys.api.PackageSearchOptionsParameters;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

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
	}
}
