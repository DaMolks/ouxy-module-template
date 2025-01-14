package com.damolks.ouxy.modules.template.data

import com.damolks.ouxy.module.StorageApi
import kotlinx.serialization.json.Json

class Storage(private val storage: StorageApi) {
    private val json = Json { prettyPrint = true }
    
    suspend fun saveData(data: String) {
        storage.writeText("template.data", data)
    }
    
    suspend fun getData(): String? {
        return try {
            storage.readText("template.data")
        } catch (e: Exception) {
            null
        }
    }
}