package com.beetlejuice.beetlejuiceapi.controller

import com.beetlejuice.beetlejuiceapi.controller.model.*
import com.beetlejuice.beetlejuiceapi.repository.GameRepository
import com.beetlejuice.beetlejuiceapi.repository.QuestionRepository
import com.beetlejuice.beetlejuiceapi.repository.model.QuestionDBModel
import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/game")
class GameController(val repository : GameRepository) {

    @PostMapping()
    fun createGame(@RequestBody game: GameModel): GameViewModel {
        System.out.println("one in the books")
        //get questions based on id here to pass on
       return  repository.save(game.convertToDBModel()).convertToView()
    }

    @GetMapping()
    fun getGame(id: UUID):GameViewModel {
        return repository.findByIdOrNull(id).convertToView()

    }

}

