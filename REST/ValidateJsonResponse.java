package Com.RestAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateJsonResponse {
    @Test
    public void Ex1(){
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.baseUri("https://reqres.in");
        requestSpecification.basePath("api/users?page=2");
        Response response=requestSpecification.get();
        ResponseBody responseBody=response.getBody();
        String responseString =responseBody.asString();
        System.out.println(responseString);
        // check for presensce of george in response body

        Assert.assertEquals(responseString.contains("George"),true,"check for presence of george");
        // get json path view of response body

        JsonPath JsonPathView =responseBody.jsonPath();
        String Firstname= JsonPathView.get("data[0].first_name");
        Assert.assertEquals(Firstname,"George","Check for response body");
    }

}
