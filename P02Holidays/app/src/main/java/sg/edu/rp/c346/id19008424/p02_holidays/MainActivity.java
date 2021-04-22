package sg.edu.rp.c346.id19008424.p02_holidays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvHoliday;
    ArrayList<String> alHoliday;
    ArrayAdapter<String> aaHoliday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvHoliday = (ListView) this.findViewById(R.id.lvHoliday);

        alHoliday = new ArrayList<String>();
        alHoliday.add("Secular");
        alHoliday.add("Ethnic");

        aaHoliday = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,alHoliday);
        lvHoliday.setAdapter(aaHoliday);
        lvHoliday.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent =  new Intent(MainActivity.this, Holiday.class);
                intent.putExtra("year", alHoliday.get(i));
                startActivity(intent);
            }
        });
    }
}
