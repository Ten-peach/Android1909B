package com.example.day0628;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_name;
    private EditText et_pass;
    private EditText et_againpass;
    private EditText et_phone;
    private EditText et_verify;
    private Button btn_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
    }

    private void initView() {
        et_name = (EditText) findViewById(R.id.et_name);
        et_pass = (EditText) findViewById(R.id.et_pass);
        et_againpass = (EditText) findViewById(R.id.et_againpass);
        et_phone = (EditText) findViewById(R.id.et_phone);
        et_verify = (EditText) findViewById(R.id.et_verify);
        btn_ok = (Button) findViewById(R.id.btn_ok);

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_ok:

                break;
        }
    }

    private void submit() {
        // validate
        String name = et_name.getText().toString().trim();
        if (TextUtils.isEmpty(name)) {
            Toast.makeText(this, "用户名", Toast.LENGTH_SHORT).show();
            return;
        }

        String pass = et_pass.getText().toString().trim();
        if (TextUtils.isEmpty(pass)) {
            Toast.makeText(this, "密码", Toast.LENGTH_SHORT).show();
            return;
        }

        String againpass = et_againpass.getText().toString().trim();
        if (TextUtils.isEmpty(againpass)) {
            Toast.makeText(this, "确认密码", Toast.LENGTH_SHORT).show();
            return;
        }

        String phone = et_phone.getText().toString().trim();
        if (TextUtils.isEmpty(phone)) {
            Toast.makeText(this, "手机号", Toast.LENGTH_SHORT).show();
            return;
        }

        String verify = et_verify.getText().toString().trim();
        if (TextUtils.isEmpty(verify)) {
            Toast.makeText(this, "验证码", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }
}