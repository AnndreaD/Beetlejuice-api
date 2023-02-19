package com.beetlejuice.beetlejuiceapi.repository.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import kotlin.reflect.typeOf


@Table(name="question")
@Entity
 data class QuestionDBModel(

   @Column(name = "text", nullable = false)
   var text: String = "",

    @Column(name="language",)
    @Enumerated(EnumType.ORDINAL)
    var language: Language= Language.NO,

    @Column(name="question_type",)
    @Enumerated(EnumType.ORDINAL)
    var questionType: QuestionType= QuestionType.NHIE

 ){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null
    private set

}




