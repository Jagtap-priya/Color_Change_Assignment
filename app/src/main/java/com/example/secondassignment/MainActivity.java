package com.example.secondassignment;

import static com.example.secondassignment.R.color.blue;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    TextView Text1;
    TextView Text2;
    TextView Text3;
    EditText Edittext;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initializeViews();
      View.OnClickListener listener=new  MyBtnClickListener();
      btnLogin.setOnClickListener(listener);
    }
    private void initializeViews(){
        Text1=findViewById(R.id.Text1);
        Text2=findViewById(R.id.Text2);
        Text3=findViewById(R.id.Text3);
        Edittext=findViewById(R.id.Edittext);
        btnLogin=findViewById(R.id.btnLogin);


    }
    class MyBtnClickListener implements View.OnClickListener {
                @SuppressLint("ResourceAsColor")
                    @Override
                    public void onClick(View view) {
                        if (Edittext.getText().toString().equals("1")||Edittext.getText().toString().equals("One")) {
                            Text1.setBackgroundColor(MainActivity.this.getColor(R.color.green));
                        }else {
                            Text1.setBackgroundColor(MainActivity.this.getColor(R.color.red));
                        }
                        if (Edittext.getText().toString().equals("2")||Edittext.getText().toString().equals("Two")) {
                            Text2.setBackgroundColor(MainActivity.this.getColor(R.color.yellow));
                        } else {
                            Text2.setBackgroundColor(MainActivity.this.getColor(R.color.red));
                        }
                            if (Edittext.getText().toString().equals("3")||Edittext.getText().toString().equals("Three")) {
                            Text3.setBackgroundColor(MainActivity.this.getColor(R.color.yellow));
                        }else {
                                Text3.setBackgroundColor(MainActivity.this.getColor(R.color.red));
                            }
                    }


    }
}
