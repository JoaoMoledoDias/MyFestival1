package pt.ipg.myfestival;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Festivais extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festivais);

        button = findViewById(R.id.butaoAdicionarFes);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opennadicionarFestival();
            }
        });

        button=findViewById(R.id.delete);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDeleteFestivais();
            }
        });

        button=findViewById(R.id.editar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEditarFestivais();
            }
        });


    }

    public void opennadicionarFestival(){
        Intent intent = new Intent(this,adicionarFestival.class);
        startActivity(intent);
    }
    public void openDeleteFestivais(){
        Intent intent = new Intent(this,DeleteFestivais.class);
        startActivity(intent);
    }
    public void openEditarFestivais(){
       Intent intent = new Intent(this,EditarFestivais.class);
       startActivity(intent);
    }

}


