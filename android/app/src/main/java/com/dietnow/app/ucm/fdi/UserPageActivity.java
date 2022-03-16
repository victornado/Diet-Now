package com.dietnow.app.ucm.fdi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class UserPageActivity extends AppCompatActivity {

    private Button dieta, perfil, dietasCreadas, dietasPub;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page);

        dieta = findViewById(R.id.dietaBtn);

        auth   = FirebaseAuth.getInstance();

        // Acciones de los componentes
        dieta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Con Intent podemos "redirigir" al usuario a nueva actividad
                Intent intent = new Intent(UserPageActivity.this,DietInfoActivity.class);
                startActivity(intent);
            }
        });
        perfil = findViewById(R.id.miPerfilBtn);


        /*
        dieta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Con Intent podemos "redirigir" al usuario a nueva actividad
                Intent intent = new Intent(UserPageActivity.this,DietInfoActivity.class);
                startActivity(intent);
            }
        });
        perfil = findViewById(R.id.miPerfilBtn);
        */


        // Acciones de los componentes
        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Con Intent podemos "redirigir" al usuario a nueva actividad
                Intent intent = new Intent(UserPageActivity.this, UserProfileActivity.class);
                startActivity(intent);
            }
        });
        dietasCreadas = findViewById(R.id.misDietasBtn);

        // Acciones de los componentes
        dietasCreadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Con Intent podemos "redirigir" al usuario a nueva actividad
                Intent intent = new Intent(UserPageActivity.this, MyDietsActivity.class);
                startActivity(intent);
            }
        });
        dietasPub = findViewById(R.id.dietasPublicadasBtn);

        // Acciones de los componentes
        dietasPub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Con Intent podemos "redirigir" al usuario a nueva actividad
                Intent intent = new Intent(UserPageActivity.this, AllPublishedDiets.class);
                startActivity(intent);
            }
        });
    }
}