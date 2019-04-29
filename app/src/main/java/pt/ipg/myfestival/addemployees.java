package pt.ipg.myfestival;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class addemployees extends AppCompatActivity {
    private Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employees);

        button9=(Button) findViewById(R.id.cancelemployee);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void SaveEmployee (View view) {
        EditText nameemployee = findViewById(R.id.nameemployee);
        String Namemploye = nameemployee.getText().toString();

        if (Namemploye.isEmpty()) {
            nameemployee.setError(getString(R.string.message_error));
            nameemployee.requestFocus();
            return;
        }

        EditText employeeadress = findViewById(R.id.employeeadress);
        String employeadre = employeeadress.getText().toString();

        if (employeadre.isEmpty()) {
            employeeadress.setError(getString(R.string.message_error));
            employeeadress.requestFocus();
            return;
        }

        EditText employeeemail = findViewById(R.id.employeeemail);
        String email = employeeadress.getText().toString();

        if (email.isEmpty()) {
            employeeemail.setError(getString(R.string.message_error));
            employeeemail.requestFocus();
            return;
        }

        EditText phoneemployee = findViewById(R.id.phoneemployee);
        String phone = employeeadress.getText().toString();

        if (phone.isEmpty()) {
            phoneemployee.setError(getString(R.string.message_error));
            phoneemployee.requestFocus();
            return;
        }
                    finish();
                    Toast.makeText(addemployees.this, R.string.Saved_message, Toast.LENGTH_LONG).show();
             }

        }
