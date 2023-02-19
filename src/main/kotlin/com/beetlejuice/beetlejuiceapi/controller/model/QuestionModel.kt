package com.beetlejuice.beetlejuiceapi.controller.model

import com.beetlejuice.beetlejuiceapi.repository.model.Language
import com.beetlejuice.beetlejuiceapi.repository.model.QuestionDBModel
import com.beetlejuice.beetlejuiceapi.repository.model.QuestionType

class QuestionModel (
    val language: Language,
    val questionType: QuestionType,
    val text: String,
    )

class QuestionViewModel (
    val text: String,
    val language: Language,
    val questionType: QuestionType,
    val id: String,
)

fun QuestionModel.convertToDBModel () = QuestionDBModel(text = this.text, questionType = this.questionType, language = this.language)

fun QuestionDBModel.convertToView () = QuestionViewModel(id= this.id.toString(), text = this.text, questionType = this.questionType, language = this.language )