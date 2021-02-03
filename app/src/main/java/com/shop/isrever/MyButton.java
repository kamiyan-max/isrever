package com.shop.isrever;

import android.content.Context;

public class MyButton extends androidx.appcompat.widget.AppCompatImageButton{

    private boolean isBlack;
    private int x;
    private int y;
    private boolean isClicked;
    private boolean canClicked;

    public MyButton(Context context) {
        super(context);
        isBlack = false;
        isClicked = false;
        canClicked = false;
    }
    public boolean isCanClicked() {
        return canClicked;
    }

    public void setCanClicked(boolean canClicked) {
        this.canClicked = canClicked;
    }

    public boolean getBlack() {
        return isBlack;
    }

    public void setBlack(boolean black) {
        this.isBlack = black;
    }

    public boolean getClicked() {
        return isClicked;
    }

    public void setClicked(boolean clicked) {
        this.isClicked = clicked;
    }
    public int getAtX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getAtY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

