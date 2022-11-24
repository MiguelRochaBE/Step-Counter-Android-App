package com.example.stepncount;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConfigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);
    }


    public void onBtnClick (View view) {
        TextView txtSex = findViewById(R.id.textView1);
        TextView txtBirth = findViewById(R.id.textView2);
        TextView txtWeight = findViewById(R.id.textView3);
        TextView txtHeight = findViewById(R.id.textView4);
        TextView txtStepWeight = findViewById(R.id.textView5);

        EditText edtTxtSex= findViewById(R.id.editTxt1);
        EditText edtTxtBirth = findViewById(R.id.editTxt2);
        EditText edtTxtWeight = findViewById(R.id.editTxt3);
        EditText edtTxtHeight = findViewById(R.id.editTxt4);
        EditText edtTxtStepWeight = findViewById(R.id.editTxt5);


    }
    //when the user clicks on the "continue" button it goes to the main activity
    public void openMainPage(View view){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}