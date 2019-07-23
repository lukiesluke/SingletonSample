package com.lwg.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button save;
    Button new_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        new_activity = findViewById(R.id.new_activity);
        save = findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString().isEmpty()) {
                    editText.setError("Enter text");
                }else{
                    String editValue = editText.getText().toString();
                    SingleTonExample singletonexample = SingleTonExample.getInstance();
                    singletonexample.setText(editValue);
                    Toast.makeText(MainActivity.this,singletonexample.getText(), Toast.LENGTH_LONG).show();
                }
            }
        });

        new_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
    }
}
