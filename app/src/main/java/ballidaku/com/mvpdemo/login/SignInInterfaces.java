package ballidaku.com.mvpdemo.login;

/**
 * Created by brst-pc93 on 11/22/17.
 */

public interface SignInInterfaces
{
    interface LoginViewInterface
    {
        void setEmailValidError();

        void setEmailEmptyError();

        void setPasswordEmptyError();

        void setPasswordLimitError();

        void navigateToHome();
    }

    interface LoginModelInterface
    {
        void validateCredentials(String email, String password,Listeners listeners);

        interface Listeners
        {
            void onEmailEmptyError();

            void onEmailValidError();

            void onPasswordEmptyError();

            void onPasswordLimitError();

            void onSuccess();
        }
    }
}
