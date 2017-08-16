package robot.com.myapplication.number;

import android.text.TextUtils;

import java.lang.reflect.Field;

/**
 * Created by win10 on 2017/7/14.
 */

public class Animal {
    private String name = "Animal";

    public Animal() {
        initValues();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void initValues() {
        Field[] fields = this.getClass().getDeclaredFields();
        Class<?> cls = this.getClass();

        for (int j = 0; j < fields.length; j++) {
            String keyStr = fields[j].getName();
            Field field = null;
            try {
                field = cls.getDeclaredField(keyStr);
                field.setAccessible(true);
                field.set(this, "test");
            } catch (NoSuchFieldException e) {

                e.printStackTrace();
            } catch (IllegalAccessException e) {

                e.printStackTrace();
            } catch (IllegalArgumentException e) {

                e.printStackTrace();
            }
        }
    }

}
