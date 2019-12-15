package com.example.modul1_jayanti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class biodata2 extends AppCompatActivity {

    Button button;
    EditText nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata2);

        button = (Button) findViewById(R.id.buten);
        nama = (EditText)findViewById(R.id.etnama);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), finish.class);
                i.putExtra("nama", nama.getText().toString());
                //putextra : untuk mengirim data "nama" ke aktivity yg dituju (finish)
                startActivity(i);
            }
        });
    }
}
