package robot.com.myapplication.number


import android.content.Context
import android.util.DisplayMetrics
import android.util.TypedValue
import android.view.WindowManager


class ScreenX private constructor(){

    companion object {
        private var screenX : ScreenX? = null
        public fun getInstance(context : Context) : ScreenX {
            if (screenX == null) {
                screenX = ScreenX()
            }
            return screenX!!
        }
    }

    /**
     * 获取屏幕宽度 ，单位px
     */
    fun getWidth(context : Context) : Int {
        var wm = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        var outMetrics = DisplayMetrics()
        wm.getDefaultDisplay().getMetrics(outMetrics)
        return outMetrics.widthPixels
    }

    /**
     * 获取屏幕高度，单位px
     */
    fun getHeight(context : Context) : Int {
        var wm = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        var outMetrics = DisplayMetrics()
        wm.getDefaultDisplay().getMetrics(outMetrics)
        return outMetrics.heightPixels
    }

    /**
     * 将px值转换成dip值
     */
    fun px2dip(px : Int, context : Context) : Int {
        return (px / context.resources.getDisplayMetrics().density) as Int
    }

    /**
     * 将dip值转换成px值
     */
    fun dip2px(dip : Int, context : Context) : Int {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dip.toFloat(), context.resources.getDisplayMetrics()) as Int
    }

    /**
     * 将sp值转换成px值
     */
    fun sp2px(spValue : Int, context : Context) : Int {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, spValue.toFloat(), context.resources.getDisplayMetrics()) as Int
    }
}
