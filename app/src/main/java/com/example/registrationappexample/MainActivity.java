package com.example.registrationappexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickButton(View view){

        TextView txtName = findViewById(R.id.txtName);
        EditText editTxtName = findViewById(R.id.editTxtName);
        txtName.setText("FirstName: "+ editTxtName.getText().toString());

        TextView txtSurname = findViewById(R.id.txtSurname);
        EditText editTxtSuranme = findViewById(R.id.editTxtSurname);
        txtSurname.setText("Last Name: " + editTxtSuranme.getText().toString());

        TextView txtEmail = findViewById(R.id.txtEmail);
        EditText editTxtEmail = findViewById(R.id.editTxtEmail);
        txtEmail.setText("Email: " + editTxtEmail.getText().toString() );

    }
}