package Com.RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class QueryParameterDemo {
    @Test
    public void Demo(){
        RequestSpecification requestSpecification= RestAssured.given();
        requestSpecification.baseUri("https://reqres.in");
        requestSpecification.basePath("api/users");
        requestSpecification.queryParam("page",2);
        Response response=requestSpecification.get();
        ResponseBody responseBody=response.getBody();
        String responseString =responseBody.asString();
        System.out.println(responseString);
    }
    @Test

    public void Ex2(){
        RequestSpecification requestSpecification= RestAssured.given();
        requestSpecification.baseUri("https://reqres.in");
        requestSpecification.basePath("api/users");
        requestSpecification.queryParam("page",2).queryParam("id",10);
        Response response=requestSpecification.get();
        ResponseBody responseBody=response.getBody();
        String responseString =responseBody.asString();
        System.out.println(responseString);
    }
}
