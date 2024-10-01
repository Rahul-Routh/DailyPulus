package com.rahul.dailypulus

import kotlinx.coroutines.CoroutineScope

expect open class BaseViewModel() {

    val scope:CoroutineScope

}