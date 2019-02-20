package leban.nait.ca.simplefunfacts;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
/*
Created by Leban Mohamed.


 */
public class SimpleFunFactsActivity extends AppCompatActivity implements View.OnClickListener
{

    private static final String KEY_FACT = "KEY_FACT";
    private static final String KEY_COLOR = "KEY_COLOR";


    Button nextFunFact;
    TextView funFact;
    FactBook factBook = new FactBook();
    private RelativeLayout layout;
    private ColorWheel colorWheel = new ColorWheel();
    public String fact;
    private int bgcolor = Color.parseColor(colorWheel.colors[3]);


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_FACT, fact);
        outState.putInt(KEY_COLOR, bgcolor);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        fact = savedInstanceState.getString(KEY_FACT);
        funFact.setText(fact);
        bgcolor = savedInstanceState.getInt(KEY_COLOR);
        funFact.setBackgroundColor(bgcolor);
        nextFunFact.setTextColor(bgcolor);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_fun_facts);
        funFact = (TextView)findViewById(R.id.facttextView);
        nextFunFact = (Button)findViewById(R.id.showfactbutton);
        layout = (RelativeLayout)findViewById(R.id.mainlayout);

        View.OnClickListener listener = (v) ->
        {
            fact = factBook.getFact();
            funFact.setText(fact);
            bgcolor = colorWheel.getColor();
            layout.setBackgroundColor(bgcolor);
            funFact.setBackgroundColor(bgcolor);
            nextFunFact.setTextColor(bgcolor);

        };
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
