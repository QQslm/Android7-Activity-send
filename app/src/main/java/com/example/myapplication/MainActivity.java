package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText A_Input_Text;
    TextView A_Text;
    String ATEXT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        A_Input_Text = findViewById(R.id.editTextTextPersonName2);// 取得目標物件
        A_Text = findViewById(R.id.textView);// 取得目標物件
        Intent intent = getIntent();
        String Btext = intent.getStringExtra("BTEXT");
        A_Text.setText("Page B 輸入的文字:"+Btext);
    }
    public void button_to_B( View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivity2.class);

        if (!("".equals(A_Input_Text.getText().toString()))) {
            ATEXT=A_Input_Text.getText().toString();//獲取A_Input_Text的字串資料
            intent.putExtra("ATEXT", ATEXT);
        }
        startActivity(intent);

    }
}