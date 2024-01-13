package com.avicodes.hlchlmultiplatform.data

import com.avicodes.hlchlmultiplatform.models.User

interface MongoRepository {
    suspend fun checkUserExistence(user: User): User?
}