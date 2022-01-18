

## Intro : 
dans ce projet on a un programme qui fait un tournoi et une league . 

## HowTO
Pour récupérer le projet vous copier le lien SSH puit vous mettez sur le dossier ou vous voulez le mettre dans le pc  et lancer la commande suivante : 
```bash
git clone lien 
```
ou le lien est le lien que vous avez copier 
pour compiler le projet : 
vous mettez dans le fichier de projet et lancer la commande suivante : 
```bash
javac -sourcepath src -d classes src/main/*.java
```
compiler les testes : 
```bash
javac -cp "junit-platform-console-standalone-1.8.1.jar;classes" -sourcepath "src;test" test/util/*.java -d target
```

pour lancer le main de competition vous vous mettez dans le dossier classes et  : 
```bash
java main.Competition 
```
lancer les testes : 
```bash
java -cp "target;junit-platform-console-standalone-1.8.1.jar;." org.junit.runner.JUnitCore   target/CompetitionTest
```

générer les documentations : 
```bash
 javadoc -sourcepath src -d docs -subpackages main util
```

## Presentation d’elements de code saillants : 
- bien connaitre ou utilisé les interfaces et les classe abstraites 

- devisé les roles dans plusieurs méthodes et pas mettre une grande méthode qui fait tout  
 
- bien documenter et bien expliquer le principes des méthodes pour quand on revient les utiliser ou modifier on peut connaitre le concept de ces méthodes meme pour les développeur qui vont utiliser ce code 

- laisser le choix pour ajouter des mise-a-jour dans le future facilement donc faire un projet le plus abstraite possible pour que prochainement on doit pas changer le code mais juste ajouter des classe ( mise a jour ) 

"Competitions Sportives V2"
===========================

introduction sur la Version 2 du projet
----------------------------------------
# On ajoute un nouveau type de competition, "les Master", qui font s’affronter les competiteurs en deux phases, une phase de poules a l’issue de laquelle certains competiteurs sont selectionnes pour disputer la phase finale du tournoi. Les poules sont organisees sous forme de championnat tandis que la phase finale se deroule sous la forme d’un tournoi a elimination directe.

Présentation d'éléments de code saillant
----------------------------------------
- La Classe Master est abstact qui herite de Competition, Master c'est type de Competition.
- On a utiliser le design pattern : strategy pour la sélection des competiteurs
- Design pattern : Observer pour les journalistes et les bookmakers . 


les tests se compile bien et ainsi sur eclipse y aucune erreur  mais on arrive pas à lancer les tests avec le jar .






