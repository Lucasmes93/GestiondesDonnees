# Gestion des Données

Ce projet Android est conçu pour gérer des données utilisateurs avec **Room Database**, tout en mettant en œuvre des concepts modernes comme l'architecture **MVVM** et l'observation des données en temps réel avec **LiveData**.

---

## 🎯 Fonctionnalités

- **CRUD Utilisateurs** : Ajouter, modifier, supprimer et afficher les utilisateurs avec Room.  
- **Observation des données** : Mettez à jour l'interface utilisateur automatiquement grâce à LiveData.  
- **Importation JSON** : Pré-remplissez la base de données depuis un fichier JSON.  
- **Préférences utilisateur** : Personnalisez le comportement de l'application.  

---

## 🛠️ Technologies et outils utilisés

- **Kotlin** : Langage principal de développement.  
- **Room Database** : Gestion de la base de données locale.  
- **LiveData** : Observation réactive des données.  
- **Architecture MVVM** : Séparation des responsabilités pour un code clair et maintenable.  
- **AndroidX** : Bibliothèques modernes pour Android.

---

## 🚀 Installation

1. Clonez le dépôt sur votre machine locale :  
   ```bash
   git clone https://github.com/Lucasmes93/GestiondesDonnees.git
Ouvrez le projet dans Android Studio.
Synchronisez les dépendances Gradle.
Lancez l'application sur un émulateur ou un appareil Android (API minimum : 21).
📂 Structure du projet
Entités Room : Modèle de données (classe User.kt).
DAO : Interface pour les opérations sur la base de données (classe UserDao.kt).
Base de données : Singleton pour accéder à Room (UserDatabase.kt).
Repository : Gestion centralisée des données (UserRepository.kt).
UI : Interface utilisateur connectée via LiveData (MainActivity.kt).
Préférences : Fragment pour gérer les préférences (SettingsFragment.kt).
🤝 Contribuer au projet
Forkez ce dépôt.
Créez une branche pour vos modifications :
bash
Copier le code
git checkout -b feature/ma-nouvelle-fonctionnalite
Faites vos modifications et commitez-les :
bash
Copier le code
git commit -m "Ajout d'une nouvelle fonctionnalité"
Poussez vos modifications vers votre fork :
bash
Copier le code
git push origin feature/ma-nouvelle-fonctionnalite
Ouvrez une Pull Request pour intégrer vos changements.
👥 Auteurs
Ce projet a été élaboré par :

Lucas
Iles
Grégoire
