/**
 * Created by Wing Fai Jason Law on 3/18/2016.
 * Citation:
 * http://stackoverflow.com/questions/13777888/factory-pattern-with-inheritance
 * http://stackoverflow.com/questions/16042550/inserting-an-element-at-the-beginning-of-vector
 * http://stackoverflow.com/questions/13029261
 *                              /design-patterns-factory-vs-factory-method-vs-abstract-factory
 * http://www.codeproject.com/Articles/825700/Beginners-Guide-to-Android-Animation-Graphics#canvas
 */

package com.wingfaijasonlaw.csc413hw3;

import android.content.Context;
import android.graphics.Canvas;

public class Rectangle extends Shape {
    InitialShape myRect = new InitialShape();

    public Rectangle(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas) {
        setShapeAlpha(1.0f); // Set shape alpha to 1.0
        // draw rectangle with spec. defined in InitialShape()
        canvas.drawRect(myRect.getLeft(), myRect.getTop(), myRect.getRight(),
                myRect.getBottom(), myRect.getPaintShape());
    }

    @Override
    ShapeType getShapeType() {
        return ShapeType.RECTANGLE;
    }
}
