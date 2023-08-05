package com.beetlejuice.beetlejuiceapi.controller.model

import com.beetlejuice.beetlejuiceapi.repository.model.GameDBModel
import com.beetlejuice.beetlejuiceapi.repository.model.Language
import com.beetlejuice.beetlejuiceapi.repository.model.QuestionDBModel
import com.beetlejuice.beetlejuiceapi.repository.model.QuestionType
import com.beetlejuice.beetlejuiceapi.controller.model.convertToView
import java.util.UUID

class GameModel (
    val language: Language,
    val questions: Collection<QuestionViewModel>,
    val gameCode: UUID,
)

class GameViewModel (

    val language: Language,
    val questions: Collection<QuestionViewModel>,
    val id: String,
    val gameCode: String,
)
fun GameDBModel.convertToDBModel ( questions: Collection<QuestionDBModel>) = GameDBModel(gameCode = this.gameCode, gameQuestions = questions, language = this.language)

fun GameDBModel.convertToView () = GameViewModel(id= this.id.toString(), language = this.language, questions = this.gameQuestions.map{ QuestionViewModel(it.text, it.language, it.questionType, it.id.toString())  }  )