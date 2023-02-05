package com.tp1.currencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton r1;
    private RadioButton r2;
    private EditText txtSrc;
    private TextView txtOut;
 //   private RadioGroup rd;
//    private Button btn;


    private double res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = this.findViewById(R.id.radioDinarEuro);
        this.txtSrc = findViewById(R.id.montant);
        this.txtOut = (TextView) findViewById(R.id.Result);
        this.r2 = (RadioButton) findViewById(R.id.radioEuroDinar);
//        this.btn = (Button) findViewById(R.id.btnC);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {

//                fctConvert(v);
//            }
//        });



    }

    public void fctConvert(View v)
    {
        if(r1.isChecked())
        {
            String s = txtSrc.getText().toString();
            double res = Float.parseFloat(s) / 3.4;

            //DecimalFormat f = new DecimalFormat(".##");
            //String result = f.format(res);
            txtOut.setText(res + " euros!");

            String resAffich = getString(
                    R.string.resultat, res, "Euros !");
            txtOut.setText(resAffich);

        }
        else if(r2.isChecked())
        {
            res = Float.parseFloat(txtSrc.getText().toString()) * 3.4;
            //txtOut.setText(res + " Dinars");
            txtOut.setText(getString(R.string.resultat, res, " dinars"));

        }
        else {
             Toast.makeText(this,
                    "Veuillez choisir une conversion",
                    Toast.LENGTH_LONG).show();
        }

    }

}