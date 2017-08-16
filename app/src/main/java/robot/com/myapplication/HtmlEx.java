package robot.com.myapplication;


import android.content.Context;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlEx {
    public static final String FONT_SIZE_SPLIT = "\'";
    public static final String FONT_SIZE_PATTERN = "size=\'\\d+\'";

    public static final String FONT_SIZE_SPLIT2 = "\"";
    public static final String FONT_SIZE_PATTERN2 = "size=\"\\d+\"";

    /**
     * 后端会默认传递px的为单位的字号
     * @param content
     * @param textView
     */
    public static void setTextSize(String content, TextView textView) {
        if (textView == null) {
            return;
        }

        SizeAttr sizeAttr = decodePattern(content);
        if (!sizeAttr.isHasTag()) {
            sizeAttr = decodePattern2(content);
        }

        if (sizeAttr.isHasTag()) {
            textView.setTextSize(sizeAttr.size);
        }
    }

    private static SizeAttr decodePattern(String content) {
        Pattern pattern = Pattern.compile(FONT_SIZE_PATTERN);
        Matcher matcher = pattern.matcher(content);

        SizeAttr sizeAttr = new SizeAttr();
        if (matcher.find()) {
            String matchStr = matcher.group();
            String sizeStr = matchStr.split("=")[1].replace(FONT_SIZE_SPLIT, "");
            int size;
            try {
                size = Integer.parseInt(sizeStr);
                sizeAttr.setHasTag(true);
                sizeAttr.setSize(size);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        return sizeAttr;
    }

    private static SizeAttr decodePattern2(String content) {
        Pattern pattern = Pattern.compile(FONT_SIZE_PATTERN2);
        Matcher matcher = pattern.matcher(content);

        SizeAttr sizeAttr = new SizeAttr();
        if (matcher.find()) {
            String matchStr = matcher.group();
            String sizeStr = matchStr.split("=")[1].replace(FONT_SIZE_SPLIT2, "");
            int size;
            try {
                size = Integer.parseInt(sizeStr);
                sizeAttr.setHasTag(true);
                sizeAttr.setSize(size);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        return sizeAttr;
    }

    public static class SizeAttr {
        private boolean hasTag = false;
        private int size = 0;

        public SizeAttr() {
        }

        public SizeAttr(boolean hasTag, int size) {
            this.hasTag = hasTag;
            this.size = size;
        }

        public boolean isHasTag() {
            return hasTag;
        }

        public void setHasTag(boolean hasTag) {
            this.hasTag = hasTag;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }
    }

}
