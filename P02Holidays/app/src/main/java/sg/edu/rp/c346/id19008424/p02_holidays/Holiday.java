package sg.edu.rp.c346.id19008424.p02_holidays;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Holiday{
    private String name;
    private String date;
    private int image;

    public Holiday(String name, String date, int image){
        this.name = name;
        this.date = date;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getImage() {
        return image;
    }
}

