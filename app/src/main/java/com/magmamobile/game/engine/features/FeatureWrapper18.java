package com.magmamobile.game.engine.features;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.SurfaceView;
import android.view.View;
import com.magmamobile.game.engine.*;

public final class FeatureWrapper18 extends FeatureWrapper
{

    public FeatureWrapper18()
    {
    }

    public SurfaceView createGameView(Context context)
    {
        return new GameView11(context);
    }

    public boolean isGoogleTV()
    {
        return Game.getApplication().getPackageManager().hasSystemFeature("com.google.android.tv");
    }

    public boolean isOrientationInverted()
    {
        return true;
    }

    public void setLayerTypeSofware(View view)
    {
        if(view != null)
        {
            view.setLayerType(1, null);
        }
    }

    public void setOnSystemUiVisibilityChangeListener(final View view)
    {
        view.setOnSystemUiVisibilityChangeListener(new android.view.View.OnSystemUiVisibilityChangeListener() {
            public void onSystemUiVisibilityChange(int i)
            {
                Game.OnSystemUiVisibility(view, i);
            }
        });
    }

    public void setSystemUiVisibility(View view, int i)
    {
        if(view != null)
        {
            view.setSystemUiVisibility(i);
        }
    }

    public boolean startFacebookShare(String s)
    {
        return FeatureWrapper05._startFacebookShare(s);
    }
}
