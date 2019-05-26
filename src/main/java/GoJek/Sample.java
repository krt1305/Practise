package GoJek;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class Sample {

    public static void main(String[] args) throws IOException {
        BufferedReader br=null;
        BufferedReader br1=null;
        Response response;
        ObjectMapper mapper=new ObjectMapper();
        String respAsString1 = null,respAsString2=null;
        JsonNode root=null;

        try {
             br=new BufferedReader(new FileReader("/Users/rabia/Desktop/file2.txt"));
             br1=new BufferedReader(new FileReader("/Users/rabia/Desktop/file1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(br.ready())
        {
            RestAssured.baseURI=br.readLine();
            System.out.println("Req1 is "+br.readLine());
            response = given().when().get().then().extract().response();
            respAsString1=response.getBody().asString();
            System.out.println("Response 1 is "+respAsString1);
            root=mapper.readTree(respAsString1);



        }

        while(br1.ready())
        {

            RestAssured.baseURI=br1.readLine();
            System.out.println("Req2 is "+br1.readLine());
            response = given().when().get().then().extract().response();
            respAsString2=response.getBody().asString();
            System.out.println("Response 2 is "+respAsString2);
            root=mapper.readTree(respAsString2);

        }


        System.out.println("Response equal ? "+respAsString1.equals(respAsString2));
    }
}
