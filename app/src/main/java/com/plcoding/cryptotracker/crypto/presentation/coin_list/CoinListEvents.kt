package com.plcoding.cryptotracker.crypto.presentation.coin_list

import com.plcoding.cryptotracker.core.presentation.util.UiText

sealed interface CoinListEvents {
    data class Error(val text: UiText): CoinListEvents
}
