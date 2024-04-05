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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputText = findViewById(R.id.outText);
        inputText = findViewById(R.id.inputText);

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
        double[] values = {4, 4, 12, 0.5, 2, 6, 2, 9, 3};
        outputText.setText(String.format(
                "Medelvärdet: %.2f" , statistics.calcMean(values)));
    }

}