package com.project.databasefirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();
    private EditText et_nama,et_email;
    private TextView tv_status;
    private Button btn_save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_nama = (EditText) findViewById(R.id.et_nama);
        et_email = (EditText) findViewById(R.id.et_email);

        btn_save = (Button) findViewById(R.id.btn_save);
    }
}
