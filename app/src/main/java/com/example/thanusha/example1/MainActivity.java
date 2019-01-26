package com.example.thanusha.example1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnClick=findViewById(R.id.btnClick);
        Button btnSgic=findViewById(R.id.btnSgic);

        EditText txtName=findViewById(R.id.txtName);

        Button btnGetText=findViewById(R.id.btnGetText);




        Button btnCalc = findViewById(R.id.btnCalcu);

        btnCalc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            EditText txtNum1=findViewById(R.id.txtNumber1);
            EditText txtNum2=findViewById(R.id.txtNumber2);
            TextView lblAns =findViewById(R.id.lblAnswer);

            Double num1=Double.parseDouble(txtNum1.getText().toString());
            Double num2=Double.parseDouble(txtNum2.getText().toString());

            Double ans =num1 +num2;

            lblAns.setText(ans.toString());

        };

        TextView txtview =findViewById(R.id.lblHello);
//        String str ="sgic\nsgic\nsgic";
//        txtview.setText(str);
             String str ="";
             for(int i=1; i<=10; i++) {
                 str = str + "*\n";
             }
        txtview.setText(str);

       btnGetText.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               EditText txtName =findViewById(R.id.txtName);
               String txtstr =txtName.getText().toString();
           }
       });

        btnClick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView txtview=findViewById(R.id.lblHello);
                txtview.setText("How Are You");
            }
        });

        btnSgic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView txtview=findViewById(R.id.lblHello);
                txtview.setText("Welcome SGIC");
            }
        });

    }
}
