package com.beetlejuice.beetlejuiceapi.repository

import com.beetlejuice.beetlejuiceapi.repository.model.GameDBModel
import com.beetlejuice.beetlejuiceapi.repository.model.QuestionDBModel
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface GameRepository : CrudRepository<GameDBModel, UUID>