package com.magmamobile.game.engine;

public class FadeInOut
{

    private static final int MODE_FADEINT = 1;
    private static final int MODE_FADEOUT = 2;
    private static final int MODE_FINISH = -1;
    private static final int MODE_IDLE = 0;
    private static int _alpha;
    private static int _fade;
    private static int _speed;

    public FadeInOut()
    {
    }

    public static void fadeIn()
    {
        _fade = 1;
        _alpha = 255;
    }

    public static void fadeOut()
    {
        _fade = 2;
        _alpha = 0;
    }

    public static int getSpeed()
    {
        return _speed;
    }

    public static boolean hasFinish()
    {
        return _fade == -1;
    }

    public static boolean isFading()
    {
        return _fade > 0;
    }

    public static void onAction()
    {
        if(_fade == 0)
            return;
        if(_fade == -1)
        {
            _fade = 0;
            return;
        }
        if(_fade == 2)
        {
            _alpha += _speed;
            if(_alpha > 255)
            {
                _fade = -1;
                _alpha = 255;
            }
            return;
        }
        _alpha -= _speed;
        if(_alpha < 0)
        {
            _fade = -1;
            _fade = 0;
        }
    }

    public static void onInitialize()
    {
        _fade = 0;
        _alpha = 255;
        _speed = 10;
    }

    public static void onRender()
    {
        if(_fade == 0)
        {
            return;
        } else
        {
            Game.drawColor(_alpha << 24);
            return;
        }
    }

    public static void onTerminate()
    {
    }

    public static void setSpeed(int i)
    {
        _speed = i;
    }
}
