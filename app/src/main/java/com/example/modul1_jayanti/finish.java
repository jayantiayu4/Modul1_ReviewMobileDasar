package com.example.modul1_jayanti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class finish extends AppCompatActivity {

    TextView username;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        username = (TextView)findViewById(R.id.username);
        Intent i = getIntent();
        String nama = i.getStringExtra("nama");
        //menampilkan data yg di inputkan di activity sebelumnya//
        username.setText(nama);

        button = (Button)findViewById(R.id.backbtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                biodata2();
            }
        });
    }

    public void biodata2(){
        Intent intent = new Intent(this, biodata2.class);
        startActivity(intent);
    }
}
