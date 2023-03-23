package com.infinitylearn.swipebutton.Controller;


import com.infinitylearn.swipebutton.View.Swipe_Button_View;

/**
 * Created by Narendra.
 */

public interface OnSwipeCompleteListener {
    void onSwipe_Forward(Swipe_Button_View swipe_button_view);
    void onSwipe_Reverse(Swipe_Button_View swipe_button_view);
}
