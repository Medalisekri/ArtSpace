Art Space 

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

<img width="1766" height="1004" alt="Screenshot (146)" src="https://github.com/user-attachments/assets/16b08690-494a-4bff-aa9e-bd85d8a38c95" />
<img width="1749" height="1019" alt="Screenshot (147)" src="https://github.com/user-attachments/assets/98672c02-2fcd-4fea-baf4-70a911def105" />



