# Template Module Ouxy

## 📋 Description
Template de base pour créer des modules Ouxy. Ce template fournit une structure minimale mais fonctionnelle qui peut être adaptée selon les besoins.

## 🛠️ Configuration

1. Clonez ce repository
2. Renommez le package `com.damolks.ouxy.modules.template` selon vos besoins
3. Adaptez les fichiers selon votre cas d'usage
4. Copiez le SDK Ouxy dans `app/libs/ouxy-sdk.jar`

## 📦 Structure

```
app/src/main/
├── java/com/damolks/ouxy/modules/template/
│   ├── TemplateModule.kt          # Module principal
│   ├── data/
│   │   ├── Storage.kt             # Gestion du stockage
│   │   ├── Model.kt               # Modèle de données
│   │   └── templates/             # Templates si nécessaire
│   └── ui/                    
│       ├── ModuleView.kt          # Vue principale
│       └── ModuleViewModel.kt      # ViewModel
└── res/
    └── layout/
        └── template_view.xml       # Layout principal
```

## 🚀 Compilation

```bash
./gradlew createModuleJar
```

Le JAR sera généré dans le dossier `releases/`