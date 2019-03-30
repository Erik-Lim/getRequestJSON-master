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
    JSONArray jsonArray;

    @Override
    protected Void doInBackground(Void... voids) {

        JSONObject obj = new JSONObject();

        try
        {
            obj.put("userId", "5c78ce86a484a23550339d6a");
        }
        catch (JSONException e) {
            e.printStackTrace();
        }

        jsonArray = JsonIo.doJsonIo("http://trackdatcash.herokuapp.com/expenses/all", obj.toString());

//        while( counter != jsonObject.length()) {
//
//            String description = jo.put("firstName", "John");
//            String bakkle = jo.put("lastName", "Doe");
//        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        MainActivity.tvData.setText("Printing JSONArray: " + jsonArray.toString());
    }
}