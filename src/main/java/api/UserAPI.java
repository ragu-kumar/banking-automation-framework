package api;

public class UserAPI {

    public static void validateUser() {
        BaseAPI.request()
                .baseUri("https://jsonplaceholder.typicode.com/users/1")
                .when()
                .get()
                .then()
                .statusCode(200);
    }
}