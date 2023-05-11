package Com.RestAssured;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class DeleteRequest {
    @Test
    public void DeleteEx1(){
        RestAssured.baseURI="https://reqres.in/api/users/52";
        RestAssured.given()
                .when()
                .delete().then()
                .statusCode(204).log().all();
    }
}
