package Com.RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutRequest {
   @Test
    public void PutEx1(){
       JSONObject jsonData= new JSONObject();
       jsonData.put("name","Lalitkumar");
       jsonData.put("job","AutomationTester");
       RestAssured.baseURI="https://reqres.in/api/users/52";
       RestAssured.given().header("Content-type","application/json")
               .contentType(ContentType.JSON)
               .body(jsonData.toJSONString())
               .when()
               .put().then().statusCode(200).log().all();

    }
}
