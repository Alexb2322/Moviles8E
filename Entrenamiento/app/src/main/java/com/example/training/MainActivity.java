package com.example.training;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
<<<<<<< HEAD
import android.os.Message;
=======
>>>>>>> d022927991c94f7189781e8cbf9bb8a7983bcb41
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD

        Toast.makeText(this, "Hola nonorrea", Toast.LENGTH_SHORT).show();
=======
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
>>>>>>> d022927991c94f7189781e8cbf9bb8a7983bcb41

    }

    public void Message(View view){

<<<<<<< HEAD
        Toast.makeText(this, "You`ve pressed button", Toast.LENGTH_SHORT).show();
=======
        Toast.makeText(this, "Tu has presionado el boton", Toast.LENGTH_SHORT).show();
>>>>>>> d022927991c94f7189781e8cbf9bb8a7983bcb41
    }

    @Override
    protected void onStart() {
        super.onStart();
<<<<<<< HEAD
        Toast.makeText(this, "on start", Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "En Pantalla", Toast.LENGTH_SHORT).show();
=======
        Toast.makeText(this, "Estado: onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "En pantalla", Toast.LENGTH_SHORT).show();
>>>>>>> d022927991c94f7189781e8cbf9bb8a7983bcb41
    }

    @Override
    protected void onPause() {
        super.onPause();
<<<<<<< HEAD
        Toast.makeText(this, "en pausa", Toast.LENGTH_SHORT).show();
=======
        Toast.makeText(this, "En pausa", Toast.LENGTH_SHORT).show();
>>>>>>> d022927991c94f7189781e8cbf9bb8a7983bcb41
    }

    @Override
    protected void onStop() {
        super.onStop();
<<<<<<< HEAD
        Toast.makeText(this, "EN stop", Toast.LENGTH_SHORT).show();
=======
        Toast.makeText(this, "La app ha parado", Toast.LENGTH_SHORT).show();
>>>>>>> d022927991c94f7189781e8cbf9bb8a7983bcb41
    }

    @Override
    protected void onRestart() {
        super.onRestart();
<<<<<<< HEAD
        Toast.makeText(this, "La app se reinicio", Toast.LENGTH_SHORT).show();
=======
        Toast.makeText(this, "La appa se ha reiniciado", Toast.LENGTH_SHORT).show();
>>>>>>> d022927991c94f7189781e8cbf9bb8a7983bcb41
    }


}
