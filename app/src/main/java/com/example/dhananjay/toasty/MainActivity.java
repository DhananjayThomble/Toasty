package com.example.dhananjay.toasty;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToast(View view){

        switch (view.getId()){

            case R.id.btn1:
                Toasty.error(this,"Login Failed",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toasty.success(this,"Login Success",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn3:
                Toasty.info(this,"Info",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn4:
                Toasty.warning(this,"Opps",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn5:
                Toasty.normal(this,"Opps",Toast.LENGTH_SHORT, ContextCompat.getDrawable(this,R.drawable.ic_account_balance)).show();


        }
    }
}
