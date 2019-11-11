package com.example.a30259.cauclato_again;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.*;
import java.lang.*;

public class huansuan extends AppCompatActivity {


    int i = 0;//用于切到下一次运算过程。
    public EditText editText;
    public String string;//显示的字符串
    int m3 = 0,mm3 = 0,cm3 = 0,km3 = 0;
     public int m1 = 0,mm1 = 0,cm1 = 0,km1 = 0;//同M


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // super.onCreate(savedInstanceState);
        int orientation = getResources().getConfiguration().orientation;
        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.tiji);

            editText=(EditText)this.findViewById(R.id.edittext);
            Button button0 = (Button)findViewById(R.id.zero);
            Button button9 = (Button)findViewById(R.id.nine);
            Button button8 = (Button)findViewById(R.id.eight);
            Button button7 = (Button)findViewById(R.id.seven);

            Button button6 = (Button)findViewById(R.id.six);
            Button button5 = (Button)findViewById(R.id.five);
            Button button4 = (Button)findViewById(R.id.four);

            Button button3= (Button)findViewById(R.id.three);
            Button button2 = (Button)findViewById(R.id.two);
            Button button1 = (Button)findViewById(R.id.one);

            Button m = (Button)findViewById(R.id.topsixteen_);
            Button mm = (Button)findViewById(R.id.topeight_);
            Button km = (Button)findViewById(R.id.topten_);
            Button cm = (Button)findViewById(R.id.toptwo_);

            Button m_ = (Button)findViewById(R.id.top16);
            Button mm_ = (Button)findViewById(R.id.topeight);
            Button km_ = (Button)findViewById(R.id.topten);
            Button cm_ = (Button)findViewById(R.id.toptwo);
            m.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    m3 = 1;
                    String s = m3+"";
                    Toast.makeText(huansuan.this,"你选择输入立方米"+s,Toast.LENGTH_LONG).show();

                }
            });
            km.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    km3 = 1;
                    String s = cm3+"";
                    Toast.makeText(huansuan.this,"你选择输入立方分米"+s,Toast.LENGTH_LONG).show();

                }
            });
            cm.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    cm3 = 1;
                    Toast.makeText(huansuan.this,"你选择输入立方厘米",Toast.LENGTH_LONG).show();

                }
            });
            mm.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    mm3 = 1;
                    Toast.makeText(huansuan.this,"你选择输入立方毫米",Toast.LENGTH_LONG).show();
                }
            });



            m_.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(cm3==1){
                    string = editText.getText().toString();
                    double a = Double.parseDouble(string)/1000000;
                    editText.setText(a+"");
                        cm3=0;i=1;
                    }else if(mm3==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)/1000000000;
                        editText.setText(a+"");
                        mm3=0;i=1;
                    }else if(km3==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)/1000;
                        editText.setText(a+"");
                        km3=0;i=1;
                    }

                }
            });
            km_.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(cm3==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)/1000;
                        editText.setText(a+"");
                        cm3=0;i=1;

                    }else if(m3==1){
                        string = editText.getText().toString();

                        double a = Double.parseDouble(string)*1000;
                        editText.setText(a+"");
                        m3=0;i=1;

                    }else if(mm3==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)/1000000;
                        editText.setText(a+"");
                        mm3=0;i=1;
                    }
                }
            });

            mm_.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(cm3==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)*1000;
                        editText.setText(a+"");
                        cm3=0;i=1;
                    }else if(m3==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)*1000000000;
                        editText.setText(a+"");
                        m3=0;i=1;
                    }else if(km3==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)*1000000;
                        editText.setText(a+"");
                        km3=0;i=1;
                    }
                }
            });
            cm_.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(mm3==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)/1000;
                        editText.setText(a+"");
                        mm3=0;i=1;
                    }else if(m3==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)*1000000;
                        editText.setText(a+"");
                        m3=0;i=1;
                    }else if(km3==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)*1000;
                        editText.setText(a+"");km3=0;i=1;
                    }
                }
            });






            button0.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){

                    if(i == 0){
                        string = editText.getText().toString()+"0";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"0";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"1";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"1";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"2";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"2";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"3";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"3";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button4.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"4";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"4";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button5.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"5";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"5";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button6.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"6";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"6";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button7.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"7";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"7";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button8.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"8";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"8";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button9.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"9";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"9";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            Button button_C = (Button)findViewById(R.id.clear);
            button_C.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    string = editText.getText().toString();
                    string = "";
                    editText.setText(string);
                }
            });






































        }else{


            //if(this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_huansuan);


            editText=(EditText)this.findViewById(R.id.edittext);




            Button button0 = (Button)findViewById(R.id.zero);
            Button button9 = (Button)findViewById(R.id.nine);
            Button button8 = (Button)findViewById(R.id.eight);
            Button button7 = (Button)findViewById(R.id.seven);

            Button button6 = (Button)findViewById(R.id.six);
            Button button5 = (Button)findViewById(R.id.five);
            Button button4 = (Button)findViewById(R.id.four);

            Button button3= (Button)findViewById(R.id.three);
            Button button2 = (Button)findViewById(R.id.two);
            Button button1 = (Button)findViewById(R.id.one);

            Button m = (Button)findViewById(R.id.topsixteen_);
            Button mm = (Button)findViewById(R.id.topeight_);
            Button km = (Button)findViewById(R.id.topten_);
            Button cm = (Button)findViewById(R.id.toptwo_);

            Button m_ = (Button)findViewById(R.id.top16);
            Button mm_ = (Button)findViewById(R.id.topeight);
            Button km_ = (Button)findViewById(R.id.topten);
            Button cm_ = (Button)findViewById(R.id.toptwo);
            m.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    m1 = 1;
                    String s = m3+"";
                    Toast.makeText(huansuan.this,"你选择输入米"+s,Toast.LENGTH_LONG).show();

                }
            });
            km.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    km1 = 1;
                    String s = cm3+"";
                    Toast.makeText(huansuan.this,"你选择输入千米"+s,Toast.LENGTH_LONG).show();

                }
            });
            cm.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    cm1 = 1;
                    Toast.makeText(huansuan.this,"你选择输入厘米",Toast.LENGTH_LONG).show();

                }
            });
            mm.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    mm1 = 1;
                    Toast.makeText(huansuan.this,"你选择输入毫米",Toast.LENGTH_LONG).show();
                }
            });
            m_.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(cm1==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)/100;
                        editText.setText(a+"");
                        cm1=0;i=1;
                    }else if(mm1==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)/1000;
                        editText.setText(a+"");
                        mm1=0;i=1;
                    }else if(km1==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)*1000;
                        editText.setText(a+"");
                        km1=0;i=1;
                    }

                }
            });

            mm_.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(cm1==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)/10;
                        editText.setText(a+"");
                        cm1=0;i=1;
                    }else if(m1==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)/1000;
                        editText.setText(a+"");
                        mm1=0;i=1;
                    }else if(km1==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)/1000000;
                        editText.setText(a+"");
                        km1=0;i=1;
                    }

                }
            });
            cm_.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(m1==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)*100;
                        editText.setText(a+"");
                        cm1=0;i=1;
                    }else if(mm1==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)/10;
                        editText.setText(a+"");
                        mm1=0;i=1;
                    }else if(km1==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)*100000;
                        editText.setText(a+"");
                        km1=0;i=1;
                    }

                }
            });
            km_.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(m1==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)/1000;
                        editText.setText(a+"");
                        cm1=0;i=1;
                    }else if(mm1==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)/10000000;
                        editText.setText(a+"");
                        mm1=0;i=1;
                    }else if(cm1==1){
                        string = editText.getText().toString();
                        double a = Double.parseDouble(string)/100000;
                        editText.setText(a+"");
                        km1=0;i=1;
                    }

                }
            });











            button0.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){

                    if(i == 0){
                        string = editText.getText().toString()+"0";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"0";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"1";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"1";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"2";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"2";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"3";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"3";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button4.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"4";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"4";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button5.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"5";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"5";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button6.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"6";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"6";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button7.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"7";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"7";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button8.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"8";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"8";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button9.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"9";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"9";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            Button button_C = (Button)findViewById(R.id.clear);
            button_C.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    string = editText.getText().toString();
                    string = "";
                    editText.setText(string);
                }
            });


        }

    }


}



