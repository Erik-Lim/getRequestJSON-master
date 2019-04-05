package com.example.getjson;

import android.os.AsyncTask;

import com.example.getjson.JsonIo;
import com.example.getjson.MainActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.security.cert.LDAPCertStoreParameters;

public class getJSON extends AsyncTask<Void, Void, Void> {

    String jsonString = "";
    String tokenString;
    String[] tokens;

    @Override
    protected Void doInBackground(Void... voids) {

        JSONObject obj = new JSONObject();

        try
        {
            obj.put("email", "abcdefg12@abcdefg12.com");
            obj.put("password", "abcdefg12");
        }
        catch (JSONException e) {
            e.printStackTrace();
        }

        tokenString = JsonIo.doJsonIo("https://trackdatcash.herokuapp.com/expenses/login", obj.toString());

        tokens = tokenString.split(" ", 2);

        tokens[1]

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        MainActivity.tvData.setText("Printing JSONArray: " + jsonArray.toString());
    }
}