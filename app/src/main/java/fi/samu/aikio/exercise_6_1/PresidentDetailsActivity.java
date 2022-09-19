package fi.samu.aikio.exercise_6_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PresidentDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_president_details);

        Bundle b = getIntent().getExtras();
        int i = b.getInt(MainActivity.EXTRA, 0);

        TextView presidentProfile = findViewById(R.id.presidentTextView);
        presidentProfile.setText(Presidents.getInstance().getPresident(i).getName() + "\n" +
                    Presidents.getInstance().getPresident(i).getStart() + " " +
                    Presidents.getInstance().getPresident(i).getStop() + "\n" +
                    Presidents.getInstance().getPresident(i).getDescription());

    }
}