package com.ziqi.wanandroid.commonlibrary.bean

import com.ziqi.baselibrary.http.error.ResponseThrowable
import com.ziqi.baselibrary.util.ContextUtils
import com.ziqi.wanandroid.commonlibrary.ui.globaldialog.GlobalActivity
import com.ziqi.wanandroid.commonlibrary.ui.globaldialog.GlobalParams

/**
 * Copyright (C), 2018-2020
 * Author: ziqimo
 * Date: 2020/4/15 11:06 AM
 * Description:
 * History:
 * <author> <time> <version> <desc>
 * 作者姓名 修改时间 版本号 描述
 */
class WanResponse<T> {

    var errorCode = 0

    var errorMsg: String? = null

    var data: T? = null

    fun preProcessData(): T? {
        return if (errorCode == 0) data else throw ResponseThrowable(errorCode, errorMsg ?: "")
    }
}