package robot.com.myapplication.number;

import android.app.Application;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;

import org.xml.sax.XMLReader;

import robot.com.myapplication.App;

import static java.security.AccessController.getContext;

public class SizeLabel implements Html.TagHandler {
    private int size;
    private int startIndex = 0;
    private int stopIndex = 0;

    public SizeLabel(int size) {
        this.size = size;
    }

    @Override
    public void handleTag(boolean opening, String tag, Editable output, XMLReader xmlReader) {
        if (tag.toLowerCase().equals("size")) {
            if (opening) {
                startIndex = output.length();
            } else {
                stopIndex = output.length();
                output.setSpan(new AbsoluteSizeSpan(dip2px(size)), startIndex, stopIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }
    }

    public static int dip2px(float dpValue) {
        final float scale = App.getApp().getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}