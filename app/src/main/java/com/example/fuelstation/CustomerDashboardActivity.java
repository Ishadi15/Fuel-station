package com.example.fuelstation;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CustomerDashboardActivity extends AppCompatActivity {

    TextView txtUserName, txtBalance;
    Button btnTopUp;
    ImageButton btnNotification, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_dashboard);

        txtUserName = findViewById(R.id.txtUserName);
        txtBalance = findViewById(R.id.txtBalance);
        btnTopUp = findViewById(R.id.btnTopUp);

        btnNotification = findViewById(R.id.btnNotification);
        btnLogout = findViewById(R.id.btnLogout);

        txtUserName.setText(getString(R.string.sample_username));
        txtBalance.setText(getString(R.string.sample_balance));

        btnTopUp.setOnClickListener(v ->
                Toast.makeText(this, "Top Up Clicked", Toast.LENGTH_SHORT).show()
        );

        btnNotification.setOnClickListener(v ->
                Toast.makeText(this, "Notifications", Toast.LENGTH_SHORT).show()
        );

        btnLogout.setOnClickListener(v -> {
            Toast.makeText(this, "Logged out", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}
