package com.example.doctorregistration.Patient.Frontend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.doctorregistration.Launcher.MainWelcome;
import com.example.doctorregistration.R;
import com.google.firebase.auth.FirebaseAuth;

public class PatientWelcome extends AppCompatActivity {
    private Button logout;
    FirebaseAuth patientLogoutAuth;

    private Button upcomingAppointmentsbtn;
    private Button pastAppointmentsbtn;
    private Button createAppointmentbtn;
    public static String test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_welcome);

        logout = (Button) findViewById(R.id.signOut);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(), MainWelcome.class));
            }
        });
        upcomingAppointmentsbtn = (Button) findViewById(R.id.upcomingAppointments2);
        upcomingAppointmentsbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), PatientViewAppointments.class);
                startActivity(intent);
                test = "upcomingAppointments";
                finish();


            }
        });

        pastAppointmentsbtn = (Button) findViewById(R.id.pastAppointments2);
        pastAppointmentsbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                Intent intent = new Intent(getApplicationContext(), PatientViewAppointments.class);
                startActivity(intent);
                test = "pastAppointments";
                finish();

            }
        });

        createAppointmentbtn = findViewById(R.id.createAppointment);

        createAppointmentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PatientCreateAppointmentSlots.class);
                startActivity(intent);
            }
        });
    }
}