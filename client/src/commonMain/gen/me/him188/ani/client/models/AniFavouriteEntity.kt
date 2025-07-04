// @formatter:off
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
 * @param wish 
 * @param done 
 * @param doing 
 * @param onHold 
 * @param dropped 
 */
@Serializable

data class AniFavouriteEntity (

    @SerialName(value = "wish") @Required val wish: kotlin.Int,

    @SerialName(value = "done") @Required val done: kotlin.Int,

    @SerialName(value = "doing") @Required val doing: kotlin.Int,

    @SerialName(value = "onHold") @Required val onHold: kotlin.Int,

    @SerialName(value = "dropped") @Required val dropped: kotlin.Int

) {


}


// @formatter:on

// @formatter:on
