package com.magmamobile.mmusia.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.magmamobile.mmusia.MMUSIA;

public class ItemView extends LinearLayout
{

    private Context mContext;

    public ItemView(Context context)
    {
        super(context);
        setOrientation(LinearLayout.VERTICAL);
        buildView(context);
    }

    public ItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mContext = context;
        buildView(context);
    }

    public void buildView(Context context)
    {
        LinearLayout linearlayout = new LinearLayout(context);
        linearlayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        linearlayout.setOrientation(LinearLayout.HORIZONTAL);
        linearlayout.setGravity(16);
        linearlayout.setMinimumHeight(MMUSIA.dpi(48F));
        linearlayout.setId(MMUSIA.RES_ID_ITEM_LINEARITEM);
        ImageViewEx imageviewex = new ImageViewEx(context);
        imageviewex.setLayoutParams(new android.view.ViewGroup.LayoutParams(MMUSIA.dpi(48F), MMUSIA.dpi(48F)));
        imageviewex.setId(MMUSIA.RES_ID_ITEM_IMG);
        imageviewex.setPadding(MMUSIA.dpi(5F), MMUSIA.dpi(5F), MMUSIA.dpi(10F), MMUSIA.dpi(5F));
        LinearLayout linearlayout1 = new LinearLayout(context);
        linearlayout1.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        linearlayout1.setOrientation(LinearLayout.VERTICAL);
        TextView textview = new TextView(context);
        textview.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textview.setId(MMUSIA.RES_ID_ITEM_TITLE);
        textview.setTextColor(0xff000080);
        textview.setTypeface(Typeface.DEFAULT, 1);
        textview.setMaxLines(2);
        TextView textview1 = new TextView(context);
        textview1.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        textview1.setId(MMUSIA.RES_ID_ITEM_DATE);
        textview1.setTextColor(0xffa0a0a0);
        textview1.setTypeface(Typeface.DEFAULT, 0);
        textview1.setMaxLines(1);
        TextView textview2 = new TextView(context);
        textview2.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textview2.setId(MMUSIA.RES_ID_ITEM_DESC);
        textview2.setTextColor(0xffc0c0c0);
        textview2.setTypeface(Typeface.DEFAULT, 0);
        textview2.setMaxLines(3);
        View view = new View(context);
        view.setBackgroundColor(0xffc0c0c0);
        view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, 1));
        linearlayout1.addView(textview);
        linearlayout1.addView(textview1);
        linearlayout1.addView(textview2);
        linearlayout.addView(imageviewex);
        linearlayout.addView(linearlayout1);
        addView(linearlayout);
        addView(view);
    }
}
