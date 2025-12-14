package com.example.fuelstation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CreateAccountActivity extends AppCompatActivity {

    EditText etFullName, etEmail, etPhone, etPassword;
    Button btnCreate;
    TextView tvSignIn;
    ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        // Bind Views (FIXED)

        etFullName = findViewById(R.id.etFullName);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);
        etPassword = findViewById(R.id.etPassword);
        btnCreate = findViewById(R.id.btnCreate);
        tvSignIn = findViewById(R.id.tvSignIn);

        // Back button
        btnBack.setOnClickListener(v -> finish());

        // Create Account button
        btnCreate.setOnClickListener(v -> createAccount());

        // Sign In text click
        tvSignIn.setOnClickListener(v -> {
            Intent intent = new Intent(CreateAccountActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
    }

    private void createAccount() {

        String fullName = etFullName.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String phone = etPhone.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        if (fullName.isEmpty()) {
            etFullName.setError("Enter full name");
            return;
        }

        if (email.isEmpty()) {
            etEmail.setError("Enter email");
            return;
        }

        if (phone.isEmpty()) {
            etPhone.setError("Enter phone number");
            return;
        }

        if (password.isEmpty()) {
            etPassword.setError("Enter password");
            return;
        }

        if (password.length() < 6) {
            etPassword.setError("Password must be at least 6 characters");
            return;
        }

        Toast.makeText(this,
                "Account Created Successfully",
                Toast.LENGTH_LONG).show();

        startActivity(new Intent(CreateAccountActivity.this, LoginActivity.class));
        finish();
    }
}
