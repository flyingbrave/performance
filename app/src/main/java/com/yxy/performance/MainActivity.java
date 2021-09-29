package com.yxy.performance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("tag5","onCreate");

        findViewById(R.id.aaa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        testAfterReturning();
        test();
//        testAfterThrowing();
    }

    private TextView testAfterReturning() {
        return findViewById(R.id.aaa);
    }

    private void testAfterThrowing() {
        TextView textView = null;
        textView.setText("aspectj");
    }

    private void test(){
        try {
            Thread.sleep(1100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}