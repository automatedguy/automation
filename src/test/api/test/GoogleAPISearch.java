package test.api.test;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.customsearch.v1.Customsearch;
import com.google.api.services.customsearch.v1.model.Result;
import com.google.api.services.customsearch.v1.model.Search;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GoogleAPISearch {

    private static final String APPLICATION_NAME = "Google Search";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String API_KEY = "AIzaSyDx0GTLtTsZPD8fluo8p_CFCLzk-dp7rpU";
    private static final String SEARCH_ENGINE_ID = "1a7f27de3c6f05e66";
    private static int NUMBER_OF_RESULTS = 10;

    @Test
    public void googleApiSearch() throws Exception {
        // Build the Customsearch object
        Customsearch customsearch = new Customsearch.Builder(
                GoogleNetHttpTransport.newTrustedTransport(), JSON_FACTORY, null)
                .setApplicationName(APPLICATION_NAME)
                .build();

        // Build the search request
        Customsearch.Cse.List list = customsearch.cse().list()
                .setKey(API_KEY)
                .setCx(SEARCH_ENGINE_ID)
                .setNum(NUMBER_OF_RESULTS)
                .setQ("selenium");

        // Execute the search request and get the results
        Search search = list.execute();
        List<Result> items = search.getItems();

        // Print out the results and assert that they are not null
        for (Result item : items) {
            System.out.println(item.getHtmlTitle());
            Assert.assertNotNull(item.getHtmlTitle());
            System.out.println(item.getLink());
            Assert.assertNotNull(item.getLink());
            System.out.println(item.getFormattedUrl());
            Assert.assertNotNull(item.getFormattedUrl());
            System.out.println(item.getHtmlSnippet());
            Assert.assertNotNull(item.getHtmlSnippet());
            System.out.println();
        }
    }
}
