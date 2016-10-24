package com.example.edwardlafontant.loginfragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends Activity {
    boolean status = false;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if(!status) {

                    Login L1 = new Login();
                    fragmentTransaction.add(R.id.fragment_container, L1);
                    fragmentTransaction.commit();
                    btn.setText("Register");
                    status = true;
                }
                else
                {

                    Register R1 = new Register();
                    fragmentTransaction.add(R.id.fragment_container, R1);
                    fragmentTransaction.commit();
                    btn.setText("Login");
                    status = false;

                }

            }
        });

    }
}
