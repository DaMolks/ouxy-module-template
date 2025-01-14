# Exemples d'Utilisation

## Module de Base

```kotlin
class ExampleModule : OuxyModule {
    private lateinit var context: ModuleContext
    private lateinit var mainView: LinearLayout
    
    override fun initialize(context: ModuleContext) {
        this.context = context
        this.mainView = LinearLayout(context.context)
    }
    
    override fun getMainView(): View = mainView
    
    override fun cleanup() {}
}
```

## Stockage de Données

```kotlin
class Storage(private val storage: StorageApi) {
    suspend fun saveData(data: String) {
        storage.writeText("data.txt", data)
    }
    
    suspend fun getData(): String? {
        return try {
            storage.readText("data.txt")
        } catch (e: Exception) {
            null
        }
    }
}
```

## Communication

```kotlin
// Envoi d'événement
context.sendEvent("data_updated", mapOf(
    "type" to "update",
    "data" to "new_value"
))

// Réception d'événement
context.registerEventHandler("data_request") { data ->
    val type = data["type"] as? String
    // Traitement
}
```