package com.example.bmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int numnang;
    Float numcao;
    Float numkq;
    String str,str1,str2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bttinh = (Button) findViewById(R.id.bttinh);
        EditText nang = (EditText) findViewById(R.id.cantext);
        EditText cao = (EditText) findViewById(R.id.caotext);
        TextView kq = (TextView) findViewById(R.id.textView);
        TextView kqc = (TextView) findViewById(R.id.textView1);
        bttinh.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          try {
                                              numnang = Integer.parseInt(nang.getText().toString());
                                              numcao = Float.parseFloat(cao.getText().toString());
                                          } catch (NumberFormatException e) {
                                              numcao = Float.valueOf(0);
                                          }
                                          if (numcao == 0) {
                                              kq.setText("Nhập đúng định dạng");
                                          } else
                                              str = String.valueOf(numnang * 1.0 / (numcao * numcao)).toString();
                                          kq.setText(str);
                                          numkq = Float.parseFloat(kq.getText().toString());
                                          String loai;
                                          if (numkq < 18) loai = "Người gầy";
                                          else if (numkq < 25) loai = "Người bình thường";
                                          else if (numkq < 30) loai = "Người béo phì độ I";
                                          else if (numkq < 35) loai = "Người béo phì độ II";
                                          else loai = "Người béo phì độ III";
                                          kqc.setText(loai);
                                      }
                                  }
        );

    }
}