package pt.ipg.myfestival;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class DeleteFestivais extends AppCompatActivity {


    private Button button6;
    private Button button7;
    private Button button8;

    TextView datainiciodelete;
    TextView datafimdelete;

    Calendar c;
    DatePickerDialog dpd;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_festivais);

        button6 = (Button) findViewById(R.id.butaoCancelar);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        datainiciodelete = (TextView) findViewById(R.id.datainiciofestival);
        button7 = (Button) findViewById(R.id.datainiciofestival);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c = Calendar.getInstance();
                int day = c.get(Calendar.DAY_OF_MONTH);
                int month = c.get(Calendar.MONTH);
                int year = c.get(Calendar.YEAR);

                dpd = new DatePickerDialog(DeleteFestivais.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int mYear, int mMonth, int mDay) {
                        datainiciodelete.setText(mDay + " / " + (mMonth + 1) + "/" + mYear);
                    }
                }, day, month, year);
                dpd.show();
            }
        });

        datafimdelete = (TextView) findViewById(R.id.datadofimfestival);
        button8 = (Button) findViewById(R.id.datadofimfestival);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c = Calendar.getInstance();
                int day = c.get(Calendar.DAY_OF_MONTH);
                int month = c.get(Calendar.MONTH);
                int year = c.get(Calendar.YEAR);

                dpd = new DatePickerDialog(DeleteFestivais.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int mYear, int mMonth, int mDay) {
                        datafimdelete.setText(mDay + " / " + (mMonth + 1) + "/" + mYear);
                    }
                }, day, month, year);
                dpd.show();

            }
        });
    }
    public void DeleteFestival(View view){
        finish();
        Toast.makeText(DeleteFestivais.this,R.string.deleted_message,Toast.LENGTH_LONG).show();
    }
}


