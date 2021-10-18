package baseline;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ReadFile {

    protected String read(String product) {
        String s = null;

        Gson gson = new Gson();

        try {
            //   Read product name, along w/ price & quantity, from file "exercise44_input.json"
            Reader reader = Files.newBufferedReader(Paths.get("data/exercise44_input.json"));

            JsonObject obj = gson.fromJson(reader, JsonObject.class);
            JsonArray array = obj.getAsJsonArray("products");


            for (int i = 0; i < array.size(); i++) {
                JsonObject products = (JsonObject) array.get(i);

                String name = products.get("name").toString();
                String price = products.get("price").toString();
                String quantity = products.get("quantity").toString();

                    //Once product found, output: Name, Price, & Quantity
                    if (product.equals(String.valueOf(name))) {
                        s = "Name: " + name + "\n" + "Price: " + price + "\n" + "Quantity: " + quantity + "\n";
                        break;

                    }
                    //If product not found:" Sorry that product was not found in our inventory."
                    else
                    {
                        s = "Sorry, product not found in inventory";
                    }

            }

            // close reader
            reader.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}





