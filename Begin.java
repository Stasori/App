package com.example.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.math.BigInteger;

public class Begin extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private EditText chislo;
    private RadioButton A2;
    private RadioButton A8;
    private RadioButton A16;
    private TextView result;
    private RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);
        button1=findViewById(R.id.button12);
        button2=findViewById(R.id.button22);
        chislo=findViewById(R.id.chislo);
        group=findViewById(R.id.group);
        A2=findViewById(R.id.a2);
        A8=findViewById(R.id.a8);
        A16=findViewById(R.id.a16);
        result=findViewById(R.id.result);
        String chislo1 = chislo.getText().toString();
        double chislo2=Double.parseDouble(chislo1);
        BigInteger a= new BigInteger("chislo2");
        String s=a.toString(2);
        String v=a.toString(8);
        String g=a.toString(16);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View k) {
                group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int id) {
                        switch (id){
                            case R.id.a2:
                                result.setText(s);break;
                            case R.id.a8:
                                result.setText(v);break;
                            case R.id.a16:
                                result.setText(g);break;
                            default: break;

                        }

                    }
                });

            }
        });




    }

}