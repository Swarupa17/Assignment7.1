package com.example.swarupa.assignment71;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {


    String[] arr = { "Hp Printer", "Samung mobile","Lenovo Laptop",
            "Hard drives", "Pen Drives"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
      ;
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, arr);
        autoCompleteTextView.setThreshold(2);
        autoCompleteTextView.setAdapter(adapter);
    }
}
