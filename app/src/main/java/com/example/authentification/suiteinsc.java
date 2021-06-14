package com.example.authentification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class suiteinsc extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    EditText t0,t1,t2,t3,t4,t5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suiteinsc);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);






    }

    public void logoutprocess(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(suiteinsc.this,MainActivity.class));
    }



    public void process(View view) {

      t1= findViewById(R.id.nom);
      t2= findViewById(R.id.prenom);
      t3=findViewById(R.id.adress);
      t4=findViewById(R.id.phone);


       String nom=t1.getText().toString().trim();
        String prenom=t2.getText().toString().trim();
        String adress=t3.getText().toString().trim();
        String phone=t4.getText().toString().trim();



        dataholder obj=new dataholder(nom,prenom,adress,phone);
        FirebaseDatabase db=FirebaseDatabase.getInstance();
        DatabaseReference node=db.getReference("patient");
        node.child(nom).setValue(obj);
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        Toast.makeText(getApplicationContext(),"value inserted",Toast.LENGTH_LONG).show();

    }
}