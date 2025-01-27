package saintindustries.cs408.lab2b;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import saintindustries.cs408.lab2b.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
    public void OnClickConvert(View v){
        EditText faren = findViewById(R.id.editTextNumberDecimal);
        EditText cel = findViewById(R.id.editTextNumberDecimal2);
        try {
            String stringCel = cel.getText().toString();
            String stringFaren = faren.getText().toString();
            float floatFaren = 0.00f;
            float floatCel = 0.00f;

            if(!stringCel.isEmpty() && !stringFaren.isEmpty())
            {
                cel.setText(String.valueOf((floatFaren-32)*(5/9)));
            }
            else if (!stringCel.isEmpty()) {

                 floatCel =  Float.parseFloat(stringCel);
                faren.setText(String.valueOf(floatCel*(9/5)+32));


            } else if(!stringFaren.isEmpty()){
                floatFaren = Float.parseFloat(stringFaren);
                cel.setText(String.valueOf((floatFaren-32)*(5/9)));

            }
        } catch (NumberFormatException e) {
            // Handle invalid input if needed
        }


    }
}