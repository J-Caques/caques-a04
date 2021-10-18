package baseline;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.Map;


class ReadFileTest {

    @Test
    void read(){
        Gson gson = new Gson();
        String name = null;

        try{
            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("data/exercise44_input.json"));

            JsonObject obj = gson.fromJson(reader, JsonObject.class);
            JsonArray array = obj.getAsJsonArray("products");

            // print map entries
            for (int i=0;i<array.size();i++){
                JsonObject products =(JsonObject) array.get(i);

                name =products.get("name").toString();
                String price =products.get("price").toString();
                String quantity =products.get("quantity").toString();

                System.out.println("Name" + name);
                System.out.println("Price" + price);
                System.out.println("Quantity" + quantity);
            }
            Assertions.assertTrue(array.isJsonArray());

            // close reader
            reader.close();

        }

        catch (IOException e){
            e.printStackTrace();
        }

    }


}