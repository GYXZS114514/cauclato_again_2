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

public class MainActivity extends AppCompatActivity {


    int i = 0;//用于切到下一次运算过程。
    public EditText editText;
    public String string;//显示的字符串
    int s16 = 0,s8 = 0,s10 = 0,s2 = 0;//用于区分键入数字的进制

    @Override
    protected void onCreate(Bundle savedInstanceState) {

       // super.onCreate(savedInstanceState);
        int orientation = getResources().getConfiguration().orientation;
        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.text);
            Button button9 = (Button) findViewById(R.id.nine);
            Button button8 = (Button) findViewById(R.id.eight);
            Button button7 = (Button) findViewById(R.id.seven);
            Button button_jia = (Button) findViewById(R.id.jia);

            Button button4 = (Button) findViewById(R.id.four);
            Button button5 = (Button) findViewById(R.id.five);
            Button button6 = (Button) findViewById(R.id.six);
            Button button_jian = (Button) findViewById(R.id.jian);


            Button button1 = (Button) findViewById(R.id.one);
            Button button2 = (Button) findViewById(R.id.two);
            Button button3 = (Button) findViewById(R.id.three);
            Button button_cheng = (Button) findViewById(R.id.cheng);

            Button button0 = (Button) findViewById(R.id.zero);
            Button button_C = (Button) findViewById(R.id.clear);
            Button button_dengyu = (Button) findViewById(R.id.dengyu);
            Button button_chu = (Button) findViewById(R.id.chuu);

