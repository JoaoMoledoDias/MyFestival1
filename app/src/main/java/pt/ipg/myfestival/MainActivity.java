package pt.ipg.myfestival;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.butaoFestivais);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opennFestivais();
            }
        });

        button=(Button)findViewById(R.id.butaoFuncionarios);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEmployees();
            }
        });

        button=(Button)findViewById(R.id.butaoPagamentos);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPayments();
            }
        });
    }

    public void opennFestivais(){
        Intent intent= new Intent(this,Festivais.class);
        startActivity(intent);
    }

    public void openEmployees(){
        Intent intent = new Intent(this,Employee.class);
        startActivity(intent);
    }
    public void openPayments(){
        Intent intent = new Intent(this,Payments.class);
        startActivity(intent);
    }

    public void displayToast(View view) {
        Toast.makeText(MainActivity.this,"0 resultados encontrados",Toast.LENGTH_LONG).show();
    }

    public void displayToast1(View view) {
        Toast.makeText(MainActivity.this,"Lista de Festivais realizados pela empresa",Toast.LENGTH_LONG).show();
    }

    public void displayToast2(View view) {
        Toast.makeText(MainActivity.this,"Funcionarios disponiveis para a época",Toast.LENGTH_LONG).show();
    }
}
