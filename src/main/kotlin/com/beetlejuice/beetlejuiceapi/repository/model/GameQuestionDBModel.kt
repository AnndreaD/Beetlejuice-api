package com.beetlejuice.beetlejuiceapi.repository.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table
import kotlin.reflect.typeOf


@Table(name="game_question")
@Entity
data class GameQuestionDBModel(

    @ManyToOne(optional = false)
    var question: QuestionDBModel? = null,

    @Column(name="question_type",)
    @Enumerated(EnumType.ORDINAL)
    var status: GameQuestionStatusEnum= GameQuestionStatusEnum.QUEUED

){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null
        private set

}


