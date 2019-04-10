package com.example.getjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    Button btnButton;

    public static TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnButton = (Button) findViewById(R.id.btnButton);
        tvData = (TextView) findViewById(R.id.tvData);

        JSONObject obj = new JSONObject();

        try
        {
            obj.put("email", "lexiitest@test.com");
            obj.put("password", "lexiitest");
        }
        catch (JSONException e) {
            e.printStackTrace();
        }

        final JSONObject jsonArray = getJsonObject.doJsonIo("https://trackdatcash.herokuapp.com/expenses/login", obj.toString());


        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                com.example.getjson.getJSON process = new com.example.getjson.getJSON();
//
//                process.execute();
                tvData.setText(jsonArray.toString());

            }
        });
    }
}
