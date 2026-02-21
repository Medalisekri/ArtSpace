<img width="1920" height="1080" alt="Screenshot (147)" src="https://github.com/user-attachments/assets/948605dc-a276-4c2b-9cca-6a2cc352df9a" />Art Space 

Une application Android de galerie d'art virtuelle permettant de naviguer entre différentes œuvres, développée avec **Jetpack Compose**.

* Fonctionnalités :

- Affichage d'œuvres d'art avec leur titre et description
-  Navigation entre les œuvres via les boutons "Previous" et "Next"
- Navigation circulaire (retour au début après la dernière œuvre)

* Technologies utilisées :

- Langage : Kotlin
- Framework UI :Jetpack Compose & Material 3
- Architecture :Gestion d'état avec `remember` et `mutableStateOf`

* Comment ça fonctionne ?

1. L'application affiche une œuvre d'art avec son titre et sa description
2. Appuyez sur "Next" pour passer à l'œuvre suivante
3. Appuyez sur "Previous" pour revenir à l'œuvre précédente
4. La navigation est circulaire : après la dernière œuvre, on revient à la première

* Œuvres disponibles :

| Œuvre | Description |

|  Bridge | Une œuvre représentant un pont |
| Flower | Une peinture florale |

* Structure du projet

com.example.artspace/
├── MainActivity.kt          # Point d'entrée de l'application
├── res/drawable/
│   ├── bridge.png           # Image du pont
│   └── flowpaint.png        # Image de la fleur
└── ui/theme/
    └── ArtSpaceTheme.kt     # Thème de l'application


## Composables principaux

| Composable | Description |

| `ArtWithImageAndText` | Affiche l'œuvre courante avec titre, description et boutons de navigation |


* Captures d'écran :
  
<img width="1920" height="1080" alt="Screenshot (144)" src="https://github.com/user-attachments/assets/e0f86f5c-4a17-4bce-a986-b59afdc572d4" />

<img width="1920" height="1080" alt="Screenshot (145)" src="https://github.com/user-attachments/assets/691ec5ca-487b-4d5a-aa7f-e050bbb515cb" />
<img width="1920" height="1080" alt="Screenshot (146)" src="https://github.com/user-attachments/assets/692a1a73-9d37-4453-a3c8-1abf793d9069" />


<img width="1920" height="1080" alt="Screenshot (147)" src="https://github.com/user-attachments/assets/d6e15bfd-308a-4cd2-b61b-cc191ad2c614" />


