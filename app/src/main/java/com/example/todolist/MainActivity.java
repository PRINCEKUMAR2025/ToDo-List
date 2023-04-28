package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView textView2,made;
    Button task1,task2,task3,task4,task5,task6,task7,task8,task9,task10,task12,task11,task13,contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        task1=findViewById(R.id.task1);
        task2=findViewById(R.id.task2);
        task3=findViewById(R.id.task3);
        task4=findViewById(R.id.task4);
        task5=findViewById(R.id.task5);
        task6=findViewById(R.id.task6);
        task7=findViewById(R.id.task7);
        task8=findViewById(R.id.task8);
        task9=findViewById(R.id.task9);
        task10=findViewById(R.id.task10);
        task11=findViewById(R.id.task11);
        task12=findViewById(R.id.task12);
        task13=findViewById(R.id.task13);
        contact=findViewById(R.id.contact);
        textView2=findViewById(R.id.textView2);
        made=findViewById(R.id.made);

        Calendar calendar=Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());

        TextView textViewDate=findViewById(R.id.textView);
        textViewDate.setText(currentDate);

        Animation anim=new AlphaAnimation(0.0f,1.0f);
        anim.setDuration(500);
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        made.startAnimation(anim);

        TextView imageView = findViewById(R.id.textView2);
        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "translationX", 0f, 200f);
        animator.setDuration(10000); // duration in milliseconds
        animator.setRepeatCount(ObjectAnimator.INFINITE); // repeat indefinitely
        animator.setRepeatMode(ObjectAnimator.REVERSE); // reverse the animation direction on each repeat
        animator.start();

        task1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,com.example.todolist.task1.class);
                startActivity(intent);
            }
        });

        task2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,com.example.todolist.task2.class);
                startActivity(intent);
            }
        });

        task3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,com.example.todolist.task3.class);
                startActivity(intent);
            }
        });

        task4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,com.example.todolist.task4.class);
                startActivity(intent);
            }
        });

        task5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,com.example.todolist.task5.class);
                startActivity(intent);
            }
        });

        task6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,com.example.todolist.task6.class);
                startActivity(intent);
            }
        });

        task7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,com.example.todolist.task7.class);
                startActivity(intent);
            }
        });

        task8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,com.example.todolist.task8.class);
                startActivity(intent);
            }
        });

        task9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,com.example.todolist.task9.class);
                startActivity(intent);
            }
        });
        task10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,com.example.todolist.task10.class);
                startActivity(intent);
            }
        });

        task11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,com.example.todolist.task11.class);
                startActivity(intent);
            }
        });

        task12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,com.example.todolist.task12.class);
                startActivity(intent);
            }
        });

        task13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,com.example.todolist.task13.class);
                startActivity(intent);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,com.example.todolist.contact.class);
                startActivity(intent);
            }
        });

    }
}