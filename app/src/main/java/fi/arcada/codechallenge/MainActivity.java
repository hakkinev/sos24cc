package fi.arcada.codechallenge;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView outputText;
    EditText inputText;

    double[] values = {4, 4, 12, 0.5, 2, 6, 2, 9, 3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputText = findViewById(R.id.outText);
        inputText = findViewById(R.id.inputText);

        outputText.setText("Min app funkar!");

    }

    public void buttonHandler(View view) {
        String text = inputText.getText().toString();
        outputText.setText(text);
        calculate();

    }

    private void calculate() {
        //medelvärde
        double mean = calcMean(values);
        // printa resultat
        outputText.setText("Medelvärdet är: " + mean);
    }


    private double calcMean(double[] data) {
        double sum = 0;
        for (double value : data) {
            sum += value;
        }
        return sum / data.length;
    }
}