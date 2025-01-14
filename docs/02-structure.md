# Structure du Module

## Organisation des Fichiers

```
app/src/main/
├── java/com/damolks/ouxy/modules/template/
│   ├── TemplateModule.kt          # Point d'entrée
│   ├── data/                      # Couche données
│   │   ├── Storage.kt
│   │   ├── Model.kt
│   │   └── templates/
│   └── ui/                        # Couche UI
│       ├── ModuleView.kt
│       └── ModuleViewModel.kt
└── res/
    └── layout/
        └── template_view.xml
```

## Composants Principaux

### TemplateModule
Point d'entrée du module, implémente l'interface `OuxyModule`.

### Stockage
Gestion de la persistance des données via l'API de stockage Ouxy.

### Interface Utilisateur
Suit le pattern MVVM avec ViewBinding.

## Cycle de Vie

1. Initialisation (`initialize`)
2. Configuration de la vue (`getMainView`)
3. Nettoyage (`cleanup`)

## Communication

- Via les événements Ouxy
- Via l'API de stockage
- Via les interfaces du SDK