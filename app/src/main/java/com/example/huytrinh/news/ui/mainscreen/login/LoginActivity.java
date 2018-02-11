package com.example.huytrinh.news.ui.mainscreen.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.huytrinh.news.R;
import com.example.huytrinh.news.ui.base.BaseActivity;
import com.example.huytrinh.news.ui.mainscreen.MainActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginContract.View {

    @Inject
    LoginContract.Presenter presenter;

    @BindView(R.id.username)
    TextView txtUserName;

    @BindView(R.id.password)
    TextView txtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        presenter.attachView(this);
        ButterKnife.bind(this);
    }

    @Override
    public void onLoginSuccess() {
        Toast.makeText(this, "Login successfully", Toast.LENGTH_SHORT).show();
        startMainActivity();
    }

    @Override
    public void onLoginFailure(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    private void startMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @OnClick(R.id.btnLogin)
    void login() {
        String username = txtUserName.getText().toString();
        String password = txtPassword.getText().toString();
        presenter.performLogin(username, password);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
