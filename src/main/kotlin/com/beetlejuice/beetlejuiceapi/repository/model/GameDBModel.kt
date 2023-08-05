package com.beetlejuice.beetlejuiceapi.repository.model

import javax.persistence.*


@Table(name="game")
@Entity
data class GameDBModel(

    @Column(name = "gameCode", nullable = false)
    var gameCode: String = "",

    @Column(name="language",)
    @Enumerated(EnumType.ORDINAL)
    var language: Language= Language.NO,




@ManyToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
@JoinTable(
    name = "game_questions",
    joinColumns = [JoinColumn(name = "game_id", referencedColumnName = "id")],
    inverseJoinColumns = [JoinColumn(name = "question_id", referencedColumnName = "id")]
)
val gameQuestions: Collection<QuestionDBModel>? = null

){


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null
    private set



}