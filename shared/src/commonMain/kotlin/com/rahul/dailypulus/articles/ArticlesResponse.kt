package com.rahul.dailypulus.articles

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ArticlesResponse (
    @SerialName("status") val status : String,
    @SerialName("message") val message : String,
    @SerialName("resultset") val resultset : List<ResultDetails>
)

@Serializable
data class ResultDetails(
    @SerialName("id") val id: String,
    @SerialName("mstr_ref_id") val mstrRefId: String,
    @SerialName("status") val status: String,
    @SerialName("fullname") val fullname: String,
    @SerialName("contact") val contact: String,
    @SerialName("uemail") val uemail: String,
    @SerialName("designation") val designation: String,
    @SerialName("gender") val gender: String,
    @SerialName("addr") val addr: String,
    @SerialName("uname") val uname: String,
    @SerialName("upass") val upass: String,
    @SerialName("utype") val utype: String,
    @SerialName("created_on") val createdOn: String,
    @SerialName("masterpass") val masterpass: String,
    @SerialName("auth_key") val authKey: String,
    @SerialName("work_status") val workStatus: String,
    @SerialName("login_attempt") val loginAttempt: String,
    @SerialName("reset_link_token") val resetLinkToken: String,
    @SerialName("android_id") val androidId: String,
    @SerialName("mnu_class") val mnuClass: String,
    @SerialName("role") val role: String,
    @SerialName("updated_at") val updatedAt: String
)

