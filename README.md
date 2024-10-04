# Projet scolaire RFTG


## Contexte du Projet RFTG (Return from the Graveyard)

Le projet RFTG est une initiative innovante lancée par M. Mac Fly, responsable de l'animation du village et ancien informaticien des années 80. Malgré un changement de carrière dû à un accident d'overboard, M. Mac Fly reste passionné par la technologie et a déjà posé les bases du projet.

### Éléments clés du projet :

1. **Base de données Peach** :
   - Initialement nommée "Sakila" par M. Mac Fly
   - Renommée en "Peach" pour le projet RFTG
   - Servira de cœur au système

2. **Mario et Luigi** :
   - Systèmes périphériques gravitant autour de Peach

3. **Toad** :
   - Webservice REST
   - Interface entre Mario/Luigi et Peach
   - Organise les échanges entre les systèmes de location

4. **Mario** :
   - Développé comme application web
   - Évite les problèmes de déploiement sur machines physiques distantes
   - Interface administrative pour les gestionnaires

5. **Luigi** :
   - Système complémentaire de location
   - Fonctionne en synergie avec Mario
   - Interface utilisateur pour les clients

### Structure du projet :

- **Peach** : Base de données
- **Mario** : Application web de gestion
- **Luigi** : Système complémentaire de location
- **Toad** : Webservice REST



## Installation avec Git

Pour installer le projet RFTG à l'aide de Git, suivez ces étapes :

1. **Cloner le dépôt** :
   Ouvrez un terminal et exécutez la commande suivante dans le répertoire de votre choix :
   ```
   git clone https://github.com/votre-nom-utilisateur/RFTG.git
   ```

2. **Accéder au répertoire du projet** :
   ```
   cd RFTG
   ```

3. **Pour ajouter les modifications** :
   ```
   git add *
   ```

4. **Pour commiter les modifications** :
   ```
   git commit -m "Description des modifications"
   ```

5. **Pour push les modifications** :
   ```
   git push
   ```


Si vous êtes dans VSCode, vous pouvez utiliser la commande 
```
git add *; git commit -m "Description des modifications";git push
```

pour ajouter, commiter et push les modifications en une seule commande.

