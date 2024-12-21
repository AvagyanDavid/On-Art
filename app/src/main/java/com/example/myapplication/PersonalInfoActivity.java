package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);

        EditText full_name = findViewById(R.id.full_name);
        EditText nickname = findViewById(R.id.nickname);
        ImageButton create = findViewById(R.id.create);
        RadioGroup gender = findViewById(R.id.radioGroup);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = gender.getCheckedRadioButtonId();
                if (selectedId != -1) {
                    RadioButton selectedRadioButton = findViewById(selectedId);
                    String selectedOption = selectedRadioButton.getText().toString();

                    // Показываем сообщение с выбранным вариантом
                    Toast.makeText(PersonalInfoActivity.this, "Selected: " + selectedOption, Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(PersonalInfoActivity.this, LoginActivity.class);
                } else {
                    // Если ничего не выбрано
                    Toast.makeText(PersonalInfoActivity.this, "Please select an option", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
