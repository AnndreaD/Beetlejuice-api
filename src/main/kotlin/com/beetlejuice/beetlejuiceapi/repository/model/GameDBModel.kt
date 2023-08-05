package com.beetlejuice.beetlejuiceapi.repository.model

import javax.persistence.*

@Table(name="game")
@Entity
data class  GameDBModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null

){



    @OneToMany()
    @Column(name="gameQuestions")
    private val gameQuestions =  mutableListOf<GameQuestionDBModel>()


    @Transient
    val _gameQuestions = gameQuestions.toList()

    fun addGameQuestion(newItem: GameQuestionDBModel) = this._gameQuestions.plus(newItem)




}