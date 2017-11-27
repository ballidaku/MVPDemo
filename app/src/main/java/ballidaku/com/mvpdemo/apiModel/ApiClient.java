package ballidaku.com.mvpdemo.apiModel;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by brst-pc93 on 3/1/17.
 */

public class ApiClient
{

//    public static final String BASE_URL = "http://api.themoviedb.org/3/";
    private static Retrofit retrofit = null;

   static  String BASE_URL = "http://720ddd6752f8c3d1de9dbdacafc93b32:8cedda1cc48a1f5f5a5392d42d6d2b33@apptuse-test.myshopify.com";

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
