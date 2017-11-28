package com.animeshjain.assignment9_1;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView colorChangingTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colorChangingTxt = (TextView)findViewById(R.id.colorChangingTxt);
    }

//    onCreateOptionMenu method to implement MenuInflater

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

//        onOptionItemSelected Method to set operation for every item in the option Menu selected

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){

            case R.id.redMenuItem:{

//                Setting Color of text to Red if Red option is selected from the menu
                colorChangingTxt.setTextColor(ContextCompat.getColor(this,R.color.red));

                Toast.makeText(this, "You Selected "+item.toString()+" Option",Toast.LENGTH_SHORT).show();
            }break;
            case R.id.greenMenuItem:{

//                Setting Color of text to Green if Green option is selected from the menu
                colorChangingTxt.setTextColor(this.getResources().getColor(R.color.green));

                Toast.makeText(this, "You Selected "+item.toString()+" Option",Toast.LENGTH_SHORT).show();
            }break;
            case R.id.blueMenuItem:{
//                Setting Color of text to Blue if Blue option is selected from the menu
                colorChangingTxt.setTextColor(this.getResources().getColor(R.color.blue));

                Toast.makeText(this, "You Selected "+item.toString()+" Option",Toast.LENGTH_SHORT).show();
            }break;
            case R.id.textColor:
                break;
            default: {
//                Setting Color of text to Black if any other option is selected from the menu
                colorChangingTxt.setTextColor(this.getResources().getColor(R.color.defaultColor));

                Toast.makeText(this, "You Selected "+item.toString()+" Option",Toast.LENGTH_SHORT).show();
            }break;
        }

        return super.onOptionsItemSelected(item);
    }
}
