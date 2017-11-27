package ballidaku.com.mvpdemo.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import ballidaku.com.mvpdemo.R;
import ballidaku.com.mvpdemo.home.HomeActivity;

/**
 * A login screen that offers login via email/password.
 */
public class SignInActivity extends AppCompatActivity implements SignInInterfaces.LoginViewInterface, View.OnClickListener
{
    String TAG = SignInActivity.class.getName();

    Context context;

    private EditText editTextEmail;
    private EditText editTextPassword;

    SignInPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        context=this;

        setUpViews();
    }

    private void setUpViews()
    {
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        findViewById(R.id.button).setOnClickListener(this);

        loginPresenter=new SignInPresenter(this);
    }


    @Override
    public void setEmailEmptyError()
    {
        editTextEmail.setError(getString(R.string.email_empty_error));
    }

    @Override
    public void setEmailValidError()
    {
        editTextPassword.setError(getString(R.string.email_valid_error));
    }

    @Override
    public void setPasswordEmptyError()
    {
        editTextPassword.setError(getString(R.string.password_empty_error));
    }

    @Override
    public void setPasswordLimitError()
    {
        editTextPassword.setError(getString(R.string.password_limit_error));
    }

    @Override
    public void navigateToHome()
    {

        startActivity(new Intent(context,HomeActivity.class));
    }


    @Override
    public void onClick(View view)
    {

        switch (view.getId())
        {
            case R.id.button:

                loginPresenter.validateCredentials(editTextEmail.getText().toString(), editTextPassword.getText().toString());

                break;
        }
    }

}

