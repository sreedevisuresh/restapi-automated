package APITesting.com.org.api;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.RequestSpecification;
import com.jayway.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.StringContains;

public class APITest {

	private Response response;
	private String Url = "https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false";
	private String Name = "Carbon credits";
	private boolean CanRelist = true;
	private String Description = "Good position in category";
	static final String JSON_PATH = "Promotions.findAll { it.Name == 'Gallery'}.Description[0]";

	@BeforeTest
	public void con() {
		RestAssured.baseURI = Url;
		RequestSpecification httpRequest = RestAssured.given();
		response = httpRequest.get();

	}

	@Test(priority = 0)
	public void Test() {

		response.then().contentType(ContentType.JSON).assertThat().statusCode(200).body("Name", equalTo(Name))
				.body("CanRelist", IsEqual.equalTo(CanRelist)).body(JSON_PATH, new StringContains(Description));
	}

}
