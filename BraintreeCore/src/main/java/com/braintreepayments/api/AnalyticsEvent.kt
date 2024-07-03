package com.braintreepayments.api

internal data class AnalyticsEvent constructor(
    val name: String,
    val payPalContextId: String? = null,
    val linkType: String? = null,
    val isVaultRequest: Boolean = false,
    val startTime: Long? = null,
    val endTime: Long? = null,
    val endpoint: String? = null,
    val timestamp: Long = System.currentTimeMillis(),
)
