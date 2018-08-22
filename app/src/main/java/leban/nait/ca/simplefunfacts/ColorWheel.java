package leban.nait.ca.simplefunfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Leban A. Mohamed on 2016-05-14.
 */
public class ColorWheel {
    private final String[] colors = {"#e15258",
            "#3079ab",
            "#51b46d",
            "#e0ab18",
            "#f092b0",
            "#53bbb4",
            "#c25975",
            "#f9845b",
            "#838cc7",
            "#39add1",
            "#301934",
            "#FF4F00",
            "#98FB98",
            "#009E60",
            "#3F00FF",
            "#4666FF"};
    public  int getColor()
    {

        Random random = new Random();
        int rNumber = random.nextInt(colors.length);
        String color = colors[rNumber];
        int colorInt = Color.parseColor(color);
        return colorInt;
    }
}
