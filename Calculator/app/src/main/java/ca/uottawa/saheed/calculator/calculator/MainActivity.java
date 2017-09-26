package ca.uottawa.saheed.calculator.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private enum Operator {none,add,minus,multiply,divide};
    private double data1 = 0,data2 = 0;
    private Operator optr = Operator.none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn00Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultText);
        eText.setText(eText.getText()+"0");
    }
    public void btn01Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultText);
        eText.setText(eText.getText()+"1");
    }
    public void btn02Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultText);
        eText.setText(eText.getText()+"2");
    }
    public void btn03Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultText);
        eText.setText(eText.getText()+"3");
    }
    public void btn04Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultText);
        eText.setText(eText.getText()+"4");
    }
    public void btn05Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultText);
        eText.setText(eText.getText()+"5");
    }
    public void btn06Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultText);
        eText.setText(eText.getText()+"6");
    }
    public void btn07Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultText);
        eText.setText(eText.getText()+"7");
    }
    public void btn08Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultText);
        eText.setText(eText.getText()+"8");
    }
    public void btn09Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultText);
        eText.setText(eText.getText()+"9");
    }
    public void btnAddClick(View view){
        optr = Operator.add;
        TextView eText = (TextView) findViewById(R.id.resultText);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void btnMinusClick(View view){

        TextView eText = (TextView) findViewById(R.id.resultText);
        optr = Operator.minus;
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void btnDivideClick(View view){
        optr = Operator.divide;
        TextView eText = (TextView) findViewById(R.id.resultText);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void btnMultiClick(View view){
        optr = Operator.multiply;
        TextView eText = (TextView) findViewById(R.id.resultText);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void btnCEClick(View view){
        TextView eText = (TextView) findViewById(R.id.resultText);
        eText.setText("");
    }
    public void btnDotClick(View view){
        TextView eText = (TextView) findViewById(R.id.resultText);
        eText.setText(eText.getText()+".");
    }
    public void btnEQClick(View view){
        if(optr != Operator.none){
            TextView eText = (TextView) findViewById(R.id.resultText);
            data2 = Double.parseDouble(eText.getText().toString());
            double result =0;
            if(optr == Operator.add){
                result = data1+data2;
            }
            else if(optr == Operator.minus){
                result = data1-data2;
            }
            else if(optr == Operator.divide){
                result = data1/data2;
            }
            else if(optr == Operator.multiply){
                result = data1*data2;
            }
            optr = Operator.none;
            data1 = result;
            if(result-(int)result !=0){
                eText.setText(String.valueOf(result));
            }
            else{
                eText.setText(String.valueOf((int)result));
            }
        }

    }
}
