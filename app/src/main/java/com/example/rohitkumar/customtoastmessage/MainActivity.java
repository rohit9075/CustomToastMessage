package com.example.rohitkumar.customtoastmessage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
                (ViewGroup) findViewById(R.id.custom_toast_container));

        // setting the string to the textview runtime.
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText("This is a custom toast");

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
