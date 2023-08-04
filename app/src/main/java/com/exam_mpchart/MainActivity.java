package com.exam_mpchart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LineChart lineChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lineChart = findViewById(R.id.line_chart);

        drawLineChart();
    }

    public void drawLineChart() {
        // Real Data
        ArrayList<Entry> entry = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            float val = (float) Math.random();
            entry.add(new Entry(i, val));
        }

        // LineChart Data Set
        LineData lineData = new LineData();
        LineDataSet lineDataSet = new LineDataSet(entry, "Line #1");
        lineData.addDataSet(lineDataSet);

        // LineChart Draw
        lineChart.setData(lineData);
        lineChart.invalidate();
    }
}