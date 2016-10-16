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

public class ShapeFactory {
    public Shape getShape(Context context, String shape){

        if("CIRCLE".equals(shape)){
            return new Circle(context);
        }else if("RECTANGLE".equals(shape)){
            return new Rectangle(context);
        }

        return null;
    }
}
