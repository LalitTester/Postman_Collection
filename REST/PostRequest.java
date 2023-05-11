package Com.RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PostRequest {

@Test
    public void PostEx1(){
        //JSONObject jsonData=new JSONObject();
        JSONObject jsonData= new JSONObject();
        jsonData.put("name","Lalitk");
        jsonData.put("job","Automationm");
         RestAssured.baseURI="https://reqres.in/api/users";
         RestAssured.given()
            .header("Content-type","application/json")
            .contentType(ContentType.JSON)
                 .body(jsonData.toJSONString())
                 .when()
            .post().then().statusCode(201).log().all();


    }
}
