package pt.ipg.myfestival;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Payments extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments);

        button = findViewById(R.id.addpayment);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennewpayment();
            }
        });
        button = findViewById(R.id.editpayment);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openeditpayment();
            }
        });

        button = findViewById(R.id.deletepayment);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendeletepayment();
            }
        });
    }

    public void opennewpayment(){
        Intent intent = new Intent(this,NewPayment.class);
        startActivity(intent);
    }

    public void openeditpayment() {
        Intent intent = new Intent(this,EditPayment.class);
        startActivity(intent);
    }
    public void opendeletepayment() {
        Intent intent = new Intent(this,DeletePayment.class);
        startActivity(intent);
    }
}
