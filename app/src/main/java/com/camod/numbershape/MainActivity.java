package com.camod.numbershape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    class Number {
        int number;

        public boolean isSquare(){

            int squareNumber=1;

            while( (squareNumber * squareNumber) < number){
                squareNumber++;
            }

            if((squareNumber*squareNumber)==number){
                return true;
            }
            else{
                return false;
            }
        }

        public boolean isTriangular(){

            int x =1;

            int triangularNumber =1;

            while(triangularNumber <number){
                x++;
                triangularNumber = triangularNumber+x;

            }
            if(triangularNumber==number){
                return true;
            }else{
                return false;
            }
        }
    }
    public void testNumber(View view){
        EditText usersNumber= (EditText) findViewById(R.id.numberText);

        Log.i("UserNumber", usersNumber.getText().toString());

        Number myNumber= new Number();

        myNumber.number= Integer.parseInt(usersNumber.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
