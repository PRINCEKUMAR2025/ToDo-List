package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class task11 extends AppCompatActivity {
    EditText etName,etSurname;
    TextView tvResults;
    ArrayList<Person>persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
        etName=(EditText) findViewById(R.id.etName);
        etSurname=(EditText) findViewById(R.id.etSurname);
        tvResults=(TextView) findViewById(R.id.tvResults);

        persons =new ArrayList<Person>();
        loadData();
    }
    public void btnAddData(View v){
        String name=etName.getText().toString();
        String surname=etSurname.getText().toString();

        Person person =new Person(name,surname);
        persons.add(person);

        setTextToTextView();
    }

    private void setTextToTextView() {
        String text ="";

        for (int i=0;i< persons.size();i++){
            text =text + persons.get(i).getName() + " " +persons.get(i).getSurname() + "\n";
        }
        tvResults.setText(text);
    }

    public void loadData(){
        persons.clear();
        File file=getApplicationContext().getFileStreamPath("Data.txt");
        String lineFromfile;

        if(file.exists()){
            try {
                BufferedReader reader=new BufferedReader(new InputStreamReader(openFileInput("Data.txt")));

                while ((lineFromfile = reader.readLine()) != null){
                    StringTokenizer tokens =new StringTokenizer(lineFromfile,",");
                    Person person =new Person(tokens.nextToken(),tokens.nextToken());
                    persons.add(person);
                }

                reader.close();
                setTextToTextView();
            }
            catch (IOException e){
                Toast.makeText(this,e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    public  void btnSaveData(View v){
        try {
            FileOutputStream file = openFileOutput("Data.txt",MODE_PRIVATE);
            OutputStreamWriter outputFile=new OutputStreamWriter(file);

            for (int i=0;i<persons.size();i++){
                outputFile.write(persons.get(i).getName()+ "," + persons.get(i).getSurname() + "\n");
            }
            outputFile.flush();
            outputFile.close();
            Toast.makeText(this, "Task Saved Succesfully", Toast.LENGTH_SHORT).show();
        }
        catch (IOException e){
            Toast.makeText(this,e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}