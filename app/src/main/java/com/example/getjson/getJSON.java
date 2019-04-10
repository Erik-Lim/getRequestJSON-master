package com.example.getjson;

import android.os.AsyncTask;

import org.json.JSONException;
import org.json.JSONObject;

public class getJSON extends AsyncTask<Void, Void, Void> {

    String jsonString = "";
    JSONObject jsonArray;
    String tokens;

    @Override
    protected Void doInBackground(Void... voids) {

        JSONObject obj = new JSONObject();

        try
        {
            obj.put("email", "lexiitest@test.com");
            obj.put("password", "lexiitest");
        }
        catch (JSONException e) {
            e.printStackTrace();
        }

        jsonArray = getJsonObject.doJsonIo("https://trackdatcash.herokuapp.com/expenses/login", obj.toString());

        tokens = jsonArray.toString();

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        MainActivity.tvData.setText("Printing JSONArray: " + tokens);
    }
}