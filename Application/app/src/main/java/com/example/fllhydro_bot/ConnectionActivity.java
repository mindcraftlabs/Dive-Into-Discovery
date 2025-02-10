package com.example.fllhydro_bot;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ConnectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_connect);

        // Set the ActionBar title
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Connect to Device");
        }

        // Initialize views
        EditText editTextIp = findViewById(R.id.editTextIp);
        Button btnConnect = findViewById(R.id.btnConnect);
        Button btnBack = findViewById(R.id.btnBack);

        // Connect button
        btnConnect.setOnClickListener(v -> {
            String ipAddress = editTextIp.getText().toString().trim();
            if (!ipAddress.isEmpty()) {
                // Save IP address with port
                saveIpAddress(ipAddress + ":port"); // Replace ":port" with the desired port number, e.g., ":8080"
                Toast.makeText(this, "Connected to " + ipAddress, Toast.LENGTH_SHORT).show();

                // Navigate back to MainActivity
                Intent intent = new Intent(ConnectionActivity.this, MainActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Please enter a valid IP address", Toast.LENGTH_SHORT).show();
            }
        });

        // Back button
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(ConnectionActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }

    /**
     * Saves the IP address in SharedPreferences
     */
    private void saveIpAddress(String ipAddress) {
        getSharedPreferences("FLL_HydroBot", MODE_PRIVATE)
                .edit()
                .putString("VIDEO_STREAM_IP", ipAddress)
                .apply();
    }
}
