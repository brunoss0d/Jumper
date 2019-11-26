package com.dossmann.jumper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class JumperGame extends View {
    private Paint paint;

    //start dumb copy
    private List<PlatformObject> plateforms = new ArrayList<>();

    //end dumb copy

    private int screenWidth;
    private int screenHeight;


    public JumperGame(Context context) {
        super(context);

        // create the Paint and set its color
        paint = new Paint();
        paint.setColor(Color.GRAY);

    }

    @Override

    protected void onDraw(Canvas canvas) {
        screenWidth = Utils.getScreenSize(getContext()).x;
        screenHeight = Utils.getScreenSize(getContext()).y;
        int yStep = 150;
        for (int i = 0; i < 1000; i++)
        {
            float nextPosX = Utils.getRandomInRange(0, screenWidth-160);
            float nextPosY = yStep*i + Utils.getRandomInRange(0, 200);
            PlatformObject platformObject = new PlatformObject(nextPosX, nextPosY);
            platformObject.draw(canvas, paint);
        }
        }


}
