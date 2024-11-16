package com.plcoding.cryptotracker.core.presentation.util

import com.plcoding.cryptotracker.R
import com.plcoding.cryptotracker.core.domain.util.NetworkError
import com.plcoding.cryptotracker.core.domain.util.NetworkError.*

fun NetworkError.toResId(): Int {
    return when (this) {
        REQUEST_TIMEOUT -> R.string.error_request_timeout
        TOO_MANY_REQUESTS -> R.string.error_too_many_requests
        NO_INTERNET -> R.string.error_no_internet
        SERVER_ERROR -> R.string.error_unknown
        SERIALIZATION -> R.string.error_unknown
        UNKNOWN -> R.string.error_unknown
    }
}