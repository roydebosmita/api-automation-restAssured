package deckOfcardsAPI.deckOfcardsAPI;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetData {
	
	@BeforeTest
	public void testHTTPCode()
    {
        Response resp = RestAssured.get("https://deckofcardsapi.com/api/deck/new/");

        int code = resp.getStatusCode();

        System.out.println("Status code is " +code);

        Assert.assertEquals(code, 200);
    }
	
	@Test
	public void testResponseBody()
    {
        Response resp = RestAssured.get("https://deckofcardsapi.com/api/deck/new/");

        String data = resp.asString();

        System.out.println("Data is " + data);
        
        System.out.println("Response time " + resp.getTime()); 

     
    }
	
	@Test
	public void testAddedJokersUsingGETMethod()
    {
        Response getResp = RestAssured.get("https://deckofcardsapi.com/api/deck/new/?jokers_enabled=true");

        String jokers = getResp.asString();

        System.out.println("Data is " + jokers);
        
        System.out.println("Response time " + getResp.getStatusCode()); 

     
    }
	
	@Test
	public void testAddedJokersUsingPOSTMethod()
    {
        RequestSpecification request = RestAssured.given();
        
        request.headers("Content-Type", " application/json");
        
        JSONObject json = new JSONObject();
        json.put("jokers_enabled", true);
        
        request.body(json.toJSONString());
        
        Response postResponse = request.post("https://deckofcardsapi.com/api/deck/new");
       
        int statusCode = postResponse.getStatusCode();
        
        ResponseBody response = postResponse.getBody();
        
        System.out.println("Response is successful and has published the resource in the server " + statusCode);
        
    }
	
	@Test
	public void testDrawingOneCard()
    {
        Response drawResponsefor1Card = RestAssured.get("https://deckofcardsapi.com/api/deck/hs9q6ehv6qig/draw/");

        String oneCardDrawn = drawResponsefor1Card.asString();

        System.out.println("Data is " + oneCardDrawn);
        
        System.out.println("Response time " + drawResponsefor1Card.getStatusCode()); 

     
    }
	
	@Test
	public void testDrawingTwoCards()
    {
        Response drawResponsefor2Cards = RestAssured.get("https://deckofcardsapi.com/api/deck/w1o9rmwy9ub0/draw/?count=2");

        String twoCardsDrawn = drawResponsefor2Cards.asString();
        
        int responseCode = drawResponsefor2Cards.getStatusCode();

        System.out.println("Data is " + twoCardsDrawn);
        
        System.out.println("Response time " + drawResponsefor2Cards.getStatusCode()); 
        
        Assert.assertEquals(responseCode, 200);

     
    }
	
}
