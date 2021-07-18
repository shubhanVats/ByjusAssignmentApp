package com.example.byjusassignment.model

import java.io.Serializable

data class QuestionBase(

    @SerializedName("assessmentId") val assessmentId: String,
    @SerializedName("assessmentName") val assessmentName: String,
    @SerializedName("subject") val subject: String,
    @SerializedName("duration") val duration: Int,
    @SerializedName("questions") val questions: List<Questions>,
    @SerializedName("totalMarks") val totalMarks: Int
) : Serializable

data class Questions(

    @SerializedName("id") val id: String,
    @SerializedName("qno") val qno: Int,
    @SerializedName("text") val text: String,
    @SerializedName("mcOptions") val mcOptions: List<String>,
    @SerializedName("type") val type: String,
    @SerializedName("marks") val marks: Int
) : Serializable