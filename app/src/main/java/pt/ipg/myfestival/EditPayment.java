package pt.ipg.myfestival;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditPayment extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_payment);
        button =(Button) findViewById(R.id.cancelnewpayment);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void Payment(View view){
        EditText daysoffestival = findViewById(R.id.daysoffestival);
        String daysfes = daysoffestival.getText().toString();

        if(daysfes.isEmpty()){
            daysoffestival.setError(getString(R.string.message_error));
            daysoffestival.requestFocus();
            return;
        }

        EditText hoursperday = findViewById(R.id.hoursperday);
        String hourday = hoursperday.getText().toString();

        if(hourday.isEmpty()) {
            hoursperday.setError(getString(R.string.message_error));
            hoursperday.requestFocus();
            return;
        }

        EditText payment = findViewById(R.id.payment);
        String pay = payment.getText().toString();

        if(pay.isEmpty()){
            payment.setError(getString(R.string.message_error));
            payment.requestFocus();
            return;
        }

        finish();
        Toast.makeText(EditPayment.this,R.string.Edited_message,Toast.LENGTH_LONG).show();
    }
}


