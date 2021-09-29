package com.yxy.performance.aspect;

import android.os.Trace;
import android.util.Log;

import androidx.core.os.TraceCompat;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TraceTagAspectj {
    @Before("execution(* android.app.Activity+.onCreate(..))")
    public void before(JoinPoint joinPoint) {
        Log.i("tag5","joinPoint.getSignature().toString() 11 "+(joinPoint.getSignature().toString()));
        TraceCompat.beginSection(joinPoint.getSignature().toString());
    }

    @After("execution(* android.app.Activity+.onCreate(..))")
    public void after(JoinPoint joinPoint) {
        Log.i("tag5","joinPoint.getSignature().toString()22  "+(joinPoint.getSignature().toString()));
        TraceCompat.endSection();

    }


}
