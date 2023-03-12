package test.api.service;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class BaseService {

    private String baseUrl;
    private String apiKey;

    private final String API_KEY_NAME = "X-CMC_PRO_API_KEY";
    private final String BASE_URL = "https://pro-api.coinmarketcap.com";

    public BaseService(String baseUrl, String apiKey) {
        this.baseUrl = baseUrl;
        this.apiKey = apiKey;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }
}
