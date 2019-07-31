package KurtosysAPI.KurtosysAPI;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PropertiesHub {

	public void PropHub()
	{
		// Get the baseURI
		RestAssured.baseURI = "https://api.kurtosys.io/tools/ksys373/api/fund/searchentity?data-version=1562843391575&req=%7B%22type%22%3A%22CLSS%22%2C%22search%22%3A%5B%7B%22property%22%3A%22core_holding_id%22%2C%22values%22%3A%5B%22GEMRE%22%5D%2C%22matchtype%22%3A%22MATCH%22%7D%2C%7B%22property%22%3A%22core_holding_id%22%2C%22values%22%3A%5B%22GEMRE%22%5D%2C%22matchtype%22%3A%22MATCH%22%7D%5D%2C%22include%22%3A%7B%22allocations%22%3A%7B%7D%2C%22statistics%22%3A%7B%7D%2C%22timeseries%22%3A%7B%7D%7D%2C%22culture%22%3A%22en-GB%22%2C%22applyFormats%22%3Afalse%2C%22limit%22%3A0%2C%22fundList%22%3A%22Institutional_NL%22%7D";

		/// HTTP request Object
		RequestSpecification httpRequest = RestAssured.given();
		
		///Response Object
		Response response  = httpRequest.request(Method.GET, "/properties_pub");
	
		// Print the response
		String responseBody = response.getBody().asString();
		System.out.println("response body is" + responseBody);
		Assert.assertNotNull(responseBody);

	}	
	}