            Button button_left = (Button) findViewById(R.id.left);
            Button button_right = (Button) findViewById(R.id.right);
            Button button_sin = (Button) findViewById(R.id.sin);
            Button button_cos = (Button) findViewById(R.id.cos);
            Button button_tan = (Button) findViewById(R.id.tan);
            Button button_kaifang = (Button) findViewById(R.id.kaifang);
            button_tan.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    string = editText.getText().toString();
                    editText.setText(Math.tan(Double.valueOf(string.toString())) + "");
                }
            });
            Button button_point = (Button) findViewById(R.id.point);

            editText = (EditText) this.findViewById(R.id.edittext);
            button_kaifang.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    string = editText.getText().toString();
                    double a = Double.parseDouble(string);

                    editText.setText(Math.sqrt(a) + "");
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
            button_jia.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    string = editText.getText().toString() + "+";
                    editText.setText(string);
                }
            });
            button_jian.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    string = editText.getText().toString() + "-";
                    editText.setText(string);
                }
            });
            button_cheng.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    string = editText.getText().toString() + "*";
                    editText.setText(string);
                }
            });

            button_chu.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    string = editText.getText().toString() + "/";
                    editText.setText(string);
                }
            });
            button_dengyu.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    string = editText.getText().toString();
                    List<String> list = resolveString(string);
                    editText.setText(get_postfis_result(nifix_to_post(list)) + "");


                }
            });
            button_point.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    string = editText.getText().toString() + ".";
                    editText.setText(string);
                }
            });
            button_left.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    string = editText.getText().toString() + "(";
                    editText.setText(string);
                }
            });
            button_right.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    string = editText.getText().toString() + ")";
                    editText.setText(string);
                }
            });
            button_C.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    string = editText.getText().toString();
                    editText.setText("");
                }
            });
            button_sin.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    string = editText.getText().toString();
                    editText.setText(Math.sin(Double.valueOf(string.toString())) + "");
                }
            });
            button_cos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    string = editText.getText().toString();
                    editText.setText(Math.cos(Double.valueOf(string.toString())) + "");
                }
            });













































        }else{
        /*if(this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.changduzhuanhuan);
        }*/

            //if(this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            editText=(EditText)this.findViewById(R.id.edittext);
            Button button_a = (Button)findViewById(R.id.A);
            Button button_b = (Button)findViewById(R.id.B);
            Button button_c = (Button)findViewById(R.id.C);
            Button button_d = (Button)findViewById(R.id.D);
            Button button_e = (Button)findViewById(R.id.E);
            Button button_f = (Button)findViewById(R.id.F);


            Button button_16 = (Button)findViewById(R.id.top16);
            Button button_8 = (Button)findViewById(R.id.topeight);
            Button button_10 = (Button)findViewById(R.id.topten);
            Button button_2 = (Button)findViewById(R.id.toptwo);
            Button button_16_ = (Button)findViewById(R.id.topsixteen_);
            Button button_8_ = (Button)findViewById(R.id.topeight_);
            Button button_10_ = (Button)findViewById(R.id.topten_);
            Button button_2_ = (Button)findViewById(R.id.toptwo_);


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
            button_a.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"A";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"A";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button_b.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"B";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"B";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            button_c.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"C";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"C";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });

            button_d.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"D";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"D";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });

            button_e.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"E";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"E";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });

            button_f.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(i == 0){
                        string = editText.getText().toString()+"F";
                        editText.setText(string);}
                    else if(i == 1){
                        string = "";
                        editText.setText(string);
                        string = editText.getText().toString()+"F";
                        editText.setText(string);
                        i = 0;
                    }
                }
            });
            //为flag位赋值
            button_16_.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    s16 = 1;


                }
            });
            button_2_.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    s2 = 1;


                }
            });
            button_8_.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    s8 = 1;


                }
            });
            button_10_.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    s10 = 1;


                }
            });
            button_2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(s10 == 1){
                        string = editText.getText().toString();
                        int a = Integer.parseInt(string);
                        string = Integer.toBinaryString(a);
                        i = 1;s10 = 0;
                        editText.setText(string);
                    }else if(s8 == 1){
                        string = "0"+editText.getText().toString();

                        int b = Integer.parseInt(string.substring(1, string.length()), 8);
                        string = Integer.toBinaryString(b);
                        i = 1;s8 = 0;
                        editText.setText(string);

                    }else if(s16 == 1){
                        string = "0x"+editText.getText().toString();
                        int a = Integer.parseInt(string.substring(2, string.length()), 16);

                        string = Integer.toBinaryString(a);
                        i = 1;s16 = 0;
                        editText.setText(string);

                    }
                }
            });

            button_16.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(s10 == 1){
                        string = editText.getText().toString();
                        int a = Integer.parseInt(string);
                        string = Integer.toHexString(a);
                        i = 1;s10 = 0;
                        editText.setText(string);

                    }else if(s8 == 1){
                        string = "0"+editText.getText().toString();

                        int b = Integer.parseInt(string.substring(1, string.length()), 8);
                        string = Integer.toHexString(b);
                        i = 1;s8 = 0;
                        editText.setText(string);


                    }else if(s2 == 1){
                        string = editText.getText().toString();
                        int a = Integer.parseInt(string.substring(0, string.length()), 2);
                        string = Integer.toHexString(a);
                        i = 1;s2 = 0;
                        editText.setText(string);

                    }


                }
            });
            button_10.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(s16 == 1){
                        string = "0x"+editText.getText().toString();
                        int a = Integer.parseInt(string.substring(2, string.length()), 16);
                        i = 1;s16 = 0;
                        editText.setText(a+"");

                    }else if(s8 == 1){
                        string = "0"+editText.getText().toString();
                        int a = Integer.parseInt(string.substring(1, string.length()), 8);
                        i = 1;s8 = 0;
                        editText.setText(a+"");

                    }else if(s2 == 1){
                        string = editText.getText().toString();
                        int a = Integer.parseInt(string.substring(0, string.length()), 2);
                        i = 1;s2 = 0;
                        editText.setText(a+"");

                    }


                }
            });

            button_8.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    if(s10 == 1){
                        string = editText.getText().toString();
                        int a = Integer.parseInt(string);
                        string = Integer.toOctalString(a);
                        i = 1;s10 = 0;
                        editText.setText(string);

                    }else if(s16 == 1){
                        string = "0x"+editText.getText().toString();
                        int a = Integer.parseInt(string.substring(2, string.length()), 16);

                        string = Integer.toOctalString(a);
                        i = 1;s16 = 0;
                        editText.setText(string);


                    }else if(s2 == 1){
                        string = editText.getText().toString();
                        int a = Integer.parseInt(string.substring(0, string.length()), 2);
                        string =Integer.toOctalString(a);
                        i = 1;s2 = 0;
                        editText.setText(string);

                    }


                }
            });

        }

}










    private static boolean isNum(char ch) {
        if (ch <= '9' && ch >= '0') {
            return true;
        } else {
            return false;
        }
    }


    private static boolean isDouble(String s) {
        try {
            Double.valueOf(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    private static boolean isOperator(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '=') {
            return true;
        } else {
            return false;
        }
    }


    private static boolean isStrOperator(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")
                || s.equals("(") || s.equals(")")) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean heightOperator(String o1, String o2) {
        if ((o1.equals("*") || o1.equals("/"))
                && (o2.equals("+") || o2.equals("-")) || o2.equals("(")) {
            return true;
        } else if ((o1.equals("+") || o1.equals("-"))
                && (o2.equals("*") || o2.equals("/"))) {
            return false;
        } else if ((o1.equals("*") || o1.equals("/"))
                && ((o2.equals("*") || o2.equals("/")))) {
            return true;
        } else if ((o1.equals("+") || o1.equals("-"))
                && (o2.equals("+") || o2.equals("-"))) {
            return true;
        } else {
            return false;
        }
    }

    private static double getCountResult(String oper, double num1, double num2) {
        if (oper.equals("+")) {
            return num1 + num2;
        } else if (oper.equals("-")) {
            return num1 - num2;
        } else if (oper.equals("*")) {
            return num1 * num2;
        } else if (oper.equals("/")) {
            return num1 / num2;
        } else {
            return 0;
        }
    }

    private static List<String> nifix_to_post(List<String> list) {
        Stack<String> stack = new Stack<String>();
        List<String> plist = new ArrayList<String>();
        for (String str : list) {
            if (isDouble(str)) {
                plist.add(str);
            }
            if (isStrOperator(str) && stack.isEmpty()) {
                stack.push(str);
            } else if (isStrOperator(str) && !stack.isEmpty()) {
                String last = stack.lastElement();
                if (heightOperator(str, last) || str.equals("(")) {
                    stack.push(str);
                } else if (!heightOperator(str, last) && !str.equals(")")) {
                    while (!stack.isEmpty() && !stack.lastElement().equals("(")) {
                        plist.add(stack.pop());
                    }
                    stack.push(str);
                } else if (str.equals(")")) {
                    while (!stack.isEmpty()) {
                        String pop = stack.pop();
                        if (!pop.equals("(")) {
                            plist.add(pop);
                        }
                        if (pop.equals("(")) {
                            break;
                        }
                    }
                }
            }

        }
        while (!stack.isEmpty()) {
            plist.add(stack.pop());
        }

        return plist;
    }

    private static double get_postfis_result(List<String> list) {
        Stack<String> stack = new Stack<String>();
        for (String str : list) {
            if (isDouble(str)) {
                stack.push(str);
            } else if (isStrOperator(str)) {
                double n2 = Double.valueOf(stack.pop());
                double n1 = Double.valueOf(stack.pop());
                stack.push("" + getCountResult(str, n1, n2));
            }
        }
        return Double.valueOf(stack.pop());
    }


    private static List<String> resolveString(String str) {
        List<String> list = new ArrayList<String>();
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            final char ch = str.charAt(i);
            if (isNum(ch) || ch == '.') {
                char c = str.charAt(i);
                temp += c;
            } else if (isOperator(ch) || ch == ')') {
                if (!temp.equals("")) {
                    list.add(temp);
                }
                list.add("" + ch);
                temp = "";
            } else if (ch == '(') {
                list.add("" + ch);
            }
            if (i == str.length() - 1) {
                list.add(temp);
            }
        }
        return list;
    }



    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.help:
                Toast.makeText(this,"你点击了帮助",Toast.LENGTH_LONG).show();
                break;
            case R.id.jinzhihuansuan:
                // Toast.makeText(this,"you have click remove",Toast.LENGTH_LONG).show();
                // break;
                Intent intent = new Intent(MainActivity.this,huansuan.class);
                startActivity(intent);
                break;


            default:
                break;
        }
        return true;
    }



}



