package com.example.dell.ffffffff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton image1,image2,image3,image4,image5,image6,image7,image8,image9,image10,image11,image12;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1=(ImageButton) findViewById(R.id.imageButton1);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),CMD.class);
                startActivity(intent);
            }
        });

        image2=(ImageButton) findViewById(R.id.imageButton2);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),PS.class);
                startActivity(intent);
            }
        });
        image3=(ImageButton) findViewById(R.id.imageButton3);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),PYTHON.class);
                startActivity(intent);
            }
        });
        image4=(ImageButton) findViewById(R.id.imageButton4);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ORACLE4.class);
                startActivity(intent);
            }
        });

        image5=(ImageButton) findViewById(R.id.imageButton5);
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MOZILA5.class);
                startActivity(intent);
            }
        });
        image6=(ImageButton) findViewById(R.id.imageButton6);
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MS6.class);
                startActivity(intent);
            }
        });
        image7=(ImageButton) findViewById(R.id.imageButton7);
        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),JAVA7.class);
                startActivity(intent);
            }
        });
        image8=(ImageButton) findViewById(R.id.imageButton8);
        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),NETBEAN8.class);
                startActivity(intent);
            }
        });
        image9=(ImageButton) findViewById(R.id.imageButton9);
        image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),EXTRA9.class);
                startActivity(intent);
            }
        });
        image10=(ImageButton) findViewById(R.id.imageButton10);
        image10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),COREL10.class);
                startActivity(intent);
            }
        });
        image11=(ImageButton) findViewById(R.id.imageButton11);
        image11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),EXTRA11.class);
                startActivity(intent);
            }
        });
        image12=(ImageButton) findViewById(R.id.imageButton12);
        image12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),TALLY12.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.threedots,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch(id)
        {
            case R.id.share:
                Toast.makeText(this, "share clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rate:
                Toast.makeText(this, "rate", Toast.LENGTH_SHORT).show();
                break;
            case R.id.help:
                Toast.makeText(this, "help clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.about_us:
                Toast.makeText(this, "about_us clicked", Toast.LENGTH_SHORT).show();
                break;

        }

        return true;

    }
}
