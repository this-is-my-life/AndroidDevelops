package kro.kr.android.android.develops;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plus = (Button) findViewById(R.id.plus);
        Button minus = (Button) findViewById(R.id.minus);
        Button times = (Button) findViewById(R.id.times);
        Button div = (Button) findViewById(R.id.div);

        plus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText number1 = (EditText) findViewById(R.id.number1);
                EditText number2 = (EditText) findViewById(R.id.number2);

                TextView result = (TextView) findViewById(R.id.result);

                int n1 = Integer.parseInt(number1.getText().toString());
                int n2 = Integer.parseInt(number2.getText().toString());

                result.setText("=" + Integer.toString(n1 + n2));
            }

        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText number1 = (EditText) findViewById(R.id.number1);
                EditText number2 = (EditText) findViewById(R.id.number2);

                TextView result = (TextView) findViewById(R.id.result);

                int n1 = Integer.parseInt(number1.getText().toString());
                int n2 = Integer.parseInt(number2.getText().toString());

                result.setText("=" + Integer.toString(n1 - n2));
            }
        });

        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText number1 = (EditText) findViewById(R.id.number1);
                EditText number2 = (EditText) findViewById(R.id.number2);

                TextView result = (TextView) findViewById(R.id.result);

                int n1 = Integer.parseInt(number1.getText().toString());
                int n2 = Integer.parseInt(number2.getText().toString());

                result.setText("=" + Integer.toString(n1 * n2));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText number1 = (EditText) findViewById(R.id.number1);
                EditText number2 = (EditText) findViewById(R.id.number2);

                TextView result = (TextView) findViewById(R.id.result);

                int n1 = Integer.parseInt(number1.getText().toString());
                int n2 = Integer.parseInt(number2.getText().toString());

                if (n2 == 0) {
                    result.setText("= Error: cannot divide by zero");
                } else {
                    result.setText("=" + Integer.toString(n1 / n2));
                }
            }
        });

    }
}
