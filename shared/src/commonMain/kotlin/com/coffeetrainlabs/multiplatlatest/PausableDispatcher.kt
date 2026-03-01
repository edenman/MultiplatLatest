package com.coffeetrainlabs.multiplatlatest

import kotlinx.coroutines.CloseableCoroutineDispatcher
import kotlinx.coroutines.Runnable
import kotlin.coroutines.CoroutineContext

class PausableDispatcher : CloseableCoroutineDispatcher() {
    override fun close() {
    }

    override fun dispatch(
        context: CoroutineContext,
        block: Runnable
    ) {
    }
}
