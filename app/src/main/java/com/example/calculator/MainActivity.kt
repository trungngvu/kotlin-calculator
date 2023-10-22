package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var default : Int = 0
        var button_1 : Button = findViewById(R.id.one);
        var button_2 : Button = findViewById(R.id.two);
        var button_3 : Button = findViewById(R.id.three);
        var button_4 : Button = findViewById(R.id.four);
        var button_5 : Button = findViewById(R.id.five);
        var button_6 : Button = findViewById(R.id.six);
        var button_7 : Button = findViewById(R.id.seven);
        var button_8 : Button = findViewById(R.id.eight);
        var button_9 : Button = findViewById(R.id.nine);
        var button_0 : Button = findViewById(R.id.zero);
        var button_ce : Button = findViewById(R.id.ce);
        var button_c : Button = findViewById(R.id.c);
        var button_bs : Button = findViewById(R.id.bs);
        var button_divide : Button = findViewById(R.id.divide);
        var button_multiply : Button = findViewById(R.id.multiply);
        var button_minus : Button = findViewById(R.id.minus);
        var button_plus : Button = findViewById(R.id.plus);
        var button_equal : Button = findViewById(R.id.equal);
        var result_textView : TextView = findViewById(R.id.idTVprimary)
        var tempTextView : TextView = findViewById(R.id.idTVSecondary)
        var result : Int = 0;
        result_textView.text =  result.toString();
        var first_op : Int = 0;
        var second_op : Int = 0;
        var sign : String = "";
        button_1.setOnClickListener{
            val value : Int = 1;
            if (sign.equals("")) {
                first_op = first_op * 10 + value;
                result_textView.text = addToInputText(result_textView.text.toString(), value.toString())
            }
            else {
                second_op = second_op * 10 + value;
                result_textView.text = second_op.toString()
            }
        }
        button_2.setOnClickListener{
            val value : Int = 2;
            if (sign.equals("")) {
                first_op = first_op * 10 + value;
                result_textView.text = addToInputText(result_textView.text.toString(), value.toString())
            }
            else {
                second_op = second_op * 10 + value;
                result_textView.text = second_op.toString()
            }        }
        button_3.setOnClickListener{
            val value : Int = 3;
            if (sign.equals("")) {
                first_op = first_op * 10 + value;
                result_textView.text = addToInputText(result_textView.text.toString(), value.toString())
            }
            else {
                second_op = second_op * 10 + value;
                result_textView.text = second_op.toString()
            }
        }
        button_4.setOnClickListener{
            val value : Int = 4;
            if (sign.equals("")) {
                first_op = first_op * 10 + value;
                result_textView.text = addToInputText(result_textView.text.toString(), value.toString())
            }
            else {
                second_op = second_op * 10 + value;
                result_textView.text = second_op.toString()
            }
        }
        button_5.setOnClickListener{
            val value : Int = 5;
            if (sign.equals("")) {
                first_op = first_op * 10 + value;
                result_textView.text = addToInputText(result_textView.text.toString(), value.toString())
            }
            else {
                second_op = second_op * 10 + value;
                result_textView.text = second_op.toString()
            }
        }
        button_6.setOnClickListener{
            val value : Int = 6;
            if (sign.equals("")) {
                first_op = first_op * 10 + value;
                result_textView.text = addToInputText(result_textView.text.toString(), value.toString())
            }
            else {
                second_op = second_op * 10 + value;
                result_textView.text = second_op.toString()
            }
        }
        button_7.setOnClickListener{
            val value : Int = 7;
            if (sign.equals("")) {
                first_op = first_op * 10 + value;
                result_textView.text = addToInputText(result_textView.text.toString(), value.toString())
            }
            else {
                second_op = second_op * 10 + value;
                result_textView.text = second_op.toString()
            }
        }
        button_8.setOnClickListener{
            val value : Int = 8;

            if (sign.equals("")) {
                first_op = first_op * 10 + value;
                result_textView.text = addToInputText(result_textView.text.toString(), value.toString())
            }
            else {
                second_op = second_op * 10 + value;
                result_textView.text = second_op.toString()
            }
        }
        button_9.setOnClickListener{
            val value : Int = 9;
            if (sign.equals("")) {
                first_op = first_op * 10 + value;
                result_textView.text = addToInputText(result_textView.text.toString(), value.toString())
            }
            else {
                second_op = second_op * 10 + value;
                result_textView.text = second_op.toString()
            }
        }
        button_0.setOnClickListener{
            val value : Int = 0;
            if (sign.equals("")) {
                first_op = first_op * 10 ;
                result_textView.text = addToInputText(result_textView.text.toString(), value.toString())
            }
            else {
                second_op = second_op * 10;
                result_textView.text = second_op.toString()
            }
        }
        button_plus.setOnClickListener {
            val value : String = "+";
            if (sign == ""){
                sign = value
            }
            tempTextView.text =  addToInputText(result_textView.text.toString(), value.toString())
        }
        button_minus.setOnClickListener {
            val value : String = "-";
            if (sign == ""){
                sign = value
            }
            tempTextView.text =  addToInputText(result_textView.text.toString(), value.toString())
        }
        button_multiply.setOnClickListener {
            val value : String = "x";
            if (sign == ""){
                sign = value
            }
            tempTextView.text =  addToInputText(result_textView.text.toString(), value.toString())

        }
        button_divide.setOnClickListener {
            val value : String = "/";
            if (sign == ""){
                sign = value
            }
            tempTextView.text =  addToInputText(result_textView.text.toString(), value.toString())
        }
        button_equal.setOnClickListener {
            result = calculate(first_op, second_op, sign)
            result_textView.text = result.toString()
            tempTextView.text = ""
            first_op = result
            second_op = 0
            sign = ""
        }
        button_c.setOnClickListener {
            first_op = 0
            second_op = 0
            sign = ""
            result = 0
            result_textView.text = result.toString()
        }
        button_ce.setOnClickListener {
            if (sign == ""){
                first_op = 0
            }
            else {
                second_op = 0
            }
            result_textView.text = default.toString()
        }
        button_bs.setOnClickListener {
            if (sign == ""){
                if (first_op < 10){
                    first_op = 0
                }
                else {
                    first_op /= 10
                }
                result_textView.text = first_op.toString()
            }
            else {
                if (second_op < 10){
                    second_op = 0
                }
                else {
                    second_op /= 10
                }
                result_textView.text = second_op.toString()
            }
        }
    }

    private fun addToInputText(input: String, buttonValue : String): String {
        if (input.equals("0")){
            return buttonValue;
        }
        return input + "" + buttonValue;
    }
    private fun calculate (first_op: Int, second_op: Int, sign: String): Int{
        val result = when (sign) {
            "+" -> first_op + second_op
            "-" -> first_op - second_op
            "x" -> first_op * second_op
            "/" -> first_op / second_op
            else -> 0
        }
        return result;
    }
}