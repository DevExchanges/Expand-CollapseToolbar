package devexchanges.info.expandcollapseactionbar.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import devexchanges.info.expandcollapseactionbar.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView paralaxActivity = (TextView)findViewById(R.id.parallax);
        TextView exandingActivity = (TextView)findViewById(R.id.expandable);
        TextView hideActivity = (TextView)findViewById(R.id.hide);

        //set event click handling for TextViews
        hideActivity.setOnClickListener(onClickListener(HiddenToolbarActivity.class));
        paralaxActivity.setOnClickListener(onClickListener(ParalaxToobarActivity.class));
        exandingActivity.setOnClickListener(onClickListener(ExpandableToolBarActivity.class));
    }

    private View.OnClickListener onClickListener(final Class<?> c) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, c);
                startActivity(i);
            }
        };
    }

    protected void setData(ArrayList<String> stringArrayList) {
        stringArrayList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            stringArrayList.add("Item " + (i + 1));
        }
    }
}
