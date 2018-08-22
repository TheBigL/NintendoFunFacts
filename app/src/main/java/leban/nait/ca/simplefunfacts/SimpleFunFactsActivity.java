package leban.nait.ca.simplefunfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
/*
Created by Leban Mohamed.


 */
public class SimpleFunFactsActivity extends AppCompatActivity implements View.OnClickListener {
    Button nextFunFact;
    TextView funFact;
    FactBook factBook = new FactBook();
    private RelativeLayout layout;
    private ColorWheel colorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_fun_facts);
        funFact = (TextView)findViewById(R.id.facttextView);
        nextFunFact = (Button)findViewById(R.id.showfactbutton);
        layout = (RelativeLayout)findViewById(R.id.mainlayout);
        nextFunFact.setOnClickListener(this);



    }

    @Override
    public void onClick(View v)
    {

        funFact.setText(factBook.getFact());
        layout.setBackgroundColor(colorWheel.getColor());
        nextFunFact.setTextColor(colorWheel.getColor());

    }
}
