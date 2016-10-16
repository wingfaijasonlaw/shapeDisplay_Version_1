package com.wingfaijasonlaw.csc413hw3;

import android.graphics.Color;
import android.graphics.Paint;
import java.util.Random;

/**
 * Created by Wing Fai Jason Law on 3/23/2016.
 */
public class InitialShape {
    private float radius, left, top, right, bottom, x, y;
    private Paint paintShape;

    InitialShape(){
        Random random = new Random();
        left = (float)random.nextInt(100) + 50 + random.nextFloat(); // Set left randomly from 50 to 150.
        top = (float)random.nextInt(200) + 50 + random.nextFloat(); // Set top randomly from 50 to 250.
        right = (float)random.nextInt(100) + 50 + left; // Set right randomly from 100 to 300.
        bottom = (float)random.nextInt(200) + 50 + top; // Set buttom randomly from 100 to 500.

        radius = (float)random.nextInt(100) + 50 + random.nextFloat(); // Set radius randomly from 50 to 150.
        x = radius;
        y = radius;

        // Set paint spec. and random color.
        int randomColor = Color.rgb(random.nextInt(255), random.nextInt(255), random.nextInt(255));
        paintShape = new Paint(Paint.ANTI_ALIAS_FLAG);
        paintShape.setColor(randomColor);
        paintShape.setStyle(Paint.Style.FILL);
    }

    float getRadius(){
        return this.radius;
    }

    float getLeft(){
        return this.left;
    }

    float getTop(){
        return this.top;
    }

    float getRight(){
        return this.right;
    }

    float getBottom(){
        return this.bottom;
    }

    float getX(){
        return this.x;
    }

    float getY(){
        return this.y;
    }

    Paint getPaintShape(){
        return this.paintShape;
    }
}
