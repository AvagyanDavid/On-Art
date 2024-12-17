package com.example.myapplication;

import android.media.Image;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUpActivity extends AppCompatActivity {
    private EditText email, password, password2;
    private ImageButton btn_next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        email = findViewById(R.id.email_edit);
        password = findViewById(R.id.password_edit);
        password2 = findViewById(R.id.password2_edit);
        btn_next = findViewById(R.id.btn_next);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(email.getText().toString()) || TextUtils.isEmpty(password.getText().toString())) {
                    Toast toast = Toast.makeText(SignUpActivity.this, "Логин и пароль не могут быть пустыми", Toast.LENGTH_LONG);
                    toast.show();
                } else if (!isEmailValid(email.getText().toString())){
                    Toast toast = Toast.makeText(SignUpActivity.this, "Электронная почта введена неправильно",Toast.LENGTH_LONG);
                    toast.show();
                } else if (password != password2) {
                    Toast toast2 = Toast.makeText(SignUpActivity.this, "Пароли не совпадают",Toast.LENGTH_LONG);
                    toast2.show();
                }
            }
        });

    }

    public static boolean isEmailValid(String email) {
        String expression = "^[\\w.+\\-]+@([\\w\\-]+\\.)+[\\w\\-]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
