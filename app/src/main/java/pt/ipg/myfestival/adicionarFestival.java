package pt.ipg.myfestival;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                nomeFestival.setError("Campo inválido");
                nomeFestival.requestFocus();
                return;
            }

            EditText localFestival = findViewById(R.id.localFestival);
            String localFes = localFestival.getText().toString();

        if (localFes.trim().length() == 0) {
            localFestival.setError("Campo inválido");
            localFestival.requestFocus();
            return;
        }

        button = (Button) findViewById(R.id.butaoGuardarFes);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Toast.makeText(adicionarFestival.this,"Festival Guardado com Sucesso",Toast.LENGTH_LONG).show();
            }
        });
        }

    }


