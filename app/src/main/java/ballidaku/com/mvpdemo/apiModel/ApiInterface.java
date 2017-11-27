package ballidaku.com.mvpdemo.apiModel;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by brst-pc93 on 3/1/17.
 */

public interface ApiInterface
{


    @GET("/admin/products.json")
    Call<String> getProducts();




   /* @POST("/api/postdata")
@FormUrlEncoded
Call<UploadDataModel> postData(@Field(MyConstant.DATE) String date,
                               @Field(MyConstant.STEPS) String steps,
                               @Field(MyConstant.CALORIES) String calories,
                               @Field("sleephr") String sleephr,
                               @Field(MyConstant.DISTANCE) String distance,
                               @Field(MyConstant.UID) String uid);*/
}
