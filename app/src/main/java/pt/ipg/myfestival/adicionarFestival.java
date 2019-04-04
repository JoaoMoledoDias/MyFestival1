package pt.ipg.myfestival;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Calendar;

public class adicionarFestival extends AppCompatActivity {
    private Button button;

    @Override
   
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_festival);

        button = (Button) findViewById(R.id.butaoCancelar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    public void GuardarFestival (View view){
            EditText nomeFestival = (EditText) findViewById(R.id.nomeFestival);
            String nomeFes = nomeFestival.getText().toString();

            if (nomeFes.trim().length() == 0) {
                nomeFestival.setError(getString(R.string.message_error));
                nomeFestival.requestFocus();
            }

            EditText localFestival = findViewById(R.id.localFestival);
            String localFes = localFestival.getText().toString();

        if (localFes.trim().length() == 0) {
            localFestival.setError(getString(R.string.message_error));
            localFestival.requestFocus();
            return;
        }
                finish();
                Toast.makeText(adicionarFestival.this, R.string.Save_message,Toast.LENGTH_LONG).show();
            }
        }




