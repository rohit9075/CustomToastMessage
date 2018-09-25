package com.example.rohitkumar.customtoastmessage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.custom_toast_container);
    }

    public void printToast(View view) {

        // customToast method call
        customToast();


    }



    // customToast method definition
    private void customToast() {
        // Inflating the layout to show the custom toast
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,
               /* (ViewGroup) findViewById(R.id.custom_toast_container)*/ linearLayout);

        // setting the string to the textView runtime.
        TextView text = layout.findViewById(R.id.text);
        text.setText(R.string.text_message);

        Toast toast = new Toast(getApplicationContext());
        //setting the position of the toast message
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        // lenght of the toast message
        toast.setDuration(Toast.LENGTH_LONG);
        // assigning the custom layout view to toast message
        toast.setView(layout);

        // showing the toast message using show method
        toast.show();
    }
}
