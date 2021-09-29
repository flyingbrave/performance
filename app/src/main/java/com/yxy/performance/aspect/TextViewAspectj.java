package com.yxy.performance.aspect;

import android.util.Log;
import android.widget.TextView;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TextViewAspectj {

    @AfterReturning(pointcut = "execution(* *..*.testAfterReturning())", returning = "textView")
    public void getTextView(TextView textView) {
        Log.d("tag5", "text--->" + textView.getText().toString());
    }
    @AfterThrowing(pointcut = "call(* *..*.testAfterThrowing())", throwing = "throwable")
    public void reportException(Throwable throwable) {
        Log.e("tag5", "throwable--->" + throwable);
    }



}
