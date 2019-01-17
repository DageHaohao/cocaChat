package com.example.factory.net;

import com.example.factory.modle.api.RspModel;
import com.example.factory.modle.api.account.AccountRspModel;
import com.example.factory.modle.api.account.RegisterModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * @author 91319
 * @Title: RemoteService
 * @ProjectName cocaChat
 * @Description: TODO
 * @date 2019/1/17
 *
 * 网络请求的所有的接口
 *
 */
public interface RemoteService {

    /**
     * 注册接口
     *
     * @param model 传入的是RegisterModel
     * @return 返回的是RspModel<AccountRspModel>
     */
    @POST("account/register")
    Call<RspModel<AccountRspModel>> accountRegister(@Body RegisterModel model);


}
