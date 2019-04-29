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

public class EditarFestivais extends AppCompatActivity {
    private Button button3;
    private Button button4;
    private Button button5;

    TextView datainicioedit;
    TextView datafimedit;

    Calendar c;
    DatePickerDialog dpd;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_festivais);

        button3 = (Button) findViewById(R.id.butaoCancelar);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        datainicioedit = (TextView)findViewById(R.id.datainiciofestivaledit);
        button4 = (Button)findViewById(R.id.datainiciofestivaledit);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c= Calendar.getInstance();
                int day = c.get(Calendar.DAY_OF_MONTH);
                int month=c.get(Calendar.MONTH);
                int year =c.get(Calendar.YEAR);

                dpd = new DatePickerDialog(EditarFestivais.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int mYear, int mMonth, int mDay) {
                        datainicioedit.setText(mDay + " / " + (mMonth+1) + "/" + mYear);
                    }
                },day,month,year);
                dpd.show();
            }
        });

        datafimedit = (TextView) findViewById(R.id.datadofimfestivaledit);
        button5 =(Button)findViewById(R.id.datadofimfestivaledit);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c= Calendar.getInstance();
                int day = c.get(Calendar.DAY_OF_MONTH);
                int month=c.get(Calendar.MONTH);
                int year =c.get(Calendar.YEAR);

                dpd = new DatePickerDialog(EditarFestivais.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int mYear, int mMonth, int mDay) {
                        datafimedit.setText(mDay + " / " + (mMonth+1) + "/" + mYear);
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
        Toast.makeText(EditarFestivais.this, R.string.Edited_message,Toast.LENGTH_LONG).show();
    }
}