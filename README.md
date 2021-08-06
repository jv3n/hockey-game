# Test Développeur JAVA/Spring intermédiaire

## Objectif du test

Votre objectif pour ce test est de créer un API Rest avec Java et Spring Boot pour ajouter et obtenir les joueurs et les informations de l'équipe de Hockey des Canadiens du Montréal.

**Vous devez créer les endpoints suivants dans l'API:**

-   Un GET pour obtenir l'équipe en fonction de l'année dans la base de données en mémoire (H2).
-   Un POST pour t'ajouter en tant que nouveau joueur de l'équipe d'une année dans la base de données en mémoire (H2).
-   Un PUT pour mettre à jour le capitaine d'une année

## **Présomptions**

-   Ne vous souciez pas de valider l'entrée de l'utilisateur, vous pouvez présumer que la requête sera toujours valide.
-   Il n'est pas nécessaire d'implémenter un mécanisme de sécurité.
-   Il n'est pas nécessaire d'écrire des tests unitaires.

## Critères

-   3 endpoints REST fonctionnels
-   Structure des classes
-   Qualité du code
-   Utilisation des meilleurs pratiques de développement

## Outils à utiliser

Le projet contient déjà les dépendances Maven requises et la configuration nécessaire pour H2.

Vous avez aussi, optionnellement, la possibilité d'utiliser les librairies Lombok et MapStruct si vous le désirez (Hors kotlin).

-   Java 11 ou Kotlin
-   Maven
-   Spring Boot
-   Spring Data JPA
-   Base de donnée en mémoire H2
-   Lombok (Optionnel)
-   Mapstruct (Optionnel)

## Modèle

Team

```
{
    "id": long,
    "coach": string
    "year" : long
    "players": [
        {
            "number": long,
            "name": string,
            "lastname": string,
            "isCaptain" : boolean
        }
    ]
}

```

## Endpoints

### GET /api/team/{year}

-   Requête: Year dans l'URI
-   Réponse: Objet Team (Voir modèle ci-dessus)
-   Status: 200 OK


    http://localhost:8080/api/team/2020
    {
       "id":2,
       "coach":"Dominique Ducharme",
       "year":"2020",
       "players":[
          {
             "number":31,
             "name":"Carey",
             "lastname":"Price",
             "position":"goaltender"
          },
          {
             "number":14,
             "name":"Nick",
             "lastname":"Suzuki",
             "position":"forward"
          },
          {
             "number":15,
             "name":"Jesperi",
             "lastname":"Kotkaniemi",
             "position":"forward"
          },
          {
             "number":71,
             "name":"Jake",
             "lastname":"Evans",
             "position":"forward"
          },
          {
             "number":27,
             "name":"Alexander",
             "lastname":"Romanov",
             "position":"defenseman"
          },
          {
             "number":6,
             "name":"Shea",
             "lastname":"Weber",
             "position":"defenseman",
             "isCaptain" : true
          }
       ]
    }

    http://localhost:8080/api/team/2019
    {
       "id":1,
       "coach":"Dominique Ducharme",
       "year":"2019",
       "players":[
          {
             "number":31,
             "name":"Carey",
             "lastname":"Price",
             "position":"goaltender"
          },
          {
             "number":14,
             "name":"Nick",
             "lastname":"Suzuki",
             "position":"forward"
          },
          {
             "number":15,
             "name":"Jesperi",
             "lastname":"Kotkaniemi",
             "position":"forward"
          },
          {
             "number":71,
             "name":"Jake",
             "lastname":"Evans",
             "position":"forward"
          },
          {
             "number":27,
             "name":"Alexander",
             "lastname":"Romanov",
             "position":"defenseman"
          },
          {
             "number":6,
             "name":"Shea",
             "lastname":"Weber",
             "position":"defenseman",
             "isCaptain" : true
          }
       ]
    }

### POST /api/team/{Year}

-   Requête: Objet Joueur dans le body
-   Réponse: Objet Joueur crée
-   Status: 201 CREATED


```
http://localhost:8080/api/player --header "Content-Type:application/json"

{
  "number":99,
  "name":"Marion",
  "lastname":"Félix",
  "position":"forward",
  "isCaptain" : false
}

```

### PUT /api/player/captain/{ID}

-   Requête: ID du joueur dans l'URI
-   Réponse: Objet Player
-   Status: 200 OK

## Validation des endpoints

Vous pouvez utiliser la collection postman incluse dans le projet si vous désirez valider votre API avec des assertions.

Celle-ci se retrouve dans le dossier **postman** du projet.

## Soumettre le test

Une fois terminé, veuillez créer un nouveau dépot sur GitHub et l'envoyer par courriel.

**Bonne chance et bon game ! 🏒**

------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------
# Lancement de l'appli en local

## Docker

Préalablement installer [Docker](https://docs.docker.com/docker-for-windows/install/) sur le poste de dev puis : 
 - Ouvrir un terminal dans ```docker/docker-compose.yml```
 - Taper la commande ```docker-compose up -d```, permet de créer le container Postegres.

Le docker-compose comprend également un Portainer pour l'administration des container. <br>
Quand les container sont lancés, on peut s'y rendre sur ```http://localhost:9000/#/dashboard```

## Maven

A la racine du projet ouvrir un terminal et faire un ```mvn clean install -DskipTests```<br>
Puis démarrer le back.

## Acces à la base Postgres

![Impossible de charger l'image](./x_readme-screens/screen1.png?raw=true)

Avec mot de passe : ```root```

## React

Installer [Node](https://nodejs.org/en/download/). <br>
A la racine de la webapp, dans webapp, ouvrir un terminal :
 - Installer Yarn ```npm install --global yarn```
 - dl les dependences Node ```yarn install```
 - Lancer le front ```yarn start```
 - Acces a l'appli sur le port [3000](https://localhost:3000)