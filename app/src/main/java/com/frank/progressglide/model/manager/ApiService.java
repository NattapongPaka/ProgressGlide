package com.frank.progressglide.model.manager;

import com.frank.progressglide.dao.JsonChatResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Noth on 10/8/2559.
 */

public interface ApiService {
    @GET("getchats/{company_id}/{group_id}/{createdate}/{user_id}")
    Call<JsonChatResponse> getLoadChatsThread(@Path("company_id") String company_id, @Path("group_id") String group_id, @Path("createdate") String createdate, @Path("user_id") String user_id);
}
