// @formatter:off
/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package me.him188.ani.client.models


import kotlinx.serialization.Required
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * 
 *
 * @param version 
 * @param downloadUrlAlternatives 
 * @param publishTime 
 * @param description 
 */
@Serializable

data class AniUpdateInfo (

    @SerialName(value = "version") @Required val version: kotlin.String,

    @SerialName(value = "downloadUrlAlternatives") @Required val downloadUrlAlternatives: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "publishTime") @Required val publishTime: kotlin.Long,

    @SerialName(value = "description") @Required val description: kotlin.String

) {


}


// @formatter:on
