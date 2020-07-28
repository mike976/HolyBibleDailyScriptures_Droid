package com.mbullock976.hbdsp.network.response

import com.mbullock976.hbdsp.network.ApiError

data class ApiResponseMessage<out T>(val statusApi: ApiResponseStatus, val data: T?, val error: ApiError?) {
    companion object {
        fun <T> success(data: T?) : ApiResponseMessage<T> {
            return ApiResponseMessage(ApiResponseStatus.SUCCESS, data, null)
        }

        fun <T> error(error: ApiError, data: T?) : ApiResponseMessage<T> {
            return ApiResponseMessage(ApiResponseStatus.ERROR, data, error)
        }

        fun <T> loading(data: T?): ApiResponseMessage<T> = ApiResponseMessage(ApiResponseStatus.ERROR, data, null)
    }
}

