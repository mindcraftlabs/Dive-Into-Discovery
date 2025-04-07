package com.example.fllhydro_bot;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.animation.ObjectAnimator;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView joystickThumb;
    private float thumbRadius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Main activity layout with joystick UI

        // Hide the app title bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        // Initialize joystick
        joystickThumb = findViewById(R.id.joystickThumb);
        thumbRadius = 100f; // Set joystick thumb radius

        setupJoystick(); // Initialize joystick logic

        // Set up the WebView for the video stream
        WebView videoView = findViewById(R.id.videoView);
        WebSettings webSettings = videoView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Enable JavaScript for streaming

        // Fetch IP address from SharedPreferences
        String savedIp = getSharedPreferences("FLL_HydroBot", MODE_PRIVATE)
                .getString("VIDEO_STREAM_IP", null); // Default to null if no IP is saved

        if (savedIp != null) {
            videoView.loadUrl("http://" + savedIp); // Use the saved IP address for the stream
        } else {
            videoView.loadUrl("http://<default_ip>:8080"); // Replace <default_ip> with your default fallback IP
        }

        // Button to navigate to the connection fragment/activity
        Button btnConnect = findViewById(R.id.btnConnect);
        btnConnect.setOnClickListener(v -> openConnectionFragment());
    }

    /**
     * Set up joystick logic.
     */
    private void setupJoystick() {
        findViewById(R.id.joystickBackground).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                float x = event.getX();
                float y = event.getY();

                float centerX = v.getWidth() / 2;
                float centerY = v.getHeight() / 2;

                float deltaX = x - centerX;
                float deltaY = y - centerY;

                float distance = (float) Math.sqrt(deltaX * deltaX + deltaY * deltaY);

                // Ensure thumb doesn't go beyond the joystick radius
                if (distance > thumbRadius) {
                    float angle = (float) Math.atan2(deltaY, deltaX);
                    x = (float) (centerX + thumbRadius * Math.cos(angle));
                    y = (float) (centerY + thumbRadius * Math.sin(angle));
                }

                joystickThumb.setX(x - joystickThumb.getWidth() / 2);
                joystickThumb.setY(y - joystickThumb.getHeight() / 2);

                // Animate the joystick back to center on release
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    ObjectAnimator animatorX = ObjectAnimator.ofFloat(joystickThumb, "x", centerX - joystickThumb.getWidth() / 2);
                    ObjectAnimator animatorY = ObjectAnimator.ofFloat(joystickThumb, "y", centerY - joystickThumb.getHeight() / 2);
                    animatorX.setDuration(300);
                    animatorY.setDuration(300);
                    animatorX.start();
                    animatorY.start();
                }
                return true;
            }
        });
    }

    /**
     * Opens the connection fragment or activity.
     */
    private void openConnectionFragment() {
        Intent intent = new Intent(MainActivity.this, ConnectionActivity.class);
        startActivity(intent);
    }
}
