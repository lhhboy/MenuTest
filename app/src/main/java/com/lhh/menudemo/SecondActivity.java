package com.lhh.menudemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("SecondActivity",  "Task id is "+getTaskId());
        Button button_2=findViewById(R.id.button_2);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /*11 Intent intent=new Intent();
                intent.putExtra("data_return","HelloFirstActivity");
                setResult(RESULT_OK,intent);
                finish();*/
               Intent intent=new Intent(SecondActivity.this,ThirdActivity.class);
               startActivity(intent);
            }
        });
    }

    /*@Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent=new Intent();
        intent.putExtra("data_return","HelloFirstActivity");
        setResult(RESULT_OK,intent);
        finish();
    }*/
public static void actionStart(Context context,String data1,String data2){
    Intent intent = new Intent(context,SecondActivity.class);
    intent.putExtra("param1",data1);
    intent.putExtra("patam2",data2);
    context.startActivity(intent);
}
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SecondActivity", "onDestroy: ");
    }

}
