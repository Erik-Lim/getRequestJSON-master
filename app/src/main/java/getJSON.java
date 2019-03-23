package com.example.getjson;

import android.os.AsyncTask;

import com.example.getjson.JsonIo;
import com.example.getjson.MainActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.security.cert.LDAPCertStoreParameters;

public class getJSON extends AsyncTask<Void, Void, Void> {

    String jsonData = "";
    @Override
    protected Void doInBackground(Void... voids) {

        JSONObject obj = new JSONObject();

        try
        {
            obj.put("username", "y");
            obj.put("password", "y");
        }
        catch (JSONException e) {
            e.printStackTrace();
        }

        JSONObject ret = JsonIo.doJsonIo("http://largeproject-testing-app.herokuapp.com/expenses/loginUser", obj.toString());

        try
        {
            jsonData = ret.toString();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        MainActivity.data.setText(jsonData + " finished");
    }
}