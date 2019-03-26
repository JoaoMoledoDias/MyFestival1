package pt.ipg.myfestival;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
    }

    public void opennadicionarFestival(){
        Intent intent = new Intent(this,adicionarFestival.class);
        startActivity(intent);
    }


    
}
