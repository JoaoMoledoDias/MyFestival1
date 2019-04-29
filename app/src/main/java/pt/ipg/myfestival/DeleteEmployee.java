package pt.ipg.myfestival;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DeleteEmployee extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_employee);

        button=(Button) findViewById(R.id.editcancelemployee);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        button=(Button) findViewById(R.id.editsaveemployee);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(DeleteEmployee.this,"Employee Deleted with Sucess",Toast.LENGTH_LONG).show();
            }
        });
    }
}
