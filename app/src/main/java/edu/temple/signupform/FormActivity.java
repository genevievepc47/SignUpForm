package edu.temple.signupform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button saveButton= (Button) findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //save each variable and check if theyre empty
                String name = "";
                String email = "";
                String password = "";
                String confirmation = "";
                Boolean canMoveOn = true;


                EditText nameEdit = (EditText) findViewById(R.id.nameEdit);
                name = nameEdit.getText().toString();
                if (name.matches("")) {
                    Toast.makeText(FormActivity.this, "You must enter all information", Toast.LENGTH_SHORT).show();
                    canMoveOn = false;
                }


                EditText emailEdit = (EditText) findViewById(R.id.emailEdit);
                email = emailEdit.getText().toString();
                if (email.matches("")) {
                    Toast.makeText(FormActivity.this, "You must enter all information", Toast.LENGTH_SHORT).show();
                    canMoveOn = false;
                }

                EditText passwordEdit = (EditText) findViewById(R.id.passwordEdit);
                password = passwordEdit.getText().toString();
                if (password.matches("")) {
                    Toast.makeText(FormActivity.this, "You must enter all information", Toast.LENGTH_SHORT).show();
                    canMoveOn = false;
                }

                EditText confirmationEdit = (EditText) findViewById(R.id.passwordEdit2);
                confirmation = confirmationEdit.getText().toString();
                if (confirmation.matches("")) {
                    Toast.makeText(FormActivity.this, "You must enter all information", Toast.LENGTH_SHORT).show();
                    canMoveOn = false;
                }

                //make sure password and confirmation match
                //if they dont match, show a message and change cmo to false
                if(!(password.matches(confirmation)))//if they dont match
                {
                    Toast.makeText(FormActivity.this, "Your password and password confirmation do not match", Toast.LENGTH_SHORT).show();
                    canMoveOn = false;
                }

                //display the message if everything is ok
                if(canMoveOn == true)
                {
                    Toast.makeText(FormActivity.this, "Welcome, " + name + ", to the SignUpForm App", Toast.LENGTH_SHORT).show();
                }








            }
        });
    }
}
