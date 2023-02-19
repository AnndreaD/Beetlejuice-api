package com.beetlejuice.beetlejuiceapi.controller

import com.beetlejuice.beetlejuiceapi.controller.model.QuestionModel
import com.beetlejuice.beetlejuiceapi.controller.model.QuestionViewModel
import com.beetlejuice.beetlejuiceapi.controller.model.convertToDBModel
import com.beetlejuice.beetlejuiceapi.controller.model.convertToView
import com.beetlejuice.beetlejuiceapi.repository.QuestionRepository
import com.beetlejuice.beetlejuiceapi.repository.model.QuestionDBModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/question")
class QuestionController(val repository : QuestionRepository) {

    @PostMapping()
    fun addQuestions(@RequestBody question: QuestionModel): QuestionViewModel {
        System.out.println("one in the books")
       return  repository.save(question.convertToDBModel()).convertToView()
    }

    @GetMapping()
    fun getQuestions():List<QuestionViewModel> {
        return repository.findAll().map{it.convertToView()}

    }
}

