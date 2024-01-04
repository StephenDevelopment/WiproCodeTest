package com.example.wiprocodetestapplication.data.source.remote

import okhttp3.Interceptor
import okhttp3.Response


class RequestInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val newUrl = originalRequest.url
            .newBuilder()
            .addQueryParameter(
                "api_key",
                "3b7658e753aa19b05317ef88133199a5"
            )
            .build()
        val request = originalRequest.newBuilder()
            .url(newUrl)
            .build()
        return chain.proceed(request)
    }
}