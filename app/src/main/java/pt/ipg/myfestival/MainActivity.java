package pt.ipg.myfestival;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
