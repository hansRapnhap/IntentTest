package be.rapnhap.myintesttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSecondActivity = findViewById(R.id.buttonSecondIntent);
        buttonSecondActivity.setOnClickListener(view -> OnClick(view));

        Button buttonOtherActivity = findViewById(R.id.buttonOtherActivity);
        buttonOtherActivity.setOnClickListener(view -> OnClick(view));



    }

    private void OnClick(View view) {
        switch (view.getId()) {
            case R.id.buttonSecondIntent:
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.rapnhap.be"));
                startActivity(intent1);
                break;
            case R.id.buttonOtherActivity:
                Intent intent2 = new Intent("be.rapnhap.myintestTest.SecondActivity");
                startActivity(intent2);
                break;
        }
    }
}