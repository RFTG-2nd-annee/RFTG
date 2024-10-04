# Projet Peach

## Instructions d'installation de la base de données
⚠️ Pour les requêtes suivantes: désactivez la vérification des céls étrangères et utilisez l'import, non l'execution de code direct.
Pour configurer correctement la base de données Peach, veuillez suivre ces étapes dans l'ordre indiqué :

1. Exécutez le script `peach-schema.sql`
   - Ce script crée la structure initiale de la base de données Peach.

2. Exécutez le script `peach-data.sql`
   - Ce script remplit la base de données Peach avec les données de départ.

3. Exécutez le script `migration_peach-schema.sql`
   - Ce script adapte le schéma de la base de données pour le projet Peach.

4. Exécutez le script `migration_peach-data.sql`
   - Ce script ajoute ou modifie les données spécifiques au projet Peach.

Assurez-vous d'exécuter ces scripts dans l'ordre exact mentionné ci-dessus pour garantir l'intégrité et le bon fonctionnement de la base de données Peach. é"""
