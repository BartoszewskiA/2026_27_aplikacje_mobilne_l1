package com.example.lab03p02;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    int losowa =0;

    TextView textView_wynik;
    EditText editText_liczba;
    Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        losowa = random.nextInt(99)+1;
        textView_wynik = findViewById(R.id.textView_wynik);
        editText_liczba = findViewById(R.id.editText_liczba);
    }

    public void sprawdz(View view) {
        String liczba_str = editText_liczba.getText().toString();
        if(liczba_str.isEmpty())
        {
            return;
        }
        int liczba = Integer.parseInt(liczba_str);
    }
}