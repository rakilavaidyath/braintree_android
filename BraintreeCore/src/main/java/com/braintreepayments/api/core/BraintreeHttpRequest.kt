package com.braintreepayments.api.core

import androidx.annotation.RestrictTo

/**
 * @suppress
 */
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
data class BraintreeHttpRequest(
    val method: String,
    val path: String,
    val data: String? = null,
    val additionalHeaders: Map<String, String> = emptyMap(),
    val configuration: Configuration? = null,
    val authorization: Authorization? = null,
    val retryStrategy: BraintreeHttpRetryStrategy = BraintreeHttpRetryStrategy.NO_RETRY,
)
