package pt.ipg.myfestival;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Calendar;

public class adicionarFestival extends AppCompatActivity {
    private Button button;
    private Button button1;
    private Button button2;

    TextView datainicio;
    TextView datafim;

    Calendar c;
    DatePickerDialog dpd;


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


        datainicio = (TextView)findViewById(R.id.datainiciofestival);
        button1 = (Button)findViewById(R.id.datainiciofestival);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c= Calendar.getInstance();
                int day = c.get(Calendar.DAY_OF_MONTH);
                int month=c.get(Calendar.MONTH);
                int year =c.get(Calendar.YEAR);

                dpd = new DatePickerDialog(adicionarFestival.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int mYear, int mMonth, int mDay) {
                        datainicio.setText(mDay + " / " + (mMonth+1) + "/" + mYear);
                        }
                },day,month,year);
                dpd.show();
            }
        });

        datafim = (TextView) findViewById(R.id.datadofimfestival);
        button2 =(Button)findViewById(R.id.datadofimfestival);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c= Calendar.getInstance();
                int day = c.get(Calendar.DAY_OF_MONTH);
                int month=c.get(Calendar.MONTH);
                int year =c.get(Calendar.YEAR);

                dpd = new DatePickerDialog(adicionarFestival.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int mYear, int mMonth, int mDay) {
                        datafim.setText(mDay + " / " + (mMonth+1) + "/" + mYear);
                    }
                },day,month,year);
                dpd.show();

            }
        });



    }

    public void GuardarFestival (View view){
            EditText nomeFestival =  findViewById(R.id.nomeFestival);
            String nomeFes = nomeFestival.getText().toString();

            if (nomeFes.isEmpty()) {
                nomeFestival.setError(getString(R.string.message_error));
                nomeFestival.requestFocus();
                return;
            }

            EditText localFestival = findViewById(R.id.localFestival);
            String localFes = localFestival.getText().toString();

        if (localFes.isEmpty()) {
            localFestival.setError(getString(R.string.message_error));
            localFestival.requestFocus();
            return;
        }

                finish();
                Toast.makeText(adicionarFestival.this, R.string.Save_message,Toast.LENGTH_LONG).show();
            }
        }




