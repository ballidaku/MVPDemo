package ballidaku.com.mvpdemo.login;

/**
 * Created by brst-pc93 on 11/22/17.
 */

public class SignInPresenter implements SignInInterfaces.LoginModelInterface.Listeners
{
    SignInInterfaces.LoginViewInterface loginViewInterface;
    SignInInterfaces.LoginModelInterface loginModelInterface;


    public SignInPresenter(SignInInterfaces.LoginViewInterface loginViewInterface)
    {
        this.loginViewInterface=loginViewInterface;
        loginModelInterface=new SignInModel();

    }

    public void validateCredentials(String email, String password)
    {
        loginModelInterface.validateCredentials(email, password,this);
    }

    @Override
    public void onEmailEmptyError()
    {
        loginViewInterface.setEmailEmptyError();
    }

    @Override
    public void onEmailValidError()
    {
        loginViewInterface.setEmailValidError();
    }

    @Override
    public void onPasswordEmptyError()
    {
        loginViewInterface.setPasswordEmptyError();
    }

    @Override
    public void onPasswordLimitError()
    {
        loginViewInterface.setPasswordLimitError();
    }

    @Override
    public void onSuccess()
    {
        loginViewInterface.navigateToHome();
    }
}
