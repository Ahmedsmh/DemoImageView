package sg.edu.rp.c346.id19008424.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {
    private ArrayList<Holiday> holiday;
    private Context context;
    private TextView tvHol;
    private ImageView ivHol;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects) {
        super(context, resource, objects);
        holiday = objects;

        this.context = context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        // "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvHol = (TextView) rowView.findViewById(R.id.tvHolidays);
        // Get the ImageView object
        ivHol = (ImageView) rowView.findViewById(R.id.ivHols);

        // The parameter "position" is the index of the
        // row ListView is requesting.
        // We get back the food at the same index.
        Holiday currentHol = holiday.get(position);
        // Set the TextView to show the food

        tvHol.setText(currentHol.getName());

        if (currentHol.equals("Secular")) {
            holiday.add(new Holiday("New Year's Day", "1 Jan 2021", R.drawable.newyear));
            holiday.add(new Holiday("Labour Day", "1 May 2021", R.drawable.labourday));
            holiday.add(new Holiday("National Day", "9 Aug 2021", R.drawable.nationalday));
        } else {
            holiday.add(new Holiday("Chinese New Year", "12 - 13 Feb 2021", R.drawable.cny));
            holiday.add(new Holiday("Good Friday", "2 April 2021", R.drawable.goodfriday));
            holiday.add(new Holiday("Hari Raya Puasa", "13 May 2021", R.drawable.harirayapuasa));
        }

        return rowView;
    }
}
