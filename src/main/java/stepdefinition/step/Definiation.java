package stepdefinition.step;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.runner.RunWith;
import resources.APIResources;
import resources.TestDataBuild;
import resources.utils;
import java.io.IOException;

/***********************************************************************************************************************************************************************
 *Validate that the response is returned from get API successfully
 * by saving it in the "resp_Body"then assert that 200 response
 *Trace:Getallproducts_0001
 ************************************************************************************************************************************************************************/
@RunWith(Cucumber.class)
public class Definiation extends utils
{
    private static RequestSpecification res;
    private static ResponseSpecification resspec;
    private static  Response response;
    String PetID;
    TestDataBuild data = new TestDataBuild();

    @Given(":Add new pet {string} {string} {string} {string}")
    public void add_new_pet(String name, String ID, String CategoryName,String ps)  throws IOException
    {
        res=given().urlEncodingEnabled(false).spec(requestspecification())
                .body(data.addPet(name,ID,CategoryName,ps));

    }


    @When(": User call {string} API with a status using {string} HttP request")
    public void user_call_api_with_a_status_using_htt_p_request(String resource, String method)
    {
        APIResources resourceAPI= APIResources.valueOf(resource);
        resspec =new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
       if(method.equalsIgnoreCase("POST"))
            response =res.when().urlEncodingEnabled(false).post(resourceAPI.getResource());
       else if(method.equalsIgnoreCase("GET"))
            response =res.urlEncodingEnabled(false).when().get(resourceAPI.getResource()).andReturn();
       else if(method.equalsIgnoreCase("PUT"))
            response =res.when().urlEncodingEnabled(false).put(resourceAPI.getResource());
       else if(method.equalsIgnoreCase("DEL"))
           response =res.when().urlEncodingEnabled(false).delete(resourceAPI.getResource());
       else
       {
           System.out.println("api should be added in the enum");
       }

    }

    @Then(":Data is return successfully with all the available pets in the website with status code {int}")
     public void data_is_return_successfully_with_all_the_available_pets_in_the_website_with_status_code(int statusCode)
    {
        assertEquals(statusCode,response.getStatusCode());

    }

@Then("{string} in response body is {string}")
public void in_response_body_is(String keyValue, String Expectedvalue)
{

        {
            String resp = response.asString();
            JsonPath js = new JsonPath(resp);
            assertEquals(js.get(keyValue).toString(), Expectedvalue);
        }
    }


        @Given(":: Get all value for  pets where status equal to {string}")
        public void add_new_pet(String status)  throws IOException
        {
            res=given().urlEncodingEnabled(false).spec(requestspecification());

        }

    }


