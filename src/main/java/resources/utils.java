package resources;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.io.*;
import java.util.Properties;

public class utils<Public>
{

    public static RequestSpecification req;


    public RequestSpecification requestspecification() throws IOException {
   if(req==null)
   {
         //Add the Logs in a new file
           PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
           req = new RequestSpecBuilder().setBaseUri(getGlobalValue("baseURL")).addQueryParam(getGlobalValue("status"))
            .addFilter(RequestLoggingFilter.logRequestTo(log))
            .addFilter(ResponseLoggingFilter.logResponseTo(log))
            .setContentType(ContentType.fromContentType("application/json")).build();


       return req;
  }
        return req;
    }
    /*
    * Trace:
    * Desc:Read the URL from the file
    * Static class-> to access directing without creating an  object
    * */
        public static String getGlobalValue(String key) throws IOException
        {
          //prop will scan all the files
            Properties prop =new Properties();
            //Get the URL by reading from global.prop
            FileInputStream fis =new FileInputStream("D:\\Adadis_task\\untitled\\Petstore\\src\\main\\java\\resources\\global.properties");
            //point on a specific file
            prop.load(fis);
            //Pass the baserl
           return prop.getProperty(key);

        }
        //get any key value in the Json's Response
        public String getJsonPath(Response response,String key)
        {
            String resp=response.asString();
            JsonPath   js = new JsonPath(resp);
            return js.get(key).toString();
        }

}
