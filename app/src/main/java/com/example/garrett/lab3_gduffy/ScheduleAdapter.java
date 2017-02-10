package com.example.garrett.lab3_gduffy;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
/**
 * Created by Garrett on 2/10/2017.
 */

public class ScheduleAdapter extends ArrayAdapter<String>{
    ScheduleAdapter (Context context, String[] schedule) {
        super(context, R.layout.schedule_item, schedule);
    }
    public View getView (int position, View convertView, ViewGroup parent) {
        LayoutInflater scheduleInflater = LayoutInflater.from(getContext());
        View scheduleView = scheduleInflater.inflate(R.layout.schedule_item, parent, false);

        String matchItem = getItem(position);
        TextView teamName = (TextView) scheduleView.findViewById(R.id.scheduleListView);
        teamName.setText(matchItem);
        return scheduleView;
    }
}
