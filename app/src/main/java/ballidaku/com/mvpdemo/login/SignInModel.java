package ballidaku.com.mvpdemo.login;

import android.text.TextUtils;

public class SignInModel implements SignInInterfaces.LoginModelInterface
{
    @Override
    public void validateCredentials(String email, String password, Listeners listeners)
    {
        if (TextUtils.isEmpty(email))
        {
            listeners.onEmailEmptyError();
        }
        else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            listeners.onEmailValidError();
        }
        else if (TextUtils.isEmpty(password))
        {
            listeners.onPasswordEmptyError();
        }
        else if (password.length() < 6)
        {
            listeners.onPasswordLimitError();
        }
        else
        {
            listeners.onSuccess();
        }
    }
}
