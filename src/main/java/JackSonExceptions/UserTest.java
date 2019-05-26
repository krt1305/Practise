package JackSonExceptions;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserTest {

    ObjectMapper mapper=new ObjectMapper();
    @Test
    public void givenDefaultConstructor_whenDeserializing_thenCorrect()
    {
        User user = null;

        String json = "{\"id\":1,\"name\":\"John\"}";

        try {
            user=mapper.readValue(json,User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("User name "+user.name);
        //This exception is thrown if Jackson can’t access the constructor.
        //
        //In the following example – class User doesn’t have a default constructor:
    }

    @Test
    public void givenClassWithPrivateFields_whenSerializing_thenException()
    {
        //JsonMappingException: No serializer found for class
        UserWithPrivateFields user;
        user=new UserWithPrivateFields(1,"John");
        try {
            mapper.writer().writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        //mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);

        //Error:om.fasterxml.jackson.databind.exc.InvalidDefinitionException: No serializer found for class JackSonExceptions.UserWithPrivateFields
        // and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)
    }

    //JsonMappingException: Can not deserialize instance of
    //Next – let’s take a look at JsonMappingException: Can not deserialize instance of.
    //
    //This exception is thrown if the wrong type is used while deserializing.
    @Test(expectedExceptions = JsonMappingException.class)
    public void givenJsonOfArray_whenDeserializing_thenException()
            throws JsonProcessingException, IOException {

        String json = "[{\"id\":1,\"name\":\"John\"},{\"id\":2,\"name\":\"Adam\"}]";
        ObjectMapper mapper = new ObjectMapper();
        mapper.reader().forType(User.class).readValue(json);
    }

    @Test
    public void givenJsonStringWithExtra_whenConfigureDeserializing_thenCorrect()
            throws IOException {
        String json = "{\"id\":1,\"name\":\"John\", \"checked\":true}";
        User user = mapper.reader().forType(User.class).readValue(json);
        Assert.assertEquals("John", user.name);

        //This exception is thrown if there is an unknown property in the JSON String while deserializing.
       /* com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException:
        Unrecognized field "checked" (class org.baeldung.jackson.dtos.User),
        not marked as ignorable (2 known properties: "id", "name"])*/

       //to solve use mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

    }


    @Test
    public void givenStringWithSingleQuotes_whenDeserializing_thenException()
            throws JsonProcessingException, IOException {

        String json = "{'id':1,'name':'John'}";
        ObjectMapper mapper = new ObjectMapper();

        mapper.reader()
                .forType(User.class).readValue(json);
        //This exception is thrown if the JSON String to be deserialized contains single quotes instead of double quotes.

        //ERROR -com.fasterxml.jackson.core.JsonParseException: Unexpected character (''' (code 39)): was expecting double-quote to start field name
        //solution :
        /*
        JsonFactory factory = new JsonFactory();
    factory.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
    ObjectMapper mapper = new ObjectMapper(factory);
         */

    }

}
