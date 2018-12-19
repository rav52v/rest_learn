package Rest_Assured;

import com.google.gson.JsonObject;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;

public class JsonPlaceholderService {

    public JsonPlaceholderService(){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    public String getMaxUserIdVal(){
        Response response = given()
                .when()
                .get("/posts")
                .thenReturn();
        return response
                .jsonPath()
                .get("userId.max()")+"";
    }

    public String getMaxPostIdValForUserId(String userId){
        Response response = given()
                .when()
                .get("/posts?userId=" + userId)
                .thenReturn();
        return response
                .jsonPath()
                .get("id.max()")+"";
    }

    public void addCommentForPostId(String postId){
        JsonObject object = new JsonObject();
        object.addProperty("postId", postId);
        object.addProperty("name", "MyNameIs");
        object.addProperty("email", "prettyFunny@one.com");
        object.addProperty("body", "Quick comment check.");

        given()
                .request()
                .accept("application/json")
                .body(object.toString())
                .when()
                .post("/comments")
                .then()
                .assertThat()
                .statusCode(201);
    }

}
