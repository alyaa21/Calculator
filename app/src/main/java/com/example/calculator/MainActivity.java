package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    Button One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Pl,Mins,Prot,Divt,Modli,Eq,Clear;
    TextView Num1,Num2,Mark,Res;
    String oS="",tS="";
     int mar=0;
     double res=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Eq=findViewById(R.id.eq);
        Eq.setOnClickListener(this);
        One=findViewById(R.id.one);
        One.setOnClickListener(this);
        Two=findViewById(R.id.two);
        Two.setOnClickListener(this);
        Three=findViewById(R.id.three);
        Three.setOnClickListener(this);
        Four=findViewById(R.id.four);
        Four.setOnClickListener(this);
        Five=findViewById(R.id.five);
        Five.setOnClickListener(this);
        Six=findViewById(R.id.six);
        Six.setOnClickListener(this);
        Seven=findViewById(R.id.seven);
        Seven.setOnClickListener(this);
        Eight=findViewById(R.id.eight);
        Eight.setOnClickListener(this);
        Nine=findViewById(R.id.nine);
        Nine.setOnClickListener(this);
        Num1=findViewById(R.id.num1);
        Num2=findViewById(R.id.num2);
        Mark=findViewById(R.id.mark);
        Res=findViewById(R.id.result);
        Clear=findViewById(R.id.clear);
        Clear.setOnClickListener(this);
        Pl=findViewById(R.id.plus);
        Pl.setOnClickListener(this);
        Mins=findViewById(R.id.miun);
        Mins.setOnClickListener(this);
        Prot=findViewById(R.id.multip);
        Prot.setOnClickListener(this);
        Divt=findViewById(R.id.div);
        Divt.setOnClickListener(this);
        Modli=findViewById(R.id.mod);
        Modli.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int x=v.getId();
        if(x==R.id.one){
            //if user don't push on any mark
            //set number the first number
            if(mar==0)
            {

                oS+=  One.getText();
                Num1.setText(oS);
            }
            //if user push on mark +,-,*...etc
            else{
                tS+=One.getText();
               Num2.setText(tS);
             }
        }
         if(x==R.id.two){
            if(mar==0)
            {
                oS+=  Two.getText();
                Num1.setText(oS);
            }
            else{
                tS+=Two.getText();
                Num2.setText(tS);
            }
        }
        if(x==R.id.three){
            if(mar==0)
            {
                oS+=  Three.getText();
                Num1.setText(oS);
            }
            else{
                tS+=Three.getText();
                Num2.setText(tS);
            }
        }
        if(x==R.id.four){
            //if user don't push on any mark
            //set number the first number
            if(mar==0)
            {

                oS+=  Four.getText();
                Num1.setText(oS);
            }
            else{
                tS+=Four.getText();
                Num2.setText(tS);
            }
        }
        if(x==R.id.five){
            //if user don't push on any mark
            //set number the first number
            if(mar==0)
            {

                oS+=  Five.getText();
                Num1.setText(oS);
            }
            else{
                tS+=Five.getText();
                Num2.setText(tS);
            }
        }
        if(x==R.id.six){
            //if user don't push on any mark
            //set number the first number
            if(mar==0)
            {

                oS+=  Six.getText();
                Num1.setText(oS);
            }
            else{
                tS+=Six.getText();
                Num2.setText(tS);
            }
        }
        if(x==R.id.seven){
            //if user don't push on any mark
            //set number the first number
            if(mar==0)
            {

                oS+=  Seven.getText();
                Num1.setText(oS);
            }
            else{
                tS+=Seven.getText();
                Num2.setText(tS);
            }
        }
        if(x==R.id.eight){
            //if user don't push on any mark
            //set number the first number
            if(mar==0)
            {

                oS+=  Eight.getText();
                Num1.setText(oS);
            }
            else{
                tS+=Eight.getText();
                Num2.setText(tS);
            }
        }
        if(x==R.id.nine){
            //if user don't push on any mark
            //set number the first number
            if(mar==0)
            {

                oS+=  Nine.getText();
                Num1.setText(oS);
            }
            else{
                tS+=Nine.getText();
                Num2.setText(tS);
            }
        }

        if(x==R.id.plus){

                Mark.setText(Pl.getText());
                //set mar=1 if user choose mark
                mar=1;
        }
       else if(x==R.id.miun){

            Mark.setText(Mins.getText());
            //set mar=2 if user choose minus
            mar=2;
        }
       else if(x==R.id.multip){

            Mark.setText(Prot.getText());
            //set mar=2 if user choose minus
            mar=3;
        }
        else if(x==R.id.div){

            Mark.setText(Divt.getText());
            //set mar=2 if user choose minus
            mar=4;
        }
        else if(x==R.id.mod){

            Mark.setText(Modli.getText());
            //set mar=2 if user choose minus
            mar=5;
        }

        //when push on equal button
        if (x==R.id.eq){
            //parse text to integer
            if(mar==1){
           res=Integer.parseInt(""+Num1.getText());
           res+=Integer.parseInt(""+Num2.getText());}
            else if(mar==2){
                res=Integer.parseInt(""+Num1.getText());
                res-=Integer.parseInt(""+Num2.getText());

            }
            else if(mar==3){
                res=Integer.parseInt(""+Num1.getText());
                res*=Integer.parseInt(""+Num2.getText());

            }
            else if(mar==4){
                res=Integer.parseInt(""+Num1.getText());
                res/=Integer.parseInt(""+Num2.getText());

            }
            else if(mar==5){
                res=Integer.parseInt(""+Num1.getText());
                res%=Integer.parseInt(""+Num2.getText());

            }
           //set result into screen
           Res.setText(""+res);
        }
        //when push on C button
        if(x==R.id.clear){
            Num1.setText("");
            Num2.setText("");
            Mark.setText("");
            Res.setText("");
            mar=0;
            res=0;
           oS="";
           tS="";

        }


    }
}