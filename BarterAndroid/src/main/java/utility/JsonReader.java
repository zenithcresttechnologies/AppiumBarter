package utility;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonReader {

    public static Object[][] getJSONdata(String JSON_path, String JSON_Data, int JSON_attributes) throws IOException, ParseException {
        Object object = new JSONParser().parse(new FileReader((JSON_path)));
        JSONObject jsonObject = (JSONObject) object;
        JSONArray jsonArray = (JSONArray) jsonObject.get(JSON_Data);


        Object[][] array = new String[jsonArray.size()][JSON_attributes];
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject1 = (JSONObject) jsonArray.get(i);
            array[i][0] = String.valueOf(jsonObject1.get("validEmail"));
            array[i][1] = String.valueOf(jsonObject1.get("validPhoneNumber"));
            array[i][2] = String.valueOf(jsonObject1.get("OTP"));
            array[i][3] = String.valueOf(jsonObject1.get("fullName"));
            array[i][4] = String.valueOf(jsonObject1.get("validPassword"));
            array[i][5] = String.valueOf(jsonObject1.get("cardNumber"));
            array[i][6] = String.valueOf(jsonObject1.get("cardExpiry"));
            array[i][7] = String.valueOf(jsonObject1.get("cvv"));
        }

        for (int i = 1; i < jsonArray.size(); i++) {
            JSONObject jsonObject1 = (JSONObject) jsonArray.get(i);
            array[i][0] = String.valueOf(jsonObject1.get("wrongPhoneNumber"));
            array[i][1] = String.valueOf(jsonObject1.get("wrongPin"));
        }
        return array;
    }
}
