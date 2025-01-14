# APIs du Module

## APIs du SDK

### ModuleContext
Interface principale fournie par le SDK :
- `context`: Context Android
- `storage`: API de stockage
- `lifecycleScope`: Scope pour les coroutines

### OuxyModule
Interface à implémenter par le module :
- `initialize`: Initialisation
- `getMainView`: Vue principale
- `cleanup`: Nettoyage

### StorageApi
API de stockage persistant :
- `readText`: Lecture de fichier
- `writeText`: Écriture de fichier

## Communication Inter-Modules

### Événements
- `sendEvent`: Envoi d'événements
- `registerEventHandler`: Réception d'événements

## Extension

### Création d'APIs
Comment exposer des fonctionnalités aux autres modules.

### Utilisation d'APIs
Comment consommer les APIs d'autres modules.