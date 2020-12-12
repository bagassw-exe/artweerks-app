package com.artweerks.app.data.model

class ActionState<T> (
        val data:T? = null,
        val massage: String? = null,
        val isSuccess: Boolean = true,
        var isConsumed: Boolean = false
)