package com.example.alexandrup.ps_amd_dsl_basic_comp;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityFloatingLabels extends AppCompatActivity {

    private EditText etUsername, etPasswrod;
    private TextInputLayout inputLayoutName, inputLayoutPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_labels);

        inputLayoutName = (TextInputLayout) findViewById(R.id.inputLayoutUsername);
        inputLayoutPassword = (TextInputLayout) findViewById(R.id.inputLayoutPassword);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPasswrod = (EditText) findViewById(R.id.etPassword);

    }

    public void validateAndLogin(View view) {

        if(validateUsername() && validatePassword()){
            Toast.makeText(this, "Succesfuly logged in!", Toast.LENGTH_SHORT).show();
        }

    }

    private boolean validateUsername() {
        if(etUsername.getText().toString().isEmpty()){
            inputLayoutName.setError("Username cannot be blank");
            return false;
        } else {
            inputLayoutName.setErrorEnabled(false);
            return true;
        }
    }

    private boolean validatePassword() {

        String pwd = etPasswrod.getText().toString().trim();

        if(pwd.length() < 8){
            inputLayoutPassword.setError("Minimum 8 chars required");
            return false;
        } else {
            inputLayoutName.setErrorEnabled(false);
            return true;
        }
    }


}
