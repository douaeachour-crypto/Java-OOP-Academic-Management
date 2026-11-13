# Système de Gestion Académique & Sportive (Java POO)

Projet développé en Java sous Eclipse mettant en pratique les principes fondamentaux de la Programmation Orientée Objet.

## Architecture du projet
* **`Personne` (Classe mère) :** Gestion des informations de base (nom, prénom, date de naissance) avec surcharge de constructeurs.
* **`Etudiant` & `Professeur` :** Héritage de `Personne` avec attributs spécifiques (CNE, filière, niveau, spécialité, matière) et redéfinition de `toString()`.
* **`Filiere` :** Agrégation d'un responsable (`Professeur`) et gestion dynamique d'une liste d'`Etudiant` via `ArrayList` et paramètres variables (`varargs`).
* **`Date` :** Validation et formatage des dates.
* **`EquipeFoot` :** Illustration du polymorphisme en regroupant des objets de type `Personne` (`Etudiant` et `Professeur`) au sein d'une même collection.

## Technologies
* Java (JDK)
* Eclipse IDE
