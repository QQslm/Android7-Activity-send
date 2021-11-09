package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText B_Input_Text;
    TextView B_Text;
    String BTEXT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        B_Input_Text = findViewById(R.id.editTextTextPersonName2);// 取得目標物件
        B_Text = findViewById(R.id.textView);// 取得目標物件

        Intent intent = getIntent();
        String Atext = intent.getStringExtra("ATEXT");
        B_Text.setText("Page B 輸入的文字:"+Atext);
    }
    public void button_to_A( View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity2.this, MainActivity.class);

            if (!("".equals(B_Input_Text.getText().toString()))) {
                BTEXT = B_Input_Text.getText().toString();
                intent.putExtra("BTEXT", BTEXT);

            }
        startActivity(intent);
    }
}