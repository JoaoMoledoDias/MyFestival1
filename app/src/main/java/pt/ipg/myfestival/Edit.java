package pt.ipg.myfestival;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Edit extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        button = (Button) findViewById(R.id.button_cancel2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Toast.makeText(Edit.this,"Canceled",Toast.LENGTH_LONG).show();
            }
        });

        button=(Button) findViewById(R.id.button_edit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(Edit.this,"Edited Successfully",Toast.LENGTH_LONG).show();
            }
        });


    }
}
