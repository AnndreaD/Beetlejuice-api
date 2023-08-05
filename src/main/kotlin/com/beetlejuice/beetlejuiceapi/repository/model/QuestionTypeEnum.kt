package com.beetlejuice.beetlejuiceapi.repository.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table




public enum class QuestionType(val questionType: String){
    DILEMMA("DILEMMA"),
    NHIE("NHIE"), //Never have i ever
    POINT("POINT"),
    THUMB("THUMB")// Thumb up or down
}




