package com.example.secondassignment;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    Resources resources;

    ImageView imageView;
    EditText krishna1;
    EditText krishna2;
    EditText krishna3;
    Button btnLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initializeViews();
       new MyBtnLoginClickListener();
    }
    private void initializeViews(){
        imageView=findViewById(R.id.imageview);
        krishna1=findViewById(R.id.krishna1);
        krishna2=findViewById(R.id.krishna2);
        krishna3=findViewById(R.id.krishna3);
    }
    class  MyBtnLoginClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
          
        }
    }
}
