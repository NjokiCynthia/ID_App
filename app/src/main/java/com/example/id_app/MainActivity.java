package com.example.id_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText enter_ID;
    Button btn_Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Submit = findViewById(R.id.btn_submit);
textView = findViewById(R.id.textView);
enter_ID = findViewById(R.id.enter_ID);

btn_Submit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String idNumber = enter_ID.getText().toString().trim();
    String dob = idNumber.substring(0, 6);
int gender =Integer.parseInt(Character.toString(idNumber.charAt(6)));
String sGender;
if(gender<5)
    sGender= getString(R.string.female);
else
sGender = getString(R.string.male);

textView.setText(getString(R.string.gender) + sGender );
}
});
}
}