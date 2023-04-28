package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class contact extends AppCompatActivity {
    ImageView imageView3;
    Button github;
    TextView textview7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        imageView3=findViewById(R.id.imageView3);
        github=findViewById(R.id.github);

        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView3, "rotation", 0f, 200f);
        animator.setDuration(1000); // duration in milliseconds
        animator.setRepeatCount(ObjectAnimator.INFINITE); // repeat indefinitely
        animator.setRepeatMode(ObjectAnimator.REVERSE); // reverse the animation direction on each repeat
        animator.start();

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/PRINCEKUMAR2025?tab=repositories"));
                startActivity(intent);
            }
        });
    }
}