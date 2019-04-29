package pt.ipg.myfestival;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditEmployee extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_employee);

        button=(Button) findViewById(R.id.editcancelemployee);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    public void saveemployeeedit (View view){
        EditText edinameemployee = findViewById(R.id.edinameemployee);
        String nameemp = edinameemployee.getText().toString();

        if(nameemp.isEmpty()){
            edinameemployee.setError(getString(R.string.message_error));
            edinameemployee.requestFocus();
            return;
        }

        EditText editemployeeadress = findViewById(R.id.editemployeeadress);
        String adressemp = editemployeeadress.getText().toString();

        if(adressemp.isEmpty()){
            editemployeeadress.setError(getString(R.string.message_error));
            editemployeeadress.requestFocus();
            return;
        }

        EditText editemployeeemail = findViewById(R.id.editemployeeemail);
        String emailemp = editemployeeemail.getText().toString();

        if(emailemp.isEmpty()){
            editemployeeemail.setError(getString(R.string.message_error));
            editemployeeemail.requestFocus();
            return;
        }

        EditText editphoneemployee = findViewById(R.id.editphoneemployee);
        String phoneemp = editphoneemployee.getText().toString();

        if(phoneemp.isEmpty()){
            editphoneemployee.setError(getString(R.string.message_error));;
            editphoneemployee.requestFocus();
            return;
        }

        finish();
        Toast.makeText(EditEmployee.this, R.string.Edited_message,Toast.LENGTH_LONG).show();
    }
}
