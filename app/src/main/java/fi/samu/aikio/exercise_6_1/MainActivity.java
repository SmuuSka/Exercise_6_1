package fi.samu.aikio.exercise_6_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA = "President";
    private ListView listView;
    private Presidents presidents = Presidents.getInstance();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presidents.getPresidentsList().add(new President("Stahlberg, Kaarlo Juho", 1919, 1925, "Eka presidentti"));
        presidents.getPresidentsList().add(new President("Relander, Lauri Kristian", 1925, 1931, "Reissulasse"));
        presidents.getPresidentsList().add(new President("Svinhufvud, Pehr, Evind", 1931, 1937, "Ukko-Pekka"));
        presidents.getPresidentsList().add(new President("Kallio, Kyosti", 1937, 1940, "Neljas presidentti"));
        presidents.getPresidentsList().add(new President("Ryti, Risto Heikki", 1940, 1944, "Nuorena Kustu Kalliokangas"));
        presidents.getPresidentsList().add(new President("Mannerheim, Carl Gustav", 1944, 1946, "Marski"));
        presidents.getPresidentsList().add(new President("Paasikivi, Juho Kusti", 1946, 1956, "Äkäinen ukko"));
        presidents.getPresidentsList().add(new President("Kekkonen, Urho Kaleva", 1956, 1982, "Pelimies"));
        presidents.getPresidentsList().add(new President("Koivisto, Mauno Henrik", 1982, 1994, "Manu"));
        presidents.getPresidentsList().add(new President("Ahtisaari, Martti Oiva", 1994, 2000, "Mahtisaari"));
        presidents.getPresidentsList().add(new President("Halonen, Tarja Kaarina", 2000, 2012, "Eka naispressa"));
        presidents.getPresidentsList().add(new President("Niinistö, Sauli Väinämö", 2012, 2024, "Owner of Lennu, the First Dog"));

        listView = findViewById(R.id.presidentsListView);
        ArrayAdapter<President> arrayAdapter = new ArrayAdapter<>(this, R.layout.customlayout, R.id.presidentTextView, presidents.getPresidentsList());
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("Item Click", "onItemClick(" + i + ")");
                Intent nextActivity = new Intent(MainActivity.this, PresidentDetailsActivity.class);
                nextActivity.putExtra(EXTRA, i);
                startActivity(nextActivity);
            }
        });

    }
}