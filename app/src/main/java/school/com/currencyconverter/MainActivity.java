package school.com.currencyconverter;


import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends Activity {
    private TextView uitkomstView;
    private Button euroNaarUSD;
    private Button USDnaarEuro;
    private EditText userInput;
    private double euroDollar = 1.11;
    private double DollarEuro = 0.89;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uitkomstView = (TextView) findViewById(R.id.uitkomstPrinten);
        userInput = (EditText) findViewById(R.id.editText);

    }

    public void bereken€naar$(View view){
        String rekenBedragString = userInput.getText().toString();
        double rekenBedrag = 0;
        if(rekenBedragString.equals("")){
            Toast.makeText(getApplicationContext(), "Voer een bedrag in", Toast.LENGTH_LONG).show();

        }
        else{
            rekenBedrag = Double.parseDouble(rekenBedragString);
        }
        double uitkomst = rekenBedrag * euroDollar;
        DecimalFormat df = new DecimalFormat("€ ###,###.00");
        uitkomstView.setText(df.format (uitkomst));
    }

    public void bereken$naar€(View view){
        String rekenBedragString = userInput.getText().toString();
        double rekenBedrag = 0;
        if(rekenBedragString.equals("")){
            Toast.makeText(getApplicationContext(), "Voer een bedrag in", Toast.LENGTH_LONG).show();

        }
        else{
            rekenBedrag = Double.parseDouble(rekenBedragString);
        }
        double uitkomst = rekenBedrag * DollarEuro;
        DecimalFormat df = new DecimalFormat("€ ###,###.00");
        uitkomstView.setText(df.format (uitkomst));

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
