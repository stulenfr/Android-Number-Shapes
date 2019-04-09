package com.camod.numbershape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {
        int number;
        String verdict="";

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

        public void testNumber(){
            if(this.isTriangular() && this.isSquare()){
                this.verdict="This number is both Square and Triangular";
            }
            else if ( this.isSquare()){
                this.verdict="This number is Square";
            }
            else if(this.isTriangular()){
                this.verdict="This number is Triangular";
            }
            else{
                this.verdict="This number is neither Square nor Triangular";
            }
        }

    }
    public void testNumber(View view){
        EditText usersNumber= (EditText) findViewById(R.id.numberText);

        Log.i("UserNumber", usersNumber.getText().toString());

        String message="";
        if (usersNumber.getText()==null){
            message="There is no number";
        }else {
            Number myNumber = new Number();

            myNumber.number = Integer.parseInt(usersNumber.getText().toString());

            myNumber.testNumber();
            message=myNumber.verdict;
        }
        Toast.makeText(MainActivity.this,message,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
