package fi.arcada.codechallenge;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView outputText;
    EditText inputText;

    double[] testdata = {2, 4, 6, 8, 10};
    ArrayList<Double> values = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputText = findViewById(R.id.outText);
        inputText = findViewById(R.id.inText) ;

        // vi fyller vår Arraylist med värdena från testdata-arrayen
        for (double value : testdata) {
            values.add(value);
        }

        double version = 3.14159;
        int year = 2024;
        String author = "Hakkinev";



        outputText.setText(String.format(
                "Appens version %.1f år %d by %s",
                version,
                year,
                author));

    }

    public void buttonHandler(View view) {
        String text = inputText.getText().toString();
        outputText.setText(text);

    }

    public void calculate(View view) {
        outputText.setText(String.format(
                "Medelvärdet: %.2f\nMedianvärdet: %.2f\nStandardavvikelse: %.2f" ,
                statistics.calcMean(values),
                statistics.calcMedian(values),
                statistics.calcStdev(values)
        ));
    }

}