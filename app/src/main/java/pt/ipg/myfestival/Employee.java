package pt.ipg.myfestival;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Employee extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);

        button=(Button) findViewById(R.id.addemployee);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openaddemployees();
            }
        });

        button=(Button) findViewById(R.id.editemployee);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openneditemployees();
            }
        });

        button=(Button) findViewById(R.id.deleteemployee);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendeleteemployee();
            }
        });

    }
    public void openaddemployees(){
        Intent intent = new Intent(this,addemployees.class);
        startActivity(intent);
    }
    public void openneditemployees(){
        Intent intent = new Intent(this,EditEmployee.class);
        startActivity(intent);
    }
    public void opendeleteemployee(){
        Intent intent= new Intent(this,DeleteEmployee.class);
        startActivity(intent);
    }
}
