package m2iformation.fr.projetcalculette;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView ecran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ecran = findViewById(R.id.tvEcran);
    }

    public void effacer(View view) {
        ecran.setText("0");
    }

    public void touche(View view) {
        Button bt = (Button) view;
        String calcul = ecran.getText().toString();
        calcul = calcul + bt.getText();
        ecran.setText(calcul);
    }
}
