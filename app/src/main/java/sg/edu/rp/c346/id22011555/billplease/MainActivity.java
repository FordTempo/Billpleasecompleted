package sg.edu.rp.c346.id22011555.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView amt;
    TextView pax;
    EditText amtvalue;
    EditText paxvalue;

    EditText discvalue;

    ToggleButton service;
    ToggleButton gst;

    RadioGroup payment;

    ToggleButton split;

    ToggleButton reset;


    TextView billView;

    TextView eachpay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amt = findViewById(R.id.textViewAmount);
        pax = findViewById(R.id.textViewPax);
        amtvalue = findViewById(R.id.EditTextAmount);
        paxvalue = findViewById(R.id.EditTextPax);
        discvalue = findViewById(R.id.EditTextdiscount);
        service = findViewById(R.id.togglegstbtn);
        gst = findViewById(R.id.togglesvsbtn);
        split = findViewById(R.id.togglesplit);
        reset = findViewById(R.id.togglereset);
        payment = findViewById(R.id.RadioGrouppayment);
        billView = findViewById(R.id.textViewBill);
        eachpay=findViewById(R.id.textViewpay);


        service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String yesgst = gst.getText().toString();
                String discountvalue = discvalue.getText().toString();
                if (service.isChecked()) {
                    yesgst = "Not Service";
                    discountvalue = "7%";
                } else {
                    yesgst = "Service";
                    discountvalue = "";
                }
                gst.setText(yesgst);
                discvalue.setText(discountvalue);

            }
        });

        gst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String yesservice = service.getText().toString();
                String discountvalue = discvalue.getText().toString();
                if (gst.isChecked()) {
                    yesservice = "Not Gst";
                    discountvalue = "10%";
                } else {
                    yesservice = "GST";
                    discountvalue = "";
                }
                service.setText(yesservice);
                discvalue.setText(discountvalue);

            }
        });

        split.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bill=billView.getText().toString();
                String pay=eachpay.getText().toString();
                int checkedRadioId = payment.getCheckedRadioButtonId();
                if (checkedRadioId == R.id.cash) {

                }else{

                }
                billView.setText(bill);
                eachpay.setText(pay);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amtvalue.setText("");
                paxvalue.setText("");
                service.setChecked(false);
                gst.setChecked(false);
                discvalue.setText("");
            }
        });
    }
}

































