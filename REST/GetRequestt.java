package Com.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class GetRequestt {
    @Test
        public void test01() {
        Response response_code = get("https://reqres.in/api/users?page=2");
        System.out.println("Response_code" + response_code.getStatusCode());
        System.out.println("Response_Body" + response_code.getBody());
        System.out.println("Response_Time" + response_code.getTime());
        System.out.println("Response_Header" + response_code.getHeader("Content-Type"));
        int Status_code = response_code.getStatusCode();
        int expectedStatus_Code = 200;
        Assert.assertEquals(expectedStatus_Code, Status_code);
    }
    @Test
     public void test02(){
            baseURI="https://reqres.in/api/users?page=2";
            given().queryParam("page","2")
                    .when().get()
                    .then().statusCode(200);

        }


        }
  //  }

